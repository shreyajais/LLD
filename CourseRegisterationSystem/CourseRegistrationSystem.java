package LLD.CourseRegisterationSystem;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CourseRegistrationSystem {

    public static CourseRegistrationSystem courseRegistrationSystem;
    public Map<String, Student> studentList;
    public Map<String, Course> courseList;
    public Map<String, Registration> registrationList;

    public CourseRegistrationSystem() {
        this.studentList = new ConcurrentHashMap<>();
        this.courseList = new ConcurrentHashMap<>();
        this.registrationList = new ConcurrentHashMap<>();
    }

    public static synchronized  CourseRegistrationSystem getInstance(){
        if(courseRegistrationSystem != null) return courseRegistrationSystem;
        else return new CourseRegistrationSystem();
    }


    public synchronized void makeRegistration(String studentId, String courseId){
        Student student = studentList.get(studentId);
        Course course = courseList.get(courseId);
        if(student!= null && course!=null){
            if(course.getMax_capacity() > course.getStudentsEnrolled()){
                Registration registration = new Registration(studentId, courseId);
                student.addListOfCoursesEnrolled(course);
                course.addStudent();
                addRegistration(registration);
            } else System.out.println("Batch is full");
        } else System.out.println("Bad data");
    }

    public void addStudent(Student student){
        studentList.put(student.getId(), student);
    }

    public void addCourse(Course course){
        courseList.put(course.getId(), course);
    }

    public void addRegistration(Registration registration){
        registrationList.put(registration.getId(), registration);
    }

    public Map<String, Student> getStudentList() {
        return studentList;
    }

    public Map<String, Course> getCourseList() {
        return courseList;
    }

    public Map<String, Registration> getRegistrationList() {
        return registrationList;
    }
}
