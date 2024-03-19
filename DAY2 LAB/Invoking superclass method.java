class Animal {
 void eat() {
 System.out.println("Animal is eating");
 }
}
class Dog extends Animal {
 void eat() {
 super.eat();
 System.out.println("Dog is eating");
 }
}
public class SuperKeywordExampleC {
 public static void main(String[] args) {
 Dog myDog = new Dog();
 myDog.eat();
 }
}
