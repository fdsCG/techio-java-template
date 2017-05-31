package com.yourself;

import org.junit.Assert;
import org.junit.Test;

public class ExampleTest {

	@Test
	public void test() {
		Assert.assertEquals("Oops! sum(1, 5, -2) should return 4", 4, new Example().sum(1, 5, -2));
	}
}