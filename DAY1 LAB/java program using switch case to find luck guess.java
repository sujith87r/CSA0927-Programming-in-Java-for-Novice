import java.util.Scanner;
public class LuckyGuess {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.println("Welcome to the Lucky Guess game!");
 System.out.println("Guess a number between 1 and 5:");
 int luckyNumber = (int) (Math.random() * 5) + 1; // Generate a random number 
between 1 and 5
 int guess = scanner.nextInt(); // Get user's guess
 switch (guess) {
 case 1:
 case 2:
 case 3:
 case 4:
 case 5:
 if (guess == luckyNumber) {
 System.out.println("Congratulations! You guessed the lucky number: " + 
luckyNumber);
 } else {
 System.out.println("Sorry! Better luck next time. The lucky number was: " + 
luckyNumber);
 }
 break;
 default:
 System.out.println("Invalid guess! Please guess a number between 1 and 5.");
 }
 scanner.close();
 }
