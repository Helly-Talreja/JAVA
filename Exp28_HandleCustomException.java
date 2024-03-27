class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class Exp28_HandleCustomException {
    public static void main(String[] args) {
        try {
            int age = -10;
            validateAge(age);
            System.out.println("Age: " + age);
        } catch (CustomException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void validateAge(int age) throws CustomException {
        if (age < 0) {
            throw new CustomException("Age cannot be negative");
        }
    }
}
