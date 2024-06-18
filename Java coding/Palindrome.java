
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        String str = Integer.toString(number);
        int i = 0;
        int j = str.length() - 1;
        boolean ispalindrome = true;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                ispalindrome = false;
                break;
            }
            i++;
            j--;
        }

        if (ispalindrome) {
            System.out.println("It is a palindrome number.");
        } else {
            System.out.println("It is not a palindrome number.");
        }

        sc.close();
    }
}
