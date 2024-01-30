import java.util.Scanner;

class Adder {
    private double number1;
    private double number2;

    // Constructor to initialize the numbers
    public Adder(double num1, double num2) {
        number1 = num1;
        number2 = num2;
    }

    // Method to perform the addition
    public double add() {
        return number1 + number2;
    }
}

public class Exp_16_2_no_aed_Class {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        Adder adder = new Adder(num1, num2);

        double sum = adder.add();

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        scanner.close();
    }
}
