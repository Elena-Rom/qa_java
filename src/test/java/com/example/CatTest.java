package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void getSoundTest() {
        Cat cat = new Cat(feline);

        String actualResult = cat.getSound();
        String expectedResult = "Мяу";

        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getFoodTest() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");

        Mockito.when(feline.eatMeat()).thenReturn(expected);
        assertEquals(expected, cat.getFood());
    }
}
