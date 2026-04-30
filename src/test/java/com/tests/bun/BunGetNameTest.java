package com.tests.bun;


import org.junit.Assert;
import org.junit.Test;

public class BunGetNameTest extends BunBaseTest{

    @Test
    public void bunGetNameTest(){

        String bunNameReturn = bun.getName();

        Assert.assertEquals(bunNameForTest, bunNameReturn);
    }

}
