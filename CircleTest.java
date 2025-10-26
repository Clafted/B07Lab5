package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTest {
	double x_test = 1.0;
	double y_test = 2.0;
	double x2_test = 3.0;
	double y2_test = 4.0;
	double r_test = 5.0;
	
	Point p = new Point(x_test, y_test);	
	Point p2 = new Point(x2_test, y2_test);
	Circle c = new Circle(p, r_test);
	
	@Test
	void test_const_inputs_fst_var() {
		assertEquals(c.center, p);
	}
	
	@Test
	void test_const_inputs_scnd_var() {
		assertEquals(c.radius, r_test);
	}
	
	@Test
	void test_eql_circle_perimeter() {
		assertEquals(31.41592653589793, c.perimeter());
		System.out.println("the perimeter is " + c.perimeter());
	}
	
	@Test
	void test_eql_circle_area() {
		assertEquals(78.53981633974483, c.area());
		System.out.println("the area is " + c.area());
	}

	@Test
	void test_isOutside_false() {
		assertFalse(c.isOutside(p));
		System.out.println(p.distance(p2));
	}
}
