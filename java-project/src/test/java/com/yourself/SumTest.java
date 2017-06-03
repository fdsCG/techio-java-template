package com.yourself;

import org.junit.Assert;
import org.junit.Test;

public class SumTest {

	@Test
	public void test() {
		try {
			Assert.assertEquals("Running sum(2, 3)...", 5, new Sum().sum(2, 3));
			Assert.assertEquals("Running sum(9, -3)...", 6, new Sum().sum(9, -3));
			System.out.println("TECHIO> success true");
			System.out.println("TECHIO> message --channel \"Congrats! :)\" \"Did you know since Java8 is out you can use streams?\"");
			System.out.println("TECHIO> message --channel \"Congrats! :)\" \"int[] ns = {1, 2, 3};\"");
			System.out.println("TECHIO> message --channel \"Congrats! :)\" \"int sum = Arrays.stream(ns).sum(); //prints 6\"");
		} catch (AssertionError ae) {
			System.out.println("TECHIO> success false");
			System.out.println("TECHIO> message --channel \"Oops :(\" \"" + ae.getMessage() + "\"");
			System.out.println("TECHIO> message --channel \"Hint\" \"Did you try to accumulate all values into the variable 'sum'?\"");
		}
	}
}