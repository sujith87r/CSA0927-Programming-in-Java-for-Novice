import java.util.*;

public class Main {
    public static void main(String[] args) {
        // a) Create set1 and set2 and perform intersection and union operations
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection);

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union: " + union);

        // b) Obtain and print a subset of the set containing elements greater than a specified value
        Set<Integer> subset = new HashSet<>();
        int threshold = 3;
        for (Integer num : union) {
            if (num > threshold) {
                subset.add(num);
            }
        }
        System.out.println("Subset: " + subset);

        // c) Convert the sets to an array format and print the elements of the array
        Integer[] set1Array = set1.toArray(new Integer[0]);
        System.out.println("Set1 as array: " + Arrays.toString(set1Array));

        Integer[] set2Array = set2.toArray(new Integer[0]);
        System.out.println("Set2 as array: " + Arrays.toString(set2Array));

        // d) Retain only the elements present in both the original set and another set
        set1.retainAll(set2);
        System.out.println("Elements present in both sets: " + set1);
    }
}
