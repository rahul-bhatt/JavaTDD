/**
 * 
 */
package com.java.tdd;

/**
 * @author rahulbhatt
 *
 */
public class Calculator implements Adder, Subtractor {

	/* (non-Javadoc)
	 * @see com.java.tdd.Subtractor#subtract(long[])
	 */
	@Override
	public long subtract(long... nums) {
		long result = nums[0];
		
		for(int i = 1; i < nums.length; i++) {
			result -= nums[i];
		}
		
		return result;
	}

	/* (non-Javadoc)
	 * @see com.java.tdd.Adder#add(long[])
	 */
	@Override
	public long add(long... nums) {
		long result = 0;
		
		for(long num: nums) {
			result += num;
		}
		
		return result;
	}
}
