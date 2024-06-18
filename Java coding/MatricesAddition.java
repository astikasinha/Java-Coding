import java.util.Scanner;

public class MatricesAddition {
    public static void main(String[] args) {
        int[][] arr1 = new int[2][2];
        int[][] arr2 = new int[2][2];
        int[][] arr3 = new int[2][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements for first matrix:");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements for second matrix:");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.println("Element at" + i + "," + j + ":" + arr3[i][j]);
            }
        }
    }
}
