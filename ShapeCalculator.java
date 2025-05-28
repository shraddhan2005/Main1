public class ShapeCalculator {

    // Class for Circle Area
    static class CircleArea {
        private double radius;

        public CircleArea(double radius) {
            this.radius = radius;
        }

        public double getArea() {
            return Math.PI * radius * radius;
        }

        public void displayArea() {
            System.out.println("Circle Radius: " + radius);
            System.out.println("Circle Area: " + getArea());
        }
    }

    // Class for Rectangle Perimeter
    static class RectanglePerimeter {
        private double length;
        private double breadth;

        public RectanglePerimeter(double length, double breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        public double getPerimeter() {
            return 2 * (length + breadth);
        }

        public void displayPerimeter() {
            System.out.println("Rectangle Length: " + length);
            System.out.println("Rectangle Breadth: " + breadth);
            System.out.println("Rectangle Perimeter: " + getPerimeter());
        }
    }

    public static void main(String[] args) {
        // Circle
        CircleArea circle = new CircleArea(5.0);
        circle.displayArea();

        System.out.println();

        // Rectangle
        RectanglePerimeter rect = new RectanglePerimeter(10.0, 4.0);
        rect.displayPerimeter();
    }
}