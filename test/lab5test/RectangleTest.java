package lab5test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import lab4.Point;
import lab5.Rectangle;


 class RectangleTest {

	@Test
	public void widthTest() {
		Point p1 = new Point(1, 0);
		Point p2 = new Point(1, 1);
		Point p3 = new Point(2, 0);
		Point p4 = new Point(2, 1);
		Rectangle r1= new Rectangle(p2,p4,p1,p3);
		assertEquals(r1.width(),1);
	}
	
	
	@Test
	public void heightTest() {
		Point p1 = new Point(1, 0);
		Point p2 = new Point(1, 1);
		Point p3 = new Point(2, 0);
		Point p4 = new Point(2, 1);
		Rectangle r1= new Rectangle(p2,p4,p1,p3);
		assertEquals(r1.height(),1);
	}

	
	
	@Test
	public void perimeterTest() {
		Point p1 = new Point(1, 0);
		Point p2 = new Point(1, 1);
		Point p3 = new Point(2, 0);
		Point p4 = new Point(2, 1);
		Rectangle r1= new Rectangle(p2,p4,p1,p3);
		assertEquals(r1.perimeter(),4);
	}
	
	@Test
	public void isSquareTest() {
		Point p1 = new Point(1, 0);
		Point p2 = new Point(1, 1);
		Point p3 = new Point(2, 0);
		Point p4 = new Point(2, 1);
		Rectangle r1= new Rectangle(p2,p4,p1,p3);
		assertTrue(r1.isSquare());
	}
	
	@Test
	public void areaTest() {
		Point bL = new Point(0, -1);
		Point bR = new Point(1, -1);
		Point tL = new Point(0, 0);
		Point tR = new Point(1, 0);
		Rectangle r1 = new Rectangle(tL, tR, bL, bR);
		assertEquals(r1.area(), 1);
	}
}
