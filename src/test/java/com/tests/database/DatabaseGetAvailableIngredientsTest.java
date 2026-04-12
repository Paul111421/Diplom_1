package com.tests.database;

import org.junit.Assert;
import org.junit.Test;
import praktikum.Ingredient;
import praktikum.IngredientType;

import java.util.List;

public class DatabaseGetAvailableIngredientsTest extends DatabaseBaseTest {

    @Test
    public void databaseGetAvailableBunsTest(){

        List<Ingredient> ingredientsActual = databaseTest.availableIngredients();

        //Для покрытия работы метода достаточно один раз хоть одно значение проверить -
        //JaCoCo указывает как покрытие и конструктора и метода availableBuns()

        boolean isHotSauceAvailable = ingredientsActual.stream().
                anyMatch(ingredient -> ingredient.getType().equals(IngredientType.SAUCE)
                        && ingredient.getName().equals("hot sauce")
                        && ingredient.getPrice() == 100);

        Assert.assertTrue(isHotSauceAvailable);

    }
}
