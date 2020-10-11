package com.blz.FindMaximum;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {

	@Test
	public void testMaximumAtFirstPosition() {
		Float maximum=UserMaximum.findMaximum(81.1f, 45.5f, 18.8f);
		boolean b;
		if(maximum.equals(81.1f))
			b=true;
		else
			b=false;
		Assert.assertEquals(true, b);
	}
	
	@Test
	public void testMaximumAtSecondPosition() {
		Float maximum=UserMaximum.findMaximum(18.8f, 81.1f, 45.5f);
		boolean b;
		if(maximum.equals(81.1f))
			b=true;
		else
			b=false;
		Assert.assertEquals(true, b);
	}
	
	@Test
	public void testMaximumAtThirdPosition() {
		Float maximum=UserMaximum.findMaximum(18.8f, 45.5f, 81.1f);
		boolean b;
		if(maximum.equals(81.1f))
			b=true;
		else
			b=false;
		Assert.assertEquals(true, b);
	}
}