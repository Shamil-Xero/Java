public class Triangle {
    double base;
    double height;

    // Constructor to initialize base and height
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Method to calculate and return the area of the triangle
    public double getArea() {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(10, 5);
        double area = triangle.getArea();
        System.out.println("Area of the triangle: " + area);
    }
}