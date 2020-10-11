  
package com.blz.FindMaximum;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {

	@Test
	public void testMaximumAtFirstPosition() {
		String maximum = UserMaximum.findMaximum("Peach","Banana", "Apple");
		boolean b;
		if (maximum.equals("Peach"))
			b = true;
		else
			b = false;
		Assert.assertEquals(true, b);
	}

	@Test
	public void testMaximumAtSecondPosition() {
		String maximum = UserMaximum.findMaximum("Apple", "Peach", "Banana");
		boolean b;
		if (maximum.equals("Peach"))
			b = true;
		else
			b = false;
		Assert.assertEquals(true, b);
	}

	@Test
	public void testMaximumAtThirdPosition() {
		String maximum = UserMaximum.findMaximum("Apple", "Banana", "Peach");
		boolean b;
		if (maximum.equals("Peach"))
			b = true;
		else
			b = false;
		Assert.assertEquals(true, b);
	}
}