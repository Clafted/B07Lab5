package lab5;

import lab4.Point;

public class Rectangle{
    private Point topLeft;
    private Point topRight;
    private Point bottomLeft;
    private Point bottomRight;
    
    public Rectangle(Point topLeft, Point topRight, Point bottomLeft, Point bottomRight){
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;

        if (topLeft.y != topRight.y || bottomLeft.y != bottomRight.y
                || topLeft.x != bottomLeft.x || topRight.x != bottomRight.x) {
            throw new IllegalArgumentException("Corners are not aligned");
        }
    }
    public double width() {
        return Math.abs(topRight.x - topLeft.x);
    }

    public double height() {
        return Math.abs(topLeft.y - bottomLeft.y);
    }

    public double perimeter() {
        return 2 * (width() + height());
    }

    public double area(){
        return (width() * height());
    }

    public boolean isSquare() {
        return width() == height();
    }
}