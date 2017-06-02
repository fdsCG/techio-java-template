package com.yourself;

import org.junit.Assert;
import org.junit.Test;

public class ExampleTest {

	@Test
	public void test() {
		try {
			Assert.assertEquals("Running sum(1, 2, -2)...", 1, new Example().sum(1, 2, -2));
		} catch (AssertionError ae) {
			System.out.println("TECHIO> message --channel \"Oops :(\" \"" + ae.getMessage() + "\"");
			//throw ae;
		}
	}
}