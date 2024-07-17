package LLD.DigitalWalletSystem;

import java.util.ArrayList;
import java.util.List;

public class User {

    private final String id;
    private final String username;
    private final String email;
    private final String contact;
    private List<Account> accountList;

    public User(String id, String username, String email, String contact) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.contact = contact;
        this.accountList = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getContact() {
        return contact;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void addAccount(Account account){
        this.accountList.add(account);
    }
}
