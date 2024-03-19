import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();

        // Store input in specific index
        arrayList.add(0, 10);
        arrayList.add(1, 20);
        arrayList.add(2, 30);

        // Remove an element using index value
        int indexToRemove = 1; // Example index to remove
        int removedElement = arrayList.remove(indexToRemove);
        System.out.println("Removed element from ArrayList: " + removedElement);
    }
}
