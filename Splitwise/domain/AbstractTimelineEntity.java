package LLD.Splitwise.domain;

import java.time.LocalDateTime;

public abstract class AbstractTimelineEntity {
    LocalDateTime createdAt;
    LocalDateTime updatedAt;
    User updatedBy;

    public AbstractTimelineEntity(User updatedBy) {
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
        this.updatedBy = updatedBy;
    }
}
