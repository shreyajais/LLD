package LLD.CourseRegisterationSystem;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.UUID;

public class Registration {
    public final String id;
    public final String courseId;
    public  final String studentId;
    public final Timestamp timestamp;

    public Registration(String courseId, String studentId) {
        this.id = "REG" + UUID.randomUUID().toString() + studentId.toUpperCase() + courseId + LocalDateTime.now().toString();
        this.courseId = courseId;
        this.studentId = studentId;
        this.timestamp = new Timestamp(System.currentTimeMillis());
    }

    public String getId() {
        return id;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getStudentId() {
        return studentId;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }
}
