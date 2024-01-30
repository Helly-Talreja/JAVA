import java.util.Scanner;

public class Exp_08_Fibonacci_Sequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of terms for Fibonacci sequence:");
        int n = scanner.nextInt();

        System.out.println("Fibonacci sequence up to " + n + " terms:");
        printFibonacciSequence(n);

        scanner.close();
    }

    private static void printFibonacciSequence(int n) {
        int firstTerm = 0, secondTerm = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
