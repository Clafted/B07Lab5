package lab5;
import lab4.Point;

public class Circle{
    Point center;
    double radius;
	
    //constructor
	public Circle(Point A, double rad) {
		this.center = A;
        this.radius = rad;
	}
	
    //returns the perimeter
	public double perimeter() {
		return 2*Math.PI * this.radius;
	}

	//returns the area
	public double area(){
        return Math.PI * Math.pow(this.radius, 2);
    }

    //returns true iff the point is outside the circle(including its boundary)
    public boolean isOutside(Point arbPt){
        return (this.center.distance(arbPt) >= this.radius);
    }
}
