package com.tests.burger;

import org.mockito.Mock;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Database;
import praktikum.Ingredient;

import java.util.List;

public class BurgerBaseTest {

    @Mock
    Burger burgerForTest = new Burger();

    @Mock
    List<Bun> bunsForTest = new Database().availableBuns();

    @Mock
    List<Ingredient> ingredientsForTest = new Database().availableIngredients();

}

