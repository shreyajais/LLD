package LLD.LibraryManagementSystem.service;

import LLD.LibraryManagementSystem.domain.Book;
import LLD.LibraryManagementSystem.domain.Issue;
import LLD.LibraryManagementSystem.domain.User;

public class BookIssueManagement {

    private BookManagement bookManagement;
    private  UserManagement userManagement;

    private static BookIssueManagement instance;

    private BookIssueManagement() {
        this.bookManagement = BookManagement.getInstance();
        this.userManagement = UserManagement.getInstance();
    }

    public BookIssueManagement getInstance(){
        if(instance==null) return new BookIssueManagement();
        else return instance;
    }
    public void issueBook(Book book, User user) {
        bookManagement.changeAvailableCount(book, -1);
        userManagement.issueBook(book, user);
    }

    private void completeIssue(Issue issue, User user){
        bookManagement.changeAvailableCount(issue.getBook(), 1);
        userManagement.completeIssue(user, issue);
    }

}
