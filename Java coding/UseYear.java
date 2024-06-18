/*class Year {
    int data;

    public Year(int data) {
        this.data = 365;
    }

    void get() {
        System.out.println("Year days are");
        System.out.println(data);
    }
}

class LeapYear extends Year {
    public LeapYear(int data) {
        this.data = 366;
    }
}

public class UseYear {
    public static void main(String[] args) {
        Year y = new Year();
        y.get();
        LeapYear lp = new LeapYear();
        lp.get();
    }
}*/
class Student{
    int rollno;
    String name;
    static String college = "ITS";
    //static method to change the value of static
    variable
    static void change(){
    college = "BBDIT";
    }
    Student(int r, String n){
    rollno = r;
    name = n;
    } void display(){System.out.println(rollno
    +" "+name+" "+college);}
    }

public class TestStaticMethod {
    public static void main(String args[]){
        Student.change();//calling change method
        //creating objects
        Student s1 = new Student(1,"Karan");
        Student s2 = new Student(2,"Aryan");
        Student s3 = new Student(3,“Rahul");
        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}}