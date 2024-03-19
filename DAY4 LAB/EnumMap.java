import java.util.*;

public class Main {
    enum Sports {
        Cricket, Football, Tennis
    }

    public static void main(String[] args) {
        // a) Create an EnumMap named "BAT" and check whether key "Handball" is present, if not clear the EnumMap
        EnumMap<Sports, Integer> BAT = new EnumMap<>(Sports.class);
        BAT.put(Sports.Cricket, 1);
        BAT.put(Sports.Football, 2);

        System.out.println("BAT: " + BAT);
        if (!BAT.containsKey(Sports.Tennis)) {
            BAT.clear();
        }
        System.out.println("BAT after clearing: " + BAT);

        // b) Clone the above created EnumMap and display both maps
        EnumMap<Sports, Integer> cloneMap = BAT.clone();
        System.out.println("CloneMap: " + cloneMap);
        System.out.println("Original BAT: " + BAT);

        // c) Check whether the above map contains a mapping for the specified key. If yes, return true; if no, replace the value with enum map "TRIO" values
        if (!cloneMap.containsKey(Sports.Cricket)) {
            cloneMap.put(Sports.Cricket, 3);
        }
        System.out.println("CloneMap after checking: " + cloneMap);

        // d) Check whether the entered values are prime numbers or not and count the number of prime key-value pairs present
        int primeCount = 0;
        for (Map.Entry<Sports, Integer> entry : cloneMap.entrySet()) {
            if (isPrime(entry.getValue())) {
                primeCount++;
            }
        }
        System.out.println("Number of prime key-value pairs: " + primeCount);
    }

