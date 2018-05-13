/**
 * 
 */
package com.java.tdd;

import static org.junit.Assert.*;

import java.util.logging.Logger;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author rahulbhatt
 *
 */
public class CalculatorTest {
	
	public static final Logger log = Logger.getLogger(CalculatorTest.class.getName());

	private Calculator calc;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		log.info("@BeforeClass: runs one time before any test in this class.");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		log.info("@AfterClass: runs one time after each test in this class.");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		log.info("@Before: runs before each test in this class.");
		calc = new Calculator();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		log.info("@After: runs after each test in this class.");
	}

	@Test
	public void testAdd() {
	    long result = 10 + 23 + (-1) + 16;
	    assertEquals(result, calc.add(10, 23, -1, 16));

	    result = 100 + 102;
	    assertEquals(result, calc.add(100 + 102));

	    result = 0;
	    assertEquals(result, calc.add(0));
	}

	@Test
	public void testSubtract() {
		long result = 100 - 34 - (-17) - 4;

	    assertEquals(result, calc.subtract(100, 34, -17, 4));

	    result = 0;

	    assertEquals(result, calc.subtract(0, 0, 0, 0));
	}
}
