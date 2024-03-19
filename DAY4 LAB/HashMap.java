import java.util.*;

public class Main {
    public static void main(String[] args) {
        // a) Create two hash maps, super1 and super2, and remove keys that start with "B"
        Map<String, String> super1 = new HashMap<>();
        super1.put("Apple", "A");
        super1.put("Banana", "B");
        super1.put("Carrot", "C");
        super1.put("Broccoli", "B");

        super1.entrySet().removeIf(entry -> entry.getKey().startsWith("B"));
        System.out.println("HashMap super1 after removing keys starting with 'B': " + super1);

        // b) Create a hash map with 5 key-value pairs and display the key values when the value is multiplied by 10
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 2);
        hashMap.put("B", 5);
        hashMap.put("C", 7);
        hashMap.put("D", 3);
        hashMap.put("E", 6);

        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value * 10: " + (entry.getValue() * 10));
        }

        // c) Iterate over the entries created using methods in the hash map
        System.out.println("Entries of HashMap:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // d) Compute a value for key "C" if the key is not associated with the value and merge the key along with the hash map created in b)
        hashMap.computeIfAbsent("C", k -> 4);
        System.out.println("HashMap after computing value for key 'C': " + hashMap);
    }
}
