package LLD.StackOverflow;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {
    private final String id;
    private final String userName;
    private final String password;

    private final String email;
    private int reputation;

    public User(String userName, String password, String email) {
        this.id = "USER"+ userName + UUID.randomUUID().toString();
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.reputation = 0;
    }

    public String getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public int getReputation() {
        return reputation;
    }

    public void setReputation(int reputation) {
        this.reputation = reputation;
    }
}
