// TestMyLine.java
public class TestMyLine {
    public static void main(String[] args) {
        // Create MyPoint objects
        MyPoint point1 = new MyPoint(1, 2);
        MyPoint point2 = new MyPoint(4, 6);

        // Create MyLine objects using MyPoint objects
        MyLine line1 = new MyLine(point1, point2);
        
        // Create MyLine object using coordinates
        MyLine line2 = new MyLine(1, 2, 4, 6);

        // Test getters and setters for MyLine
        System.out.println("Begin point: " + line1.getBegin());
        System.out.println("End point: " + line1.getEnd());
        System.out.println("Line 1 Length: " + line1.getLength());
        System.out.println("Line 1 Gradient: " + line1.getGradient());
        
        // Modify the points
        line1.setBeginXY(2, 3);
        line1.setEndXY(5, 7);
        
        // Test the new values
        System.out.println("Modified Begin point: " + line1.getBegin());
        System.out.println("Modified End point: " + line1.getEnd());
        System.out.println("Line 1 Length after modification: " + line1.getLength());
        System.out.println("Line 1 Gradient after modification: " + line1.getGradient());
        
        // Test toString
        System.out.println("Line1: " + line1.toString());
        System.out.println("Line2: " + line2.toString());
    }
}
