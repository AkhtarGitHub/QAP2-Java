// TestMyRectangle.java
public class TestMyRectangle {
    public static void main(String[] args) {
        // Create MyPoint objects
        MyPoint topLeft = new MyPoint(1, 5);
        MyPoint bottomRight = new MyPoint(6, 1);

        // Create MyRectangle object using MyPoint objects
        MyRectangle rectangle1 = new MyRectangle(topLeft, bottomRight);
        
        // Create MyRectangle object using coordinates
        MyRectangle rectangle2 = new MyRectangle(2, 7, 8, 3);

        // Test the width, height, area, and perimeter
        System.out.println("Rectangle1: " + rectangle1);
        System.out.println("Width of Rectangle1: " + rectangle1.getWidth());
        System.out.println("Height of Rectangle1: " + rectangle1.getHeight());
        System.out.println("Area of Rectangle1: " + rectangle1.getArea());
        System.out.println("Perimeter of Rectangle1: " + rectangle1.getPerimeter());

        System.out.println("Rectangle2: " + rectangle2);
        System.out.println("Width of Rectangle2: " + rectangle2.getWidth());
        System.out.println("Height of Rectangle2: " + rectangle2.getHeight());
        System.out.println("Area of Rectangle2: " + rectangle2.getArea());
        System.out.println("Perimeter of Rectangle2: " + rectangle2.getPerimeter());
    }
}
