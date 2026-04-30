package com.tests.bun;

import org.junit.Assert;
import org.junit.Test;

public class BunGetPriceTest extends BunBaseTest{

    @Test
    public void bunGetPriceTest(){

        float bunPriceReturn = bun.getPrice();

        Assert.assertEquals(bunPriceForTest, bunPriceReturn, 0);
    }
}
