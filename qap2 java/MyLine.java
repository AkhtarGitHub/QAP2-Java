// MyLine.java
public class MyLine {
    // Two MyPoint objects for the beginning and the end of the line
    private MyPoint begin;
    private MyPoint end;

    // Constructor using two points' coordinates
    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }

    // Constructor using MyPoint objects
    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    // Getters and Setters for begin and end points
    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    // Get and set methods for the coordinates of the begin and end points
    public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }

    public int getEndX() {
        return end.getX();
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    // Set both x and y for the begin and end points
    public void setBeginXY(int x, int y) {
        begin.setX(x);
        begin.setY(y);
    }

    public void setEndXY(int x, int y) {
        end.setX(x);
        end.setY(y);
    }

    // Calculate the length of the line using MyPoint's distance method
    public double getLength() {
        return begin.distance(end);
    }

    // Calculate the gradient (slope) of the line
    public double getGradient() {
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return Math.atan2(yDiff, xDiff);
    }

    // toString method to display the line
    @Override
    public String toString() {
        return "MyLine[begin=" + begin + ",end=" + end + "]";
    }
}
