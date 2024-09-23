class Animal {
    public final void eat() {
        System.out.println("Animal eats.");
    }
}

class Dog extends Animal {
    // Trying to override the final method
    // This will result in a compile-time error
    // public void eat() {
    //     System.out.println("Dog eats.");
    // }
}

public class Final{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
    }
}