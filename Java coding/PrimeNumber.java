import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        int c = 0;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 1; i < a / 2; i++) {
            if (a % i == 0) {
                c++;
            }
        }
        if (c > 1) {
            System.out.println("it is not a prime number");
        } else {
            System.out.println("it is a prime number");
        }
    }
}
