package LLD.CourseRegisterationSystem;

import java.util.ArrayList;
import java.util.UUID;

public class Course {
    public final  String id;
    public final String name;
    public final String instructorName;
    public final int max_capacity;
    public int studentsEnrolled;

    public Course(String name, String instructorName, int max_capacity) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.instructorName = instructorName;
        this.max_capacity = max_capacity;
        this.studentsEnrolled = 0;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public int getMax_capacity() {
        return max_capacity;
    }

    public int getStudentsEnrolled() {
        return studentsEnrolled;
    }

    public void addStudent(){
        this.studentsEnrolled += 1;
    }
}
