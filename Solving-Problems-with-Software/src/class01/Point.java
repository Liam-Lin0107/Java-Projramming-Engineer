package class01;

public class Point {
    private int x;
    private int y;

    // constructor
    public Point(int startX, int startY) {
        x = startX;
        y = startY;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance(Point otherPt) {
        int dx = x - otherPt.x;
        int dy = y - otherPt.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(6, 8);
        System.out.println(p1.distance(p2));
        int m = 7;
        double d = 8.974;
        System.out.println(m + d);
    }
}
