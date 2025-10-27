package lab5;

import lab4.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTriangle {

	@Test
	void TestTriangleValidPerimeter() {
		Triangle t = new Triangle(new Point(0, 0), new Point(0, 3), new Point(4,0));
		assertEquals(t.perimeter(), 12);
	}

}
