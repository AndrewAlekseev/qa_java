package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FelineTest {



    @Test
    public void testEatMeatReturnListEatOfMeat() throws Exception {
        Feline feline = new Feline();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void testGetFamilyReturnFeline() throws Exception {
        Feline feline = new Feline();
        String expected = "Кошачьи";
        assertEquals(expected, feline.getFamily());
    }

    @Test
    public void testGetKittensReturnOne() throws Exception {
        Feline feline = new Feline();
        int expected = 1;
        assertEquals(expected, feline.getKittens());
    }
}
