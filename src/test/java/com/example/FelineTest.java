package com.example;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void getFamilyTest(){
        assertEquals("Кошачьи", feline.getFamily());
    }
    @Test
    public void getKittensNoParamTest(){
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensParamTest(){
        assertEquals(3, feline.getKittens(3));
    }

    @Test
    public void eatMeatTest() throws Exception {
        assertEquals(Arrays.asList("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }
}
