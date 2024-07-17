package LLD.LibraryManagementSystem.service;

import LLD.LibraryManagementSystem.domain.Book;
import LLD.LibraryManagementSystem.domain.Issue;
import LLD.LibraryManagementSystem.domain.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserManagement {

    List<User> userList;

    private static UserManagement instance;

    private UserManagement() {
        this.userList = new ArrayList<>();
    }

    public static UserManagement getInstance(){
        if(instance==null) return new UserManagement();
        else return instance;
    }

    public void addUser(User user){
        userList.add(user);
    }
    public void removeUser(User user){
        userList.remove(user);
    }

    public void issueBook(Book book, User user){
        user.getIssueCard().addIssueToCard(book, user.getId());
    }

    public void completeIssue(User user, Issue issue){
        user.getIssueCard().updateIssueToCompleted(issue);
    }

    public Optional<User> getUserById(String id) {
        return userList.stream().filter(user -> user.getId()==id).findFirst();
    }
}
