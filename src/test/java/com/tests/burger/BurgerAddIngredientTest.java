package com.tests.burger;

import org.junit.Test;

public class BurgerAddIngredientTest extends BurgerBaseTest{

    @Test
    public void burgerAddIngredientTest(){
        //Булочки обязательны, иначе метод getReceipt() не заработает за недостатком переменных
        burgerForTest.setBuns(bunsForTest.get(0));

        burgerForTest.addIngredient(ingredientsForTest.get(1));

        System.out.println(burgerForTest.getReceipt());
    }
}
