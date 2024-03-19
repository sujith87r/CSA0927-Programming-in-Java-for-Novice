import java.util.Scanner;

public class UserInputProcessor {

    // 5. Throw a custom exception if an user tries to enter negative values
    public static int processPositiveValueInput() throws NegativeValueException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive value:");
        int value = scanner.nextInt();
        if (value < 0) {
            throw new NegativeValueException("Negative values are not allowed.");
        }
        return value;
    }

    // 6. Throw a custom exception if an user tries to enter an invalid decimal number
    public static double processDecimalInput() throws InvalidDecimalNumberException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        if (!scanner.hasNextDouble()) {
            throw new InvalidDecimalNumberException("Invalid decimal number.");
        }
        return scanner.nextDouble();
    }

    // 7. Throw a custom exception if an user tries to enter a non-integer value
    public static int processIntegerInput() throws NonIntegerValueException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer:");
        if (!scanner.hasNextInt()) {
            throw new NonIntegerValueException("Non-integer values are not allowed.");
        }
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        try {
            int positiveValue = processPositiveValueInput();
            System.out.println("Positive value entered: " + positiveValue);
        } catch (NegativeValueException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            double decimalValue = processDecimalInput();
            System.out.println("Decimal value entered: " + decimalValue);
        } catch (InvalidDecimalNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            int integerValue = processIntegerInput();
            System.out.println("Integer value entered: " + integerValue);
        } catch (NonIntegerValueException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
