class Animal {
 String sound;
 Animal(String sound) {
 this.sound = sound;
 }
}
class Dog extends Animal {
 Dog(String sound) {
 super(sound);
 }
 void displaySound() {
 System.out.println("Dog Sound: " + super.sound);
 }
}
public class SuperKeywordExampleB {
 public static void main(String[] args) {
 Dog myDog = new Dog("Woof!");
 myDog.displaySound();
 }
}
