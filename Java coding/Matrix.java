package mathematics;

public class Matrix {
    void add(int a[][], int b[][]) {
        int c[][] = new c[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        for (int i = 0; i < 2; i++) {
            System.out.println("\n");
            for (int j = 0; j < 2; j++) {
                System.out.println(c[i][j] + " ");
                ;
            }
        }
    }

    void subtract(int a[][], int b[][]) {
        int c[][] = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = a[i][j] - b[i][j];
            }
        }
        for (int i = 0; i < 2; i++) {
            System.out.println("\n");
            for (int j = 0; j < 2; j++) {
                System.out.println(c[i][j] + " ");
                ;
            }
        }

    }

    public static void main(String[] args) {
        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of A");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of B");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        add(a, b);
        subtract(a, b);
    }

}
