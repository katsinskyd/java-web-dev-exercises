package exercises.Class3;

import java.util.ArrayList;
import java.util.Scanner;

// I probably wasn't meant to do all this but it was fun figuring out how to access different information so I just kept going with it

public class School {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        ArrayList<Teacher> teacherList = new ArrayList<>();
        ArrayList<Course> courses = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Creating a new course.");

        System.out.println("What is the course title?");
        String courseTitle = input.nextLine();

        System.out.println("Provide information on the instructor for " + courseTitle);
        System.out.println("First name: ");
        String firstName = input.nextLine();
        System.out.println("Last name: ");
        String lastName = input.nextLine();
        System.out.println("Years teaching: ");
        int yearsTeaching = input.nextInt();

        teacherList.add(new Teacher(firstName, lastName, courseTitle, yearsTeaching));

        System.out.println("How many students will be added to the course?");
        int capacity = input.nextInt();

        do {
            System.out.println("Adding student to course roster.");
            System.out.println("Student name: ");
            String studentName = input.next();

            System.out.println("Student ID: ");
            int studentId = input.nextInt();

            System.out.println("Student credits: ");
            int studentCredits = input.nextInt();

            System.out.println("Student GPA: ");
            double studentGpa = input.nextDouble();

            studentList.add(new Student(studentName, studentId, studentCredits, studentGpa));

        } while (studentList.size() < capacity);

        System.out.println("This course's roster includes: ");

        for (Student student : studentList) {
            System.out.println(student.getName());
        }

        courses.add(new Course(studentList, firstName, courseTitle));
    }
}
