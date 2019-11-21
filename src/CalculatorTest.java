import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testAdd() {
		Calculator calculator = new Calculator();
	    int a = 1234;
	    int b = 5678;
	    int actual = calculator.add(a, b);
	 
	    int expected = 6912;
	 
	    assertEquals(expected, actual);	}
	
	@Test
	void testAdd1() {                                       //add of 2 negative no
		Calculator calculator = new Calculator();
	    int a = -2;
	    int b = -5;
	    int actual = calculator.add(a, b);
	 
	    int expected = -7;
	 
	    assertEquals(expected, actual);	}
	
	@Test
	void testAdd2() {                                       //add of 1 positive 1 negative
		Calculator calculator = new Calculator();
	    int a = 2;
	    int b = -5;
	    int actual = calculator.add(a, b);
	 
	    int expected = -3;
	 
	    assertEquals(expected, actual);	}
	
	
	
	@Test
	void testSubtract() {
		Calculator calculator = new Calculator();
	    int a = 1234;
	    int b = 5678;
	    int actual = calculator.subtract(b,a);
	 
	    int expected = 4444;
	 
	    assertEquals(expected, actual);
	}
	
	@Test
	void testSubtract1() {
		Calculator calculator = new Calculator();
	    int a = 1234;
	    int b = 5678;
	    int actual = calculator.subtract(a,b);
	 
	    int expected = -4444;
	 
	    assertEquals(expected, actual);
	}
	
	@Test
	void testSubtract2() {                             //sub of 2 negative
		Calculator calculator = new Calculator();
	    int a = -2;
	    int b = -5;
	    int actual = calculator.subtract(b,a);
	 
	    int expected = -3;
	 
	    assertEquals(expected, actual);
	}
	
	
	@Test
	void testSubtract3() {                             //sub of 1 negative 1 positive
		Calculator calculator = new Calculator();
	    int a = 2;
	    int b = -5;
	    int actual = calculator.subtract(b,a);
	 
	    int expected = -7;
	 
	    assertEquals(expected, actual);
	}
	@Test
	void testDivide() {
		Calculator calculator = new Calculator();
	    int a = 9;
	    int b = 3;
	    int actual = calculator.divide(a,b);
	 
	    int expected = 3;
	 
	    assertEquals(expected, actual);
	}
	
	
	
	@Test
	void testDivide1() {
		Calculator calculator = new Calculator();
	    int a = 9;
	    int b = 3;
	    int actual = calculator.divide(b,a);
	 
	    int expected = 0;
	 
	    assertEquals(expected, actual);
	}

	@Test
	void testMultiply() {
		Calculator calculator = new Calculator();
	    int a = 10;
	    int b = 5;
	    int actual = calculator.multiply(a,b);
	 
	    int expected = 50;
	 
	    assertEquals(expected, actual);
	}
	
	
	@Test
	void testMultiply1() {
		Calculator calculator = new Calculator();
	    int a = -10;
	    int b = -5;
	    int actual = calculator.multiply(a,b);
	 
	    int expected = 50;
	 
	    assertEquals(expected, actual);
	}
	
	
	
	
}
