package com.tests.database;

import org.junit.Assert;
import org.junit.Test;
import praktikum.Bun;

import java.util.List;

public class DatabaseGetAvailableBunsTest extends DatabaseBaseTest{

    @Test
    public void databaseGetAvailableBunsTest(){

        List<Bun> bunsActual = databaseTest.availableBuns();

        //Для покрытия работы метода достаточно один раз хоть одно значение проверить -
        //JaCoCo указывает как покрытие и конструктора и метода availableBuns()

        boolean isBlackBunAvailable = bunsActual.stream().
                anyMatch(bun -> bun.getName().equals("black bun") && bun.getPrice() == 100);

        Assert.assertTrue(isBlackBunAvailable);

    }
}
