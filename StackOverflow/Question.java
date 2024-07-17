package LLD.StackOverflow;

import java.util.ArrayList;
import java.util.List;

public class Question {

    private final String id;
    private String topic;
    private String description;

    private final User author;
    private List<Answer> answerList;
    private List<Comment> commentList;
    private List<Tag> tagsList;
    private int vote;

    public Question(String id, String topic, String description, User user) {
        this.id = id;
        this.topic = topic;
        this.description = description;
        this.author = user;
        this.answerList = new ArrayList<>();
        this.commentList = new ArrayList<>();
        this.tagsList = new ArrayList<>();
        this.vote = 0;
    }
    public String getId() {
        return id;
    }

    public String getTopic() {
        return topic;
    }

    public String getDescription() {
        return description;
    }

    public User getAuthor() {
        return author;
    }

    public List<Answer> getAnswerList() {
        return answerList;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public List<Tag> getTagsList() {
        return tagsList;
    }

    public int getVote() {
        return vote;
    }

    public void addVote(){
        this.vote++;
    }
    public void addTags(Tag tag){
        this.tagsList.add(tag);
    }
    public void addAnswer(Answer answer){
        this.answerList.add(answer);
    }

    public void addComments(Comment comment){
        this.commentList.add(comment);
    }

}
