package com.tests.burger;

import org.junit.Test;

public class BurgerSetBunsTest extends BurgerBaseTest{

    @Test
    public void burgerSetBunsTest(){

        burgerForTest.setBuns(bunsForTest.get(0));

        System.out.println(burgerForTest.getReceipt());
    }
}
