import java.util.*;

public class Main {
    public static void main(String[] args) {
        // a) Create two sets arr1 and arr2 and find the difference between them
        TreeSet<Integer> arr1 = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5));
        TreeSet<Integer> arr2 = new TreeSet<>(Arrays.asList(3, 4, 5, 6, 7));

        System.out.println("Set 1: " + arr1);
        System.out.println("Set 2: " + arr2);

        TreeSet<Integer> difference = new TreeSet<>(arr1);
        difference.removeAll(arr2);
        System.out.println("Difference between sets: " + difference);

        // b) Create a tree set and find the smallest element greater than a threshold
        int threshold = 3;
        System.out.println("Smallest element greater than " + threshold + ": " + arr1.higher(threshold));

        // c) Retrieve and remove the first and last elements in a treeset using functions
        System.out.println("First element: " + arr1.pollFirst());
        System.out.println("Last element: " + arr1.pollLast());
        System.out.println("Remaining elements: " + arr1);

        // d) Find the floor and ceil value of a specific element in a tree set
        int specificElement = 4;
        System.out.println("Floor value of " + specificElement + ": " + arr1.floor(specificElement));
        System.out.println("Ceiling value of " + specificElement + ": " + arr1.ceiling(specificElement));
    }
}
