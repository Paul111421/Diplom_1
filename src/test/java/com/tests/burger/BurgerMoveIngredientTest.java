package com.tests.burger;

import org.junit.Assert;
import org.junit.Test;

public class BurgerMoveIngredientTest extends BurgerBaseTest {
    @Test
    public void burgerMoveIngredientTest(){

        burgerForTest.setBuns(bunsForTest.get(0));

        burgerForTest.addIngredient(ingredientsForTest.get(1)); //sour cream
        burgerForTest.addIngredient(ingredientsForTest.get(2)); //chili sauce
        burgerForTest.addIngredient(ingredientsForTest.get(3)); //cutlet

        String burgerReceiptBefore = burgerForTest.getReceipt();
        int sourCreamIndexBefore = burgerReceiptBefore.indexOf("= sauce sour cream =");

        System.out.println(burgerForTest.getReceipt());

        burgerForTest.moveIngredient(0,2); //меняем местами sour cream на самый низ
        String burgerReceiptAfter = burgerForTest.getReceipt();

        int sourCreamIndexAfter = burgerReceiptAfter.indexOf("= sauce sour cream =");

        Assert.assertTrue(sourCreamIndexBefore < sourCreamIndexAfter);
        System.out.println(burgerForTest.getReceipt());


    }
}
