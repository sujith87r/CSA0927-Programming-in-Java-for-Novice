import java.util.*;

public class Main {
    public static void main(String[] args) {
        // a) Check whether two hash sets contain the same elements or not
        Set<Integer> hashSet1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> hashSet2 = new HashSet<>(Arrays.asList(2, 3, 4));

        System.out.println("Hash set 1: " + hashSet1);
        System.out.println("Hash set 2: " + hashSet2);
        System.out.println("Are both hash sets equal? " + hashSet1.equals(hashSet2));

        // b) Create an ArrayList and convert it to a hash set
        List<Integer> arrayList = Arrays.asList(1, 2, 3, 3, 4, 5);
        Set<Integer> hashSetFromArrayList = new HashSet<>(arrayList);
        System.out.println("Hash set from ArrayList: " + hashSetFromArrayList);

        // c) Check whether a specific element is present in the set, if not append it
        int elementToCheck = 5;
        if (!hashSetFromArrayList.contains(elementToCheck)) {
            hashSetFromArrayList.add(elementToCheck);
        }
        System.out.println("Updated hash set: " + hashSetFromArrayList);

        // d) Create a clone of elements from the original set and return both hash sets
        Set<Integer> cloneSet = new HashSet<>(hashSetFromArrayList);
        System.out.println("Clone set: " + cloneSet);
    }
}
