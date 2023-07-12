import java.util.Scanner;

public class MultipleChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        System.out.print("Enter the value of M: ");
        int m = scanner.nextInt();

        if (isMultiple(n, m)) {
            System.out.println(n + " is an exact multiple of " + m);
        } else {
            System.out.println(n + " is not an exact multiple of " + m);
        }
    }

    public static boolean isMultiple(int n, int m) {
        return n % m == 0;
    }
}