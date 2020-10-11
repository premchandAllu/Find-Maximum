package com.blz.FindMaximum;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {

	@Test
	public void testMaximumAtFirstPosition() {
		Integer maximum=UserMaximum.findMaximum(81, 45, 18);
		boolean b;
		if(maximum.equals(81))
			b=true;
		else
			b=false;
		Assert.assertEquals(true, b);
	}
	
	@Test
	public void testMaximumAtSecondPosition() {
		Integer maximum=UserMaximum.findMaximum(18, 81, 45);
		boolean b;
		if(maximum.equals(81))
			b=true;
		else
			b=false;
		Assert.assertEquals(true, b);
	}
	
	@Test
	public void testMaximumAtThirdPosition() {
		Integer maximum=UserMaximum.findMaximum(18, 45, 81);
		boolean b;
		if(maximum.equals(81))
			b=true;
		else
			b=false;
		Assert.assertEquals(true, b);
	}
}