import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Integer> vector = new Vector<>();

        System.out.println("Enter integers (enter -1 to stop):");
        int input;
        while ((input = scanner.nextInt()) != -1) {
            vector.add(input);
        }

        // Convert vector to string
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < vector.size(); i++) {
            stringBuilder.append(vector.get(i)).append(" ");
        }

        String result = stringBuilder.toString().trim();
        System.out.println("Output string: " + result);
    }
}
