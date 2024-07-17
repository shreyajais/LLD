package LLD.Facebook.domain;

import java.util.UUID;

public class Comment {
    String id;
    String text;
    UsersProfile user;

    public Comment(String text, UsersProfile user) {
        this.id = UUID.randomUUID().toString();
        this.text = text;
        this.user = user;
    }
}
