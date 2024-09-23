// Interface 1
interface Shape {
    void draw();
}

// Interface 2
interface Color {
    void fillColor();
}

// Class implementing multiple interfaces
class Rectangle implements Shape, Color {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }

    @Override
    public void fillColor() {
        System.out.println("Filling rectangle with color");
    }
}

// Main class
public class Multiple {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.draw();
        rectangle.fillColor();
    }
}