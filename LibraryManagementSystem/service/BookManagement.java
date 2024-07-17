package LLD.LibraryManagementSystem.service;

import LLD.LibraryManagementSystem.domain.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookManagement {

    List<Book> bookList;

    private static BookManagement instance;

    private BookManagement() {
        this.bookList = new ArrayList<>();
    }

    public static BookManagement getInstance(){
        if(instance==null) return new BookManagement();
        else return instance;
    }

    public void addBookToList(String name, String author, int count){
        Book book = new Book(name, author, count);
        bookList.add(book);
    }

    public boolean isBookAvailable(Book book){
        return book.isBookAvailable();
    }
    public List<Book> getAvailableBook(){
        List<Book> availableBooks = new ArrayList<>();
        bookList.forEach(book -> {if(book.isBookAvailable()) availableBooks.add(book);});
        return availableBooks;
    }

    public void changeAvailableCount(Book book, int count) {
        book.changeAvailableCount(count);
    }
}
