package LLD.StackOverflow;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class StackOverflowSystem {

    private static StackOverflowSystem stackOverflowSystem;
    private Map<String, User> userList;
    private Map<String, Question> questionList;
    private Map<String, List<Question>> taggedQuestionsList;

    private StackOverflowSystem(){
        this.userList = new ConcurrentHashMap<>();
        this.questionList = new ConcurrentHashMap<>();
        this.taggedQuestionsList = new ConcurrentHashMap<>();
    }
    public synchronized StackOverflowSystem getInstance(){
        if(stackOverflowSystem== null){
            this.stackOverflowSystem = new StackOverflowSystem();
        }
        return stackOverflowSystem;
    }
    public void registerUser(User user){
        this.userList.put(user.getId(), user);
    }

    public User loginUser(String username, String password){
        Optional<User> user = this.userList.values().stream().filter((user1)-> user1.getUserName()== username).findFirst();
        if(user.isEmpty()){
            System.out.println("User not found !");
            return null;
        }
        else{
            if(user.get().getUserName() == password){
                System.out.println("User logged ine !");
                return user.get();
            }
            System.out.println("Password incorrect !");
            return null;
        }
    }

    public synchronized void postQuestion(Question question){
        this.questionList.put(question.getId(), question);
        for(Tag tag: question.getTagsList()){
            List<Question> listTaggedQuestion = this.taggedQuestionsList.getOrDefault(tag.getName(), new ArrayList<>());
            listTaggedQuestion.add(question);
            this.taggedQuestionsList.put(tag.getName(), listTaggedQuestion);
        }
    }

    public void postAnswer(Answer answer){
        answer.getQuestion().addAnswer(answer);
    }

    public synchronized void voteAnswer(Answer answer, int value){
        answer.setVotes(value);
        updateUserReputation(answer.getAuthor(), value);
    }

    /**
     * The updateUserReputation method safely updates a user's reputation by adding a specified value to their current reputation.
     * The use of synchronized ensures that the operation is thread-safe, preventing concurrent modifications to the user's reputation
     * from causing inconsistencies.
     * **/
    private void updateUserReputation(User user, int value){
        synchronized (user){
            user.setReputation(user.getReputation() + value);
        }
    }

    public List<Question> searchQuestions(String query){
        List<Question> result = new ArrayList<>();
        for(Question ques: this.questionList.values()){
            if(ques.getTopic().contains(query) || ques.getDescription().contains(query))
                result.add(ques);
        }
        return result;
    }

    public List<Question> getQuestionsByTag(String tagName){
        return this.taggedQuestionsList.getOrDefault(tagName, new ArrayList<>());
    }

    public List<Question> getQuestionsByUser(User user){
        return this.questionList.values().stream().filter((question -> question.getAuthor()==user)).toList();
    }
}
