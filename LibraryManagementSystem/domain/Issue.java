package LLD.LibraryManagementSystem.domain;

import java.time.LocalDateTime;
import java.util.UUID;

public class Issue {
    final String id;
    final Book book;
    final LocalDateTime startDateTime;
    LocalDateTime endDateTime;
    IssueStatus issueStatus;
    final String userId;

    public Issue(Book book, String userId) {
        this.id = UUID.randomUUID().toString();
        this.book = book;
        this.startDateTime = LocalDateTime.now();
        this.endDateTime = LocalDateTime.now();
        this.issueStatus = IssueStatus.IN_PROGRESS;
        this.userId = userId;
    }

    public void setEndDateTime() {
        this.endDateTime = LocalDateTime.now();
    }

    public void setIssueStatusToCompleted() {
        this.issueStatus = IssueStatus.COMPLETED;
    }

    public Book getBook() {
        return book;
    }
}
