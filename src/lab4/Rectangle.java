package lab4;

public class Rectangle{
    private Point topLeft;
    private Point topRight;
    private Point bottomLeft;
    private Point bottomRight;
    public Rectangle(Point topLeft, Point topRight, Point bottomLeft, Point bottomRight){
        topLeft = topLeft;
        topRight = topRight;
        bottomLeft = bottomLeft;
        bottomRight = bottomRight;

        if (topLeft.y != topRight.y || bottomLeft.y != bottomRight.y
                || topLeft.x != bottomLeft.x || topRight.x != bottomRight.x) {
            throw new IllegalArgumentException("Corners are not aligned");
        }
    }
    private double width() {
        return Math.abs(topRight.x - topLeft.x);
    }

    private double height() {
        return Math.abs(topLeft.y - bottomLeft.y);
    }

    public double perimeter() {
        return 2 * (width() + height());
    }

    public boolean isSquare() {
        return width() == height();
    }
}