import java.util.Scanner;

public class ques1 {
    int length, breadth;

    // Correcting the parameters and using 'this' keyword to avoid shadowing
    void setDim(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    // Method to calculate the area using instance variables
    int getArea() {
        int area = length * breadth;
        return area;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ques1 p = new ques1();
        System.out.println("Enter length:");
        int l = sc.nextInt();
        System.out.println("Enter breadth:");
        int b = sc.nextInt();
        p.setDim(l, b);
        int ans = p.getArea(); // Corrected the method call
        System.out.println("The area is: " + ans);
    }
}
