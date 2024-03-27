class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class Exp27_CustomException {
    public static void main(String[] args) {
        try {
            int age = -10;
            if (age < 0) {
                throw new CustomException("Age cannot be negative");
            }
            System.out.println("Age: " + age);
        } catch (CustomException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
