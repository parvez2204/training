import java.util.Scanner;

public class EvenNumberCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter five numbers:");

        int count = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Number " + i + ": ");
            int number = scanner.nextInt();

            if (isEven(number)) {
                count++;
            }
        }

        System.out.println("The number of even numbers entered: " + count);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}