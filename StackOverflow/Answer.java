package LLD.StackOverflow;

import java.util.ArrayList;
import java.util.List;

public class Answer {

    private final String id;
    private final String description;
    private final User author;
    private final Question question;
    private List<Tag> tagList;

    private List<Comment> commentList;
    private int votes;

    public Answer(String id, String description, User author, Question question) {
        this.id = id;
        this.description = description;
        this.question = question;
        this.author = author;
        this.commentList = new ArrayList<>();
        this.tagList = new ArrayList<>();
        this.votes = 0;
    }

    public void addTags(Tag tag){
        this.tagList.add(tag);
    }

    public void upvote(){
        this.votes++;
    }
    public void downVote(){
        this.votes--;
    }

    public Question getQuestion() {
        return question;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public User getAuthor() {
        return author;
    }
}
