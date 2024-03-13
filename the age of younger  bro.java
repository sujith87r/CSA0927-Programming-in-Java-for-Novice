public class AgeCalculation {
 public static void main(String[] args) {
 int personAgeAt28 = 28;
 int youngerBrotherAgeAt28 = 24;
 
 // Find the age difference
 int ageDifference = personAgeAt28 - youngerBrotherAgeAt28;
 
 // Calculate the age of the person when the older brother is 56
 int personAgeAt56 = 56 + ageDifference;
 
 // Check if the age difference is more than 3
 if (ageDifference > 3) {
 // Calculate the age of the younger brother when the older brother was 5
 int youngerBrotherAgeAt5 = youngerBrotherAgeAt28 - ageDifference + 5;
 System.out.println("The age of the younger brother when the older brother was 5: 
" + youngerBrotherAgeAt5);
 } else {
 // Print the age of the person when the older brother is 56
 System.out.println("The age of the person when the older brother is 56: " + 
personAgeAt56);
 }
 }
}
