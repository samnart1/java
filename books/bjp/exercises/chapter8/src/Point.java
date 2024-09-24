public class Point {
    private int x;
    private int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        setLocation(x, y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setLocation(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }

    public double distanceFromOrigin(int x, int y) {
        return Math.sqrt(x * x + y * y);
    }

    public void translate(int dx, int dy) {
        setLocation(x + dx, y + dy);
    }

    public String toString() {
        return "(" + x + ", " +  y + ")";
    }


}
