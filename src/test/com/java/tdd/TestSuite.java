/**
 * 
 */
package com.java.tdd;

import java.util.logging.Logger;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @author rahulbhatt
 *
 */
@RunWith(Suite.class)
@SuiteClasses({CalculatorTest.class, AnnotationsDemoImplTest.class})
public class TestSuite {
	  private static final Logger log = Logger.getLogger(TestSuite.class.getName());

	  @BeforeClass
	  public static void setupBeforeSuiteRuns() {
	    log.info("@BeforeClass - Runs one time, before the test suite.");
	  }

	  @AfterClass
	  public static void tearDownAfterSuiteRuns() {
	    log.info("@AfterClass - Runs one time, after all tests in the test suite.");
	  }
}
