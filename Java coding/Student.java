public class Student {
    String name;
    int roll_no;

    // Constructor to initialize the Student object
    public Student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    void display() {
        System.out.println(name + roll_no);
    }

    public static void main(String[] args) {
        // Creating an object of Student with name "John" and roll_no 2
        Student student = new Student("John", 2);
        student.display();
    }
}
