package lab5;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import lab4.Point;
import lab5.Rectangle;


 class TestRectangle {

	@Test
	public void width() {
		Point p1 = new Point(1, 0);
		Point p2 = new Point(1, 1);
		Point p3 = new Point(2, 0);
		Point p4 = new Point(2, 1);
		Rectangle r1= new Rectangle(p1,p2,p3,p4);
		assertEquals(r1.width(),1);
	}
	
	
	@Test
	public void height() {
		Point p1 = new Point(1, 0);
		Point p2 = new Point(1, 1);
		Point p3 = new Point(2, 0);
		Point p4 = new Point(2, 1);
		Rectangle r1= new Rectangle(p1,p2,p3,p4);
		assertEquals(r1.height(),1);
	}

	
	
	@Test
	public void perimeter() {
		Point p1 = new Point(1, 0);
		Point p2 = new Point(1, 1);
		Point p3 = new Point(2, 0);
		Point p4 = new Point(2, 1);
		Rectangle r1= new Rectangle(p1,p2,p3,p4);
		assertEquals(r1.perimeter(),4);
	}
	
	@Test
	public void isSquare() {
		Point p1 = new Point(1, 0);
		Point p2 = new Point(1, 1);
		Point p3 = new Point(2, 0);
		Point p4 = new Point(2, 1);
		Rectangle r1= new Rectangle(p1,p2,p3,p4);
		assertTrue(r1.isSquare());
	}
}
