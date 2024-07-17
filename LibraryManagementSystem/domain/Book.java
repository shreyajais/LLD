package LLD.LibraryManagementSystem.domain;

import java.util.UUID;

public class Book {
    String id;
    String name;
    String author;
    int count;
    int availableCount;
    int issueCount;

    public Book(String name, String author, int count) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.author = author;
        this.count = count;
        this.availableCount = count;
        this.issueCount = 0;
    }

    public boolean isBookAvailable(){
        return availableCount > 0;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void changeAvailableCount(int count){
        availableCount+= count;
    }
}
