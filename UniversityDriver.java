package university;

import university.students.Student;
import university.courses.Course;
import university.faculty.Faculty;

public class UniversityDriver {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 101, "Computer Science");
        Course c1 = new Course("Data Structures", "CS201", 4);
        Faculty f1 = new Faculty("Dr. John", "F123", "Computer Science");

        System.out.println("\nStudent Details:");
        System.out.println("----------------");
        s1.displayInfo();

        System.out.println("\nCourse Details:");
        System.out.println("---------------");
        c1.displayInfo();

        System.out.println("\nFaculty Details:");
        System.out.println("----------------");
        f1.displayInfo();
    }
}
