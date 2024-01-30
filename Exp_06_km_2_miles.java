import java.util.Scanner;

public class Exp_06_km_2_miles {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select conversion direction:");
        System.out.println("1. Kilometers to Miles");
        System.out.println("2. Miles to Kilometers");

        int choice = scanner.nextInt();

        if (choice == 1) {
            // Kilometers to Miles
            System.out.println("Enter distance in kilometers:");
            double kilometers = scanner.nextDouble();
            double miles = convertKilometersToMiles(kilometers);
            System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");
        } else if (choice == 2) {
            // Miles to Kilometers
            System.out.println("Enter distance in miles:");
            double miles = scanner.nextDouble();
            double kilometers = convertMilesToKilometers(miles);
            System.out.println(miles + " miles is equal to " + kilometers + " kilometers.");
        } else {
            System.out.println("Invalid choice. Please select 1 or 2.");
        }

        scanner.close();
    }

    private static double convertKilometersToMiles(double kilometers) {
        // 1 kilometer is approximately 0.621371 miles
        return kilometers * 0.621371;
    }

    private static double convertMilesToKilometers(double miles) {
        // 1 mile is approximately 1.60934 kilometers
        return miles * 1.60934;
    }
}
