package LLD.LibraryManagementSystem.domain;

public class User {
    String id;
    String name;
    IssueCard issueCard;

    public IssueCard getIssueCard() {
        return issueCard;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
