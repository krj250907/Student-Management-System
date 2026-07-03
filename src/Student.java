public class Student {
    int rollNo;
    String name;
    int age;
    String course;

    // Constructor
    public Student(int rollNo, String name, int age, String course) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }
    // Display student details
    public void displayStudent() {
        System.out.println("----------------------------");
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("Course  : " + course);
    }
}