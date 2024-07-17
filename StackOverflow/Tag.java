package LLD.StackOverflow;

import java.util.UUID;

public class Tag {
    private  final String id;
    private final String name;

    public Tag(String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
