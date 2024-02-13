import java.util.SortedMap; 
import java.util.TreeMap; 

public class Main { 
	public static void main(String[] args) { 
		SortedMap<String, Integer> sortedMap = new TreeMap<>(); 

		// Adding elements to the sorted map 
		sortedMap.put("A", 1); 
		sortedMap.put("C", 3); 
		sortedMap.put("B", 2); 

		// Getting values from the sorted map 
		int valueA = sortedMap.get("A"); 
		System.out.println("Value of A: " + valueA); 

		// Removing elements from the sorted map 
		sortedMap.remove("B"); 

		// Iterating over the elements of the sorted map 
		for (String key : sortedMap.keySet()) { 
			System.out.println("Key: " + key + ", Value: " + sortedMap.get(key)); 
		} 
	} 
} 
