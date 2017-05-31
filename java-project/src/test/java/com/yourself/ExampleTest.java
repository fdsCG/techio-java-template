package com.yourself;

import org.junit.Assert;
import org.junit.Test;

public class ExampleTest {

	@Test
	public void test() {
		Assert.assertEquals("Did you return Hello World?", 4, Example.sum(1, 5, -2));
	}
}
