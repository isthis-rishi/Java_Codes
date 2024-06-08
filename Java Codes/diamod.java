import java.util.Scanner;

public class diamod {
    public static void diamond(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.err.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            for (int j = 2; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.err.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            for (int j = 2; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print Diamond:");
        int n = sc.nextInt();
        diamond(n);
    }
}
