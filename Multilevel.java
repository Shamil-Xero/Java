// Parent class
class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

// First level child class
class Car extends Vehicle {
    @Override
    void run() {
        System.out.println("Car is running");
    }
}

// Second level child class
class BMW extends Car {
    @Override
    void run() {
        System.out.println("BMW is running");
    }
}

// Main class
public class Multilevel {
    public static void main(String[] args) {
        BMW bmw = new BMW();
        bmw.run(); // Output: BMW is running
        bmw.run(); // Output: BMW is running (overridden method)
        ((Car) bmw).run(); // Output: Car is running (overridden method)
        ((Vehicle) bmw).run(); // Output: Vehicle is running (overridden method)
    }
}