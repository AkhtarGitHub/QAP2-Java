// MyPoint.java
public class MyPoint {
    // Attributes for x and y coordinates
    private int x;
    private int y;

    // Constructor
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters and Setters for x and y
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Calculate distance between this point and another point
    public double distance(MyPoint another) {
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // toString method to display point
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
