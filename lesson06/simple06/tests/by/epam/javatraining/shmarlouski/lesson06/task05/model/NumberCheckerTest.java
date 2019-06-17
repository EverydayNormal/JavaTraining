package by.epam.javatraining.shmarlouski.lesson06.task05.model;

import static org.junit.Assert.*;

import org.junit.Test;

import static by.epam.javatraining.shmarlouski.lesson06.task05.model.NumberChecker.isPrimeNumber;

public class NumberCheckerTest {

    @Test
    public void testIsPrimeNumberIsZero() {

        int number = 0;
        boolean expected = false;

        assertEquals(expected, isPrimeNumber(number));

    }

    @Test
    public void testIsPrimeNumberIsTwo() {

        int number = 2;
        boolean expected = true;

        assertEquals(expected, isPrimeNumber(number));

    }

    @Test
    public void testIsPrimeNumberIsOne() {

        int number = 1;
        boolean expected = false;

        assertEquals(expected, isPrimeNumber(number));

    }

    @Test
    public void testIsPrimeNumberDivideByTwoWithoutRest() {

        int number = 44;
        boolean expected = false;

        assertEquals(expected, isPrimeNumber(number));

    }

    @Test
    public void testIsPrimeNumberLessThanOne() {

        int number = -12;
        boolean expected = false;

        assertEquals(expected, isPrimeNumber(number));

    }

    @Test
    public void testIsPrimeNumberIfNumberIsEven() {

        int number = 4;
        boolean expected = false;

        assertEquals(expected, isPrimeNumber(number));

    }

    @Test
    public void testIsPrimeNumberTrue() {

        int number = 17;
        boolean expected = true;

        assertEquals(expected, isPrimeNumber(number));

    }

    @Test
    public void testIsPrimeNumberFalse() {

        int number = 18;
        boolean expected = false;

        assertEquals(expected, isPrimeNumber(number));

    }

}
