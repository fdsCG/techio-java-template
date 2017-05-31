package com.yourself;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class ExampleTest {

    @Test
    public  void test(){
        Assert.assertEquals("Did you return Hello World?", "Hello World!", Example.HelloWorld());
    }

    @Test
    public void visualisation() throws Exception {
        System.out.println("TECHIO> open --static-dir /project/answer/src/main/resources HelloWorld.html");
    }
}
