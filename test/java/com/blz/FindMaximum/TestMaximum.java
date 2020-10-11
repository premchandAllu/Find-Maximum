  
package com.blz.FindMaximum;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {

	@Test
	public void testIntegerMaximumAtFirstPosition() {
		Integer maximum=UserMaximum.findMaximum(81, 45, 18);
		boolean b;
		if(maximum.equals(81))
			b=true;
		else
			b=false;
		Assert.assertEquals(true, b);
	}
	
	@Test
	public void testIntegerMaximumAtSecondPosition() {
		Integer maximum=UserMaximum.findMaximum(18, 81, 45);
		boolean b;
		if(maximum.equals(81))
			b=true;
		else
			b=false;
		Assert.assertEquals(true, b);
	}
	
	@Test
	public void testIntegerMaximumAtThirdPosition() {
		Integer maximum=UserMaximum.findMaximum(18, 45, 81);
		boolean b;
		if(maximum.equals(81))
			b=true;
		else
			b=false;
		Assert.assertEquals(true, b);
	}
	
		@Test
		public void testFloatMaximumAtFirstPosition() {
			Float maximum=UserMaximum.findMaximum(81.1f, 45.5f, 18.8f);
			boolean b;
			if(maximum.equals(81.1f))
				b=true;
			else
				b=false;
			Assert.assertEquals(true, b);
		}
		
		@Test
		public void testFloatMaximumAtSecondPosition() {
			Float maximum=UserMaximum.findMaximum(18.8f, 81.1f, 45.5f);
			boolean b;
			if(maximum.equals(81.1f))
				b=true;
			else
				b=false;
			Assert.assertEquals(true, b);
		}
		
		@Test
		public void testFloatMaximumAtThirdPosition() {
			Float maximum=UserMaximum.findMaximum(18.8f, 45.5f, 81.1f);
			boolean b;
			if(maximum.equals(81.1f))
				b=true;
			else
				b=false;
			Assert.assertEquals(true, b);
		}
	
	@Test
	public void testStringMaximumAtFirstPosition() {
		String maximum = UserMaximum.findMaximum("Peach","Banana", "Apple");
		boolean b;
		if (maximum.equals("Peach"))
			b = true;
		else
			b = false;
		Assert.assertEquals(true, b);
	}

	@Test
	public void testStringMaximumAtSecondPosition() {
		String maximum = UserMaximum.findMaximum("Apple", "Peach", "Banana");
		boolean b;
		if (maximum.equals("Peach"))
			b = true;
		else
			b = false;
		Assert.assertEquals(true, b);
	}

	@Test
	public void testStringMaximumAtThirdPosition() {
		String maximum = UserMaximum.findMaximum("Apple", "Banana", "Peach");
		boolean b;
		if (maximum.equals("Peach"))
			b = true;
		else
			b = false;
		Assert.assertEquals(true, b);
	}
}