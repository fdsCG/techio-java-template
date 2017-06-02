package com.yourself;

import org.junit.Assert;
import org.junit.Test;

public class ExampleTest {

	@Test
	public void test() {
		try {
			Assert.assertEquals("sum(1, 5, -2) => ", 4, new Example().sum(1, 5, -2));
		} catch (AssertionError ae) {
			System.out.println("TECHIO> message --channel \"Oops :(\" \"" + ae.getMessage() + "\"");
			
			throw ae;
		}
	}
}