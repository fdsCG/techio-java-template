package com.yourself;

import org.junit.Assert;
import org.junit.Test;

public class ExampleTest {

	@Test
	public void test() {
		try {
			Assert.assertEquals("Running sum(2, 3)...", 5, new Example().sum(2, 3));
			System.out.println("TECHIO> success true");
			System.out.println("TECHIO> message --channel \"Congrats!\" \"If you're using Java 8, the Arrays class provides a stream(int[] array) method which returns a sequential IntStream with the specified int array.\"");
			System.out.println("TECHIO> message --channel \"Congrats!\" \"int [] ns = {1,2,3,4};\"");
			System.out.println("TECHIO> message --channel \"Congrats!\" \"int sum = Arrays.stream(arr).sum(); //prints 10\"");
		} catch (AssertionError ae) {
			System.out.println("TECHIO> success false");
			System.out.println("TECHIO> message --channel \"Oops :(\" \"" + ae.getMessage() + "\"");
			System.out.println("TECHIO> message --channel \"Oops :(\" \"Did you try to accumulate all values into the sum variable?\"");
		}
	}
}