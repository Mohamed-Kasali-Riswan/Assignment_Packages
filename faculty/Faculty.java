package university.faculty;

public class Faculty {
    private String name;
    private String facultyId;
    private String department;

    public Faculty(String name, String facultyId, String department) {
        this.name = name;
        this.facultyId = facultyId;
        this.department = department;
    }

    public void displayInfo() {
        System.out.println("Faculty Name: " + name);
        System.out.println("Faculty ID: " + facultyId);
        System.out.println("Department: " + department);
    }
}
