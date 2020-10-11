  
package com.blz.FindMaximum;


import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {

	UserMaximum userMax1 = new UserMaximum<Integer>();
	UserMaximum userMax2 = new UserMaximum<Float>();
	UserMaximum userMax3 = new UserMaximum<String>();

	@Test
	public void testIntegerMaximumAtFirstPosition() {
		userMax1.findMaximum(23, 12, 15);
		Assert.assertEquals(23, userMax1.printMax());
		userMax1.toPrintMaximum();
	}

	@Test
	public void testIntegerMaximumAtSecondPosition() {
		userMax1.findMaximum(10, 20, 15);
		Assert.assertEquals(20, userMax1.printMax());
		userMax1.toPrintMaximum();
	}

	@Test
	public void testIntegerMaximumAtThirdPosition() {
		userMax1.findMaximum(23, 12, 40);
		Assert.assertEquals(40, userMax1.printMax());
		userMax1.toPrintMaximum();
	}

	@Test
	public void testForMoreThanIntegers() {
		userMax1.findMaximum(23, 12, 2, 40, 90);
		Assert.assertEquals(90, userMax1.printMax());
		userMax1.toPrintMaximum();
	}

	@Test
	public void testFloatMaximumAtFirstPosition() {
		userMax2.findMaximum(23.2f, 12.4f, 15.6f);
		Assert.assertEquals(23.2f, userMax2.printMax());
		userMax2.toPrintMaximum();
	}

	@Test
	public void testFloatMaximumAtSecondPosition() {
		userMax2.findMaximum(12.5f, 29.6f, 9.8f);
		Assert.assertEquals(29.6f, userMax2.printMax());
		userMax2.toPrintMaximum();
	}

	@Test
	public void testFloatMaximumAtThirdPosition() {
		userMax2.findMaximum(14.5f, 9.2f, 15.1f);
		Assert.assertEquals(15.1f, userMax2.printMax());
		userMax2.toPrintMaximum();
	}

	@Test
	public void testForMoreThanFloatValues() {
		userMax2.findMaximum(23.2f, 12.4f, 15.6f, 56.7f, 9.2f);
		Assert.assertEquals(56.7f, userMax2.printMax());
		userMax2.toPrintMaximum();
	}

	@Test
	public void testStringMaximumAtFirstPosition() {
		userMax3.findMaximum("Pineapple", "Peach", "Banana");
		Assert.assertEquals("Pineapple", userMax3.printMax());
		userMax3.toPrintMaximum();
	}

	@Test
	public void testStringMaximumAtSecondPosition() {
		userMax3.findMaximum("Apple", "Peach", "Banana");
		Assert.assertEquals("Peach", userMax3.printMax());
		userMax3.toPrintMaximum();
	}

	@Test
	public void testStringMaximumAtThirdPosition() {
		userMax3.findMaximum("Apple", "Banana", "Peach1");
		Assert.assertEquals("Peach1", userMax3.printMax());
		userMax3.toPrintMaximum();
	}

	@Test
	public void testForMoreThanStrings() {
		userMax3.findMaximum("Apple", "Banana", "Peach", "Pomegranate", "Kiwi");
		Assert.assertEquals("Pomegranate", userMax3.printMax());
		userMax3.toPrintMaximum();
	}
}