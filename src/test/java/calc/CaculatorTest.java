package calc;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class CaculatorTest {
	private static CalculatorMain calc;

	@BeforeClass
	public static void setup(){
		calc = new CalculatorMain();
	}

	@Test
	public void testAdd() {
		assertEquals(5, calc.add(3,2));
	}
	@Test
	public void testAddNegative() {
		assertEquals(-1, calc.add(-3,2));
	}
	@Test
	public void testSub() {
		assertEquals(1, calc.sub(3,2));
	}
	@Test
	public void testSubNegative() {
		assertEquals(-5, calc.sub(-3,2));
	}
	@Test
	public void testMul() {
		assertEquals(6, calc.mul(3,2));
	}
	@Test
	public void testMulNegative() {
		assertEquals(-6, calc.mul(-3,2));
	}
	@Test
	public void testMulDoubleNegative() {
		assertEquals(6, calc.mul(-3,-2));
	}
	@Test
	public void testDiv() {
		assertEquals(1, calc.div(2,2));
	}
	@Test
	public void testDivNegative() {
		assertEquals(-1, calc.div(-2,2));
	}
	@Test
	public void testDivByZero() {
		assertEquals(0, calc.div(3,0));
	}
	@Test
	public void testPow() {
		assertEquals(243, calc.pow(3,5));
	}

	@Test
	public void testMod() {
		assertEquals(2, calc.mod(5,3));
	}

	@Test
	public void testIntegration() {
		assertEquals(2, calc.mod(calc.pow(2, 5), 3));
	}

	@Test
	public void testPresedence() {
		assertEquals(30, calc.add(calc.mul(5, 5), calc.div(10, 2)));
	}
}
