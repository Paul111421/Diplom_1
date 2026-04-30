package com.tests.burger;

import org.junit.Assert;
import org.junit.Test;
import praktikum.Ingredient;

public class BurgerAddIngredientTest extends BurgerBaseTest{

    @Test
    public void burgerAddIngredientTest(){
        //Булочки обязательны, иначе метод getReceipt() не заработает за недостатком переменных
        burgerForTest.setBuns(bunsForTest.get(0));

        //Ингредиент для вноса в сам чек, Строка для сравнения на наличия
        //(receipt в String дают - надо и свою строку для сравнения, один и тот же тип. Просто впихнуть Ingredient не сработает,
        //как и строку без обработки - одно по типу не сходится, второе просто ссылку на переменную передаст в строковом формате)
        Ingredient sauceSourCream = ingredientsForTest.get(1);
        String sauceSourCreamString = String.format("= %s %s =%n", ingredientsForTest.get(1).getType().toString().toLowerCase(),
                ingredientsForTest.get(1).getName());

        burgerForTest.addIngredient(sauceSourCream);

        String receipt = burgerForTest.getReceipt();
        System.out.println(receipt);

        System.out.println(sauceSourCreamString);

        Assert.assertTrue(receipt.contains(sauceSourCreamString));
    }
}
