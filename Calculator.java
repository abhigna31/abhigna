package aa;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Calculator {
	Calc calculator;

	@Before
	public void init() {
		calculator = new Calc();
		System.out.println("object is created");
	}

	@After
	public void destroy() {
		calculator = null;
		System.out.println("object is destroyed");
	}

	@Test
	public void test() {
	assertEquals(5, calculator.add(2, 3));
	}

}
