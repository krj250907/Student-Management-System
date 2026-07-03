import java.util.ArrayList;
public class StudentManager {
    ArrayList<Student> students = new ArrayList<>();

    // Add student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }
    // Display all students
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        
        for (Student student : students) {
            student.displayStudent();
        }
    }
}