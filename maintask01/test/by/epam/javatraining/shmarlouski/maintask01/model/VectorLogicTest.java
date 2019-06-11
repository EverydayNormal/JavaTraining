package by.epam.javatraining.shmarlouski.maintask01.model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This class contains different tests for vectorLogic class.
 *
 * @author Smarlouski Ihar
 * @version 1.1.0
 */


public class VectorLogicTest extends VectorLogic {

    @Test
    public void fillVectorTest() {

        double[] vectorTest = {0};
        vectorTest = fillVector(vectorTest);

        boolean expected = true;

        assertEquals(expected, vectorTest[0] > 0);
    }

    @Test
    public void findMinElementTest() {

        double[] vectorTest = {1, 5};
        double expected = 1.0;

        assertEquals(expected, findMinElement(vectorTest), 1);
    }

    @Test
    public void findMaxElementTest() {

        double[] vectorTest = {1, 5};
        double expected = 5.0;

        assertEquals(expected, findMaxElement(vectorTest), 1);
    }

    @Test
    public void findArithmeticAverageTest() {

        double[] vectorTest = {1, 5};
        double expected = 3.0;

        assertEquals(expected, findArithmeticAverage(vectorTest), 1);
    }

    @Test
    public void findGeometricAverageTest() {

        double[] vectorTest = {1, 5};
        double expected = 2.236;

        assertEquals(expected, findGeometricAverage(vectorTest), 1);
    }

    @Test
    public void isSortedTestAscending() {

        double[] vectorTest = {1, 5};
        boolean expected = true;

        assertEquals(expected, isSorted(vectorTest));
    }

    @Test
    public void isSortedTestDescending() {

        double[] vectorTest = {2, 1};
        boolean expected = true;

        assertEquals(expected, isSorted(vectorTest));
    }

    @Test
    public void isSortedTestFalse() {

        double[] vectorTest = {1, 5, 2};
        boolean expected = false;

        assertEquals(expected, isSorted(vectorTest));
    }

    @Test
    public void findLocalMinElementPositionTest() {

        double[] vectorTest = {1, 5, 1, 5};
        int expected = 2;

        assertEquals(expected, findLocalMinElementPosition(vectorTest));

    }

    @Test
    public void findLocalMinElementPositionTestFail() {

        double[] vectorTest = {1, 5, 1, 1, 5};
        int expected = -1;

        assertEquals(expected, findLocalMinElementPosition(vectorTest));

    }

    @Test
    public void findLocalMaxElementPositionTest() {

        double[] vectorTest = {1, 5, 1, 5};
        int expected = 1;

        assertEquals(expected, findLocalMaxElementPosition(vectorTest));
    }

    @Test
    public void findLocalMaxElementPositionTestFail() {

        double[] vectorTest = {1, 1, 1, 5};
        int expected = -1;

        assertEquals(expected, findLocalMaxElementPosition(vectorTest));
    }

    @Test
    public void hasElementLinearSearchTest() {

        double[] vectorTest = {1, 5, 3, 5};
        double element = 5;
        boolean expected = true;

        assertEquals(expected, hasElementLinearSearch(vectorTest, element));

    }

    @Test
    public void hasElementLinearSearchTestFail() {

        double[] vectorTest = {1, 5, 2, 5};
        double element = 3;
        boolean expected = false;

        assertEquals(expected, hasElementLinearSearch(vectorTest, element));

    }

    @Test
    public void hasElementBinarySearchTest() {

        double[] vectorTest = {1, 5, 3, 5};
        double element = 5;
        boolean expected = true;

        assertEquals(expected, hasElementBinarySearch(vectorTest, element));
    }

    @Test
    public void hasElementBinarySearchTestFail() {

        double[] vectorTest = {1, 5, 3, 5};
        double element = 2;
        boolean expected = false;

        assertEquals(expected, hasElementBinarySearch(vectorTest, element));
    }

    @Test
    public void reverseVectorTest() {

        double[] vectorTest = {1, 2, 5};
        vectorTest = reverseVector(vectorTest);
        double[] expectedVector = {5, 2, 1};

        assertArrayEquals(expectedVector, vectorTest, 1);
    }

    @Test
    public void doBubbleSortTest() {

        double[] vectorTest = {3, 1, 2};
        vectorTest = doBubbleSort(vectorTest);
        double[] expectedVector = {1, 2, 3};

        assertArrayEquals(expectedVector, vectorTest, 1);


    }

    @Test
    public void doInsertionSortTest() {

        double[] vectorTest = {3, 1, 2};
        vectorTest = doBubbleSort(vectorTest);
        double[] expectedVector = {1, 2, 3};

        assertArrayEquals(expectedVector, vectorTest, 1);
    }

    @Test
    public void doSelectionSortTest() {

        double[] vectorTest = {3, 1, 2};
        vectorTest = doBubbleSort(vectorTest);
        double[] expectedVector = {1, 2, 3};

        assertArrayEquals(expectedVector, vectorTest, 1);
    }

    @Test
    public void doOneCircleForSortTest() {

        double[] vectorTest = {3, 1, 2};
        vectorTest = doBubbleSort(vectorTest);
        double[] expectedVector = {1, 2, 3};

        assertArrayEquals(expectedVector, vectorTest, 1);
    }

    @Test
    public void doQuickSortTest() {

        double[] vectorTest = {3, 1, 2};
        vectorTest = doBubbleSort(vectorTest);
        double[] expectedVector = {1, 2, 3};

        assertArrayEquals(expectedVector, vectorTest, 1);
    }

    @Test
    public void doMergeSortTest() {

        double[] vectorTest = {3, 1, 2, 4, 5,6,7,9};
        vectorTest = doBubbleSort(vectorTest);
        double[] expectedVector = {1, 2, 3,4,5,6,7,9};

        assertArrayEquals(expectedVector, vectorTest, 1);
    }

    @Test
    public void addElement() {

        double[] vectorTest = {3, 1, 2};
        vectorTest = addElement(vectorTest, 6, 7);
        double[] expectedVector = {3, 1, 2, 6, 7};

        assertArrayEquals(expectedVector, vectorTest, 1);
    }

    @Test
    public void removeElement() {

        double[] vectorTest = {3, 1, 2};
        vectorTest = removeElement(vectorTest, 1);
        double[] expectedVector = {3, 2};

        assertArrayEquals(expectedVector, vectorTest, 1);
    }

    @Test
    public void removeElementOutOfRange() {

        double[] vectorTest = {3, 1, 2};
        vectorTest = removeElement(vectorTest, -13);
        double[] expectedVector = {3, 1, 2};

        assertArrayEquals(expectedVector, vectorTest, 1);
    }
}