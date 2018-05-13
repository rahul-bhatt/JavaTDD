/**
 * 
 */
package com.java.tdd;

/**
 * @author rahulbhatt
 *
 */
public class AnnotationsDemoImpl implements AnnotationsDemo {

	/* (non-Javadoc)
	 * @see com.java.tdd.AnnotationsDemo#return1()
	 */
	@Override
	public Integer return1() {
		return Integer.valueOf(1);
	}

	/* (non-Javadoc)
	 * @see com.java.tdd.AnnotationsDemo#return2()
	 */
	@Override
	public Integer return2() {
		return Integer.valueOf(2);
	}

}
