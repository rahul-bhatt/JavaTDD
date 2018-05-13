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
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author rahulbhatt
 *
 */
public class AnnotationsDemoImplTest {
	
	public static final Logger log = Logger.getLogger(AnnotationsDemoImplTest.class.getName());
	
	private AnnotationsDemoImpl annotationsDemoImpl;

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
		annotationsDemoImpl = new AnnotationsDemoImpl();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		log.info("@After: runs after each test in this class.");
	}

	@Ignore("SKIPPING THIS TEST!")
	@Test
	public void testReturn1() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testReturn2() {
		Integer expected = Integer.valueOf(2);
		assertEquals(expected, annotationsDemoImpl.return2());
	}

}
