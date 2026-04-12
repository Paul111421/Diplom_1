package com.tests.burger;

import org.junit.Assert;
import org.junit.Test;

public class BurgerRemoveIngredientTest extends BurgerBaseTest{

    @Test
    public void burgerRemoveIngredientTest(){

        burgerForTest.setBuns(bunsForTest.get(0));

        burgerForTest.addIngredient(ingredientsForTest.get(1));
        burgerForTest.addIngredient(ingredientsForTest.get(2));

        System.out.println(burgerForTest.getReceipt());

        burgerForTest.removeIngredient(1);

        System.out.println(burgerForTest.getReceipt());

        Assert.assertFalse(burgerForTest.getReceipt().contains("sauce chili sauce"));
    }
}
