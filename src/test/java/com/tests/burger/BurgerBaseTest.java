package com.tests.burger;

import org.junit.Before;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BurgerBaseTest {

    Burger burgerForTest = new Burger();
    List<Bun> bunsForTest = mock(List.class);
    List<Ingredient> ingredientsForTest = mock(List.class);

    //Выглядит громоздко, но если совсем разрывать зависимость - пусть так.
    @Before
    public void setUp(){

        when(bunsForTest.get(0)).thenReturn(new Bun("black bun", 100));

        //Одно неудобно - с типом ингредиентов разрыв не выйдет, иначе объект класса не вернётся...
        when(ingredientsForTest.get(1)).thenReturn(new Ingredient(IngredientType.SAUCE, "sour cream", 200));
        when(ingredientsForTest.get(2)).thenReturn(new Ingredient(IngredientType.SAUCE, "chili sauce", 300));
        when(ingredientsForTest.get(3)).thenReturn(new Ingredient(IngredientType.FILLING, "cutlet", 100));

    }
}

