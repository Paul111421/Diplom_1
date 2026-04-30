package com.tests.burger;

import org.junit.Assert;
import org.junit.Test;
import praktikum.Bun;

public class BurgerSetBunsTest extends BurgerBaseTest{

    @Test
    public void burgerSetBunsTest(){

        //Ингредиент для вноса в сам чек, Строка для сравнения на наличия
        //(receipt в String дают - надо и свою строку для сравнения, один и тот же тип. Просто впихнуть Ingredient не сработает,
        //как и строку без обработки - одно по типу не сходится, второе просто ссылку на переменную передаст в строковом формате)
        Bun blackBun = bunsForTest.get(0);
        String blackBunString = String.format("(==== %s ====)%n", bunsForTest.get(0).getName());

        burgerForTest.setBuns(blackBun);

        String receipt = burgerForTest.getReceipt();
        System.out.println(receipt);

        Assert.assertTrue(receipt.contains(blackBunString));
    }
}
