package LLD.CourseRegisterationSystem;

import java.util.List;

public class Student {
    public String id;
    public String name;
    public String contact;
    public String email;
    public List<Course> listOfCoursesEnrolled;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public String getEmail() {
        return email;
    }

    public List<Course> getListOfCoursesEnrolled() {
        return listOfCoursesEnrolled;
    }

    public void addListOfCoursesEnrolled(Course course) {
        listOfCoursesEnrolled.add(course);
    }
}
