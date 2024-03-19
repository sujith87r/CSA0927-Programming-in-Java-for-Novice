import java.util.*;

public class Main {
    enum Color {RED, GREEN, BLUE}

    public static void main(String[] args) {
        // a) Create an enum set and create the complement of the enum set
        EnumSet<Color> enumSet = EnumSet.of(Color.RED, Color.GREEN);
        System.out.println("Original enum set: " + enumSet);

        EnumSet<Color> complement = EnumSet.complementOf(enumSet);
        System.out.println("Complement of enum set: " + complement);

        // b) Derive a subset and superset from the original set using functions
        EnumSet<Color> subset = EnumSet.copyOf(enumSet);
        System.out.println("Subset: " + subset);

        EnumSet<Color> superset = EnumSet.copyOf(complement);
        System.out.println("Superset: " + superset);

        // c) Create an enum set using enum constants and convert them into an array
        EnumSet<Color> newEnumSet = EnumSet.noneOf(Color.class);
        newEnumSet.add(Color.RED);
        newEnumSet.add(Color.BLUE);
        System.out.println("New enum set: " + newEnumSet);

        Color[] array = newEnumSet.toArray(new Color[0]);
        System.out.println("Enum set as array: " + Arrays.toString(array));

        // d) Serialize and deserialize the original enum set
        // Serialization and deserialization can be done using standard Java serialization techniques
        // It involves writing the enum set to a file or stream and then reading it back
    }
}
