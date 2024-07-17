package LLD.LibraryManagementSystem;

import LLD.LibraryManagementSystem.domain.Book;
import LLD.LibraryManagementSystem.domain.User;
import LLD.LibraryManagementSystem.service.BookIssueManagement;
import LLD.LibraryManagementSystem.service.BookManagement;
import LLD.LibraryManagementSystem.service.UserManagement;
import kotlin.jvm.Throws;

import java.util.Optional;

public class LibraryManagement {

    BookIssueManagement bookIssueManagement;
    UserManagement userManagement;
    BookManagement bookManagement;


    private LibraryManagement() {
        this.bookIssueManagement = bookIssueManagement.getInstance();
        this.userManagement = userManagement.getInstance();
        this.bookManagement = bookManagement.getInstance();
    }


    public void displayAllAvailableBooks(){
        bookManagement.getAvailableBook();
    }

    public boolean isBookAvailable(Book book){
        return bookManagement.isBookAvailable(book);
    }

    public Optional<User> getUserById(String id){
        Optional<User> user =  userManagement.getUserById(id);
        if(user.isEmpty()){
            throw new RuntimeException("user not found");
        }
        return user;
    }

    public void issueBook(Book book, User user){
        if(!isBookAvailable(book)){
            System.out.println("Book unavailable");
        }
        bookIssueManagement.issueBook(book, user);
    }
}
