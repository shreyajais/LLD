package LLD.StackOverflow;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Comment {
    private final String id;
    private final String text;
    private final User author;
    private Timestamp createdAt;

    public Comment(String text, User author, Timestamp createdAt) {
        this.id = "COMMENT" + author.getId() + Timestamp.valueOf(LocalDateTime.now());
        this.text = text;
        this.author = author;
        this.createdAt = createdAt;
    }
}
