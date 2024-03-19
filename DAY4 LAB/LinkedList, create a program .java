import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.println("Enter integers (enter -1 to stop):");
        int input;
        while ((input = scanner.nextInt()) != -1) {
            linkedList.add(input);
        }

        System.out.println("Original linked list: " + linkedList);

        // Reverse the linked list
        Collections.reverse(linkedList);

        System.out.println("Reversed linked list: " + linkedList);
    }
}
