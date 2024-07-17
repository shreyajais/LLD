package LLD.LibraryManagementSystem.domain;

import java.util.List;
import java.util.Optional;

public class IssueCard {
    String id;
    List<Issue> issueList;

    public void addIssueToCard(Book book, String userId){
        Issue issue = new Issue(book, userId);
        issueList.add(issue);
    }
    public Optional<Issue> getIssue(Book book){
        return issueList.stream().filter(issue -> issue.book.id == book.id).findFirst();
    }
    public void updateIssueToCompleted(Issue issue){
        issue.setIssueStatusToCompleted();
        issue.setEndDateTime();
    }

}
