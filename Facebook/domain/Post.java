package LLD.Facebook.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Post {
    String id;
    String imageOrDocumentUrl;
    String text;
    Integer like;

    PrivacyType privacyType;
    List<Comment> comments;
    LocalDateTime createdAt;

    public Post(String imageOrDocumentUrl, String text) {
        this.id = UUID.randomUUID().toString();
        this.imageOrDocumentUrl = imageOrDocumentUrl;
        this.text = text;
        this.like = 0;
        this.comments = new ArrayList<>();
        this.createdAt = LocalDateTime.now();
    }

    public Integer getLike() {
        return like;
    }

    public void increaseLike() {
        this.like = getLike()+ 1;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(Comment comment) {
        getComments().add(comment);
    }
}
