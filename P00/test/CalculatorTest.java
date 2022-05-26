import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 * 20046363, 26 May 2022 10:08:25 am
 */

public class CalculatorTest {

	@Before
	public void setUpBeforeClass() throws Exception {
	}
	@Before
	public void setUp() throws Exception {
	}
	@Test
	public final void testAdd() {
		//fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator ();
		int actual = cal.add(a, b);
		
		int expected = 9999;
		assertEquals(actual, expected);
	}
@Test
public final void testSubtract() {
	//fail("Not yet implemented");
	int a = 9876;
	int b = 4321;
	
	Calculator cal = new Calculator ();
	int actual = cal.subtract(a, b);
	
	int expected = 5555;
	assertEquals(actual, expected);
}
@Test
public final void testmultiply() {
	//fail("Not yet implemented");
	int a = 12;
	int b = 10;
	
	Calculator cal = new Calculator ();
	int actual = cal.multiply(a, b);
	
	int expected = 120;
	assertEquals(actual, expected);
}
@Test
public final void testdivideWith0Denominator() {
	//fail("Not yet implemented");
	int a = 1000;
	int b = 10;
	
	Calculator cal = new Calculator ();
	int actual = cal.divide(a, b);
	
	int expected = 100;
	assertEquals(actual, expected);
}
@Test
public final void divideWithNon0Denominator() {
	//fail("Not yet implemented");
	int a = 100;
	int b = 10;
	
	Calculator cal = new Calculator ();
	int actual = cal.divide(a, b);
	
	int expected = 1;
	assertNotEquals(actual, expected);
}
@After
public void tearDownAfterClass() throws Exception {
}
}

