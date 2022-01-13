package exercises.Class3;

import java.util.ArrayList;

public class Course {
    private ArrayList<Student> roster;
    private String instructor;
    private String courseName;

    public Course(ArrayList<Student> roster, String instructor, String courseName) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.roster = roster;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String anInstructor) {
        instructor = anInstructor;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String aCourseName) {
        courseName = aCourseName;
    }

    public ArrayList<Student> getRoster() {
        return roster;
    }

    public void setRoster(ArrayList<Student> aRoster) {
        roster = aRoster;
    }
}
