import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create a sorted map
        SortedMap<Integer, Integer> sortedMap = new TreeMap<>();
        sortedMap.put(1, 153);
        sortedMap.put(2, 370);
        sortedMap.put(3, 371);
        sortedMap.put(4, 407);
        sortedMap.put(5, 1634);

        System.out.println("Armstrong numbers in the sorted map:");
        for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
            int number = entry.getValue();
            if (isArmstrong(number)) {
                System.out.println(number);
            }
        }
    }

    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int originalNumber, remainder, result = 0, n = 0;

        originalNumber = number;

        // Find the number of digits
        while (originalNumber != 0) {
            originalNumber /= 10;
            ++n;
        }

        originalNumber = number;

        // Calculate the sum of power of digits
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }

        return result == number;
    }
}
