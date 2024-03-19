import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();

        // Populate evenList and oddList
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                evenList.add(i);
            } else {
                oddList.add(i);
            }
        }

        // Remove an element at a specific position from evenList using list as stack
        int indexToRemove = 2; // Example position to remove
        int removedElement = evenList.remove(indexToRemove);
        System.out.println("Removed element from evenList: " + removedElement);
    }
}
