class RectangleArea {
    int length;
    int breadth;

    // constructor
    RectangleArea(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate area
    int getArea() {
        return length * breadth;
    }
}

class RectanglePerimeter extends RectangleArea {
    // constructor
    RectanglePerimeter(int length, int breadth) {
        super(length, breadth);
    }

    // Method to calculate perimeter
    int getPerimeter() {
        return 2 * (length + breadth);
    }
}

public class Main {
    public static void main(String[] args) {
        RectanglePerimeter rect = new RectanglePerimeter(5, 10);
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());
    }
}