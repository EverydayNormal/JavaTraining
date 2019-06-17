package by.epam.javatraining.shmarlouski.maintask01.model;

import org.junit.Test;

import static by.epam.javatraining.shmarlouski.maintask01.model.VectorSorts.*;
import static org.junit.Assert.*;

/**
 * This class contains different static methods for working with vector.
 *
 * @author Smarlouski Ihar
 * @version 1.1.1
 */


public class VectorSortsTest {
    @Test
    public void doBubbleSortVectorValidSize() throws Exception {

        Vector vector = new Vector(0);
        vector.addElement(3, 2, 1);
        double[] sortedArray = {1, 2, 3};
        doBubbleSort(vector);

        assertArrayEquals(sortedArray, vector.getVector(), 0.1);
    }

    @Test(expected = NullPointerException.class)
    public void doBubbleSortVectorInvalidSize() throws Exception {

        Vector vector = null;
        double[] sortedArray = {1, 2, 3};
        doBubbleSort(vector);

        assertArrayEquals(sortedArray, vector.getVector(), 0.1);
    }

    @Test
    public void doBubbleSortTest() throws Exception {

        Vector vector = new Vector(0);
        vector.addElement(5, 4, 3);
        double[] sortedArray = {3, 4, 5};
        doBubbleSort(vector);

        assertArrayEquals(sortedArray, vector.getVector(), 0.1);

    }

    @Test
    public void doInsertionSortVectorValidSize() throws Exception {

        Vector vector = new Vector(0);
        vector.addElement(3, 2, 1);
        double[] sortedArray = {1, 2, 3};
        doInsertionSort(vector);

        assertArrayEquals(sortedArray, vector.getVector(), 0.1);

    }

    @Test(expected = NullPointerException.class)
    public void doInsertionSortVectorInvalidSize() throws Exception {

        Vector vector = null;
        vector.addElement(3, 2, 1);
        double[] sortedArray = {1, 2, 3};
        doInsertionSort(vector);

        assertArrayEquals(sortedArray, vector.getVector(), 0.1);
    }

    @Test
    public void doInsertionSortTest() throws Exception {

        Vector vector = new Vector(0);
        vector.addElement(3.1, 2.1, 1.1);
        double[] sortedArray = {1.1, 2.1, 3.1};
        doInsertionSort(vector);

        assertArrayEquals(sortedArray, vector.getVector(), 0.1);

    }

    @Test
    public void doSelectionSortVectorValidSize() throws Exception {

        Vector vector = new Vector(0);
        vector.addElement(5, 4, 3);
        double[] sortedArray = {3, 4, 5};
        doSelectionSort(vector);

        assertArrayEquals(sortedArray, vector.getVector(), 0.1);

    }

    @Test(expected = NullPointerException.class)
    public void doSelectionSortVectorInvalidSize() throws Exception {

        Vector vector = null;
        vector.addElement(3, 2, 1);
        double[] sortedArray = {1, 2, 3};
        doSelectionSort(vector);

        assertArrayEquals(sortedArray, vector.getVector(), 0.1);
    }

    @Test
    public void doSelectionSortTest() throws Exception {

        Vector vector = new Vector(0);
        vector.addElement(3.2, 2.2, 1.2);
        double[] sortedArray = {1.2, 2.2, 3.2};
        doSelectionSort(vector);

        assertArrayEquals(sortedArray, vector.getVector(), 0.1);

    }

    @Test
    public void doOneCircleForSortVectorValidSize() throws Exception {

        Vector vector = new Vector(0);
        vector.addElement(5, 4, 3);
        double[] sortedArray = {3, 4, 5};
        doOneCircleForSort(vector);

        assertArrayEquals(sortedArray, vector.getVector(), 0.1);

    }

    @Test(expected = NullPointerException.class)
    public void doOneCircleForSortVectorInvalidSize() throws Exception {

        Vector vector = null;
        vector.addElement(3, 2, 1);
        double[] sortedArray = {1, 2, 3};
        doOneCircleForSort(vector);

        assertArrayEquals(sortedArray, vector.getVector(), 0.1);
    }

    @Test
    public void doOneCircleForSortIsAscendingOrder() throws Exception {

        Vector vector = new Vector(0);
        vector.addElement(1, 2, 3, 4);
        double[] sortedArray = {1, 2, 3, 4};
        doOneCircleForSort(vector);

        assertArrayEquals(sortedArray, vector.getVector(), 0.1);

    }

    @Test
    public void doOneCircleForSortNoAscendingOrder() throws Exception {

        Vector vector = new Vector(0);
        vector.addElement(32, 22, 12);
        double[] sortedArray = {12, 22, 32};
        doOneCircleForSort(vector);

        assertArrayEquals(sortedArray, vector.getVector(), 0.1);

    }

    @Test
    public void doQuickSortVectorValidSize() throws Exception {

        Vector vector = new Vector(0);
        vector.addElement(5, 4, 3);
        double[] sortedArray = {3, 4, 5};
        doQuickSort(vector, 0, vector.getLength() - 1);

        assertArrayEquals(sortedArray, vector.getVector(), 0.1);

    }

    @Test(expected = NullPointerException.class)
    public void doQuickSortVectorInvalidSize() throws Exception {

        Vector vector = null;
        vector.addElement(3, 2, 1);
        double[] sortedArray = {1, 2, 3};
        doQuickSort(vector, 0, vector.getLength() - 1);

        assertArrayEquals(sortedArray, vector.getVector(), 0.1);
    }

    @Test
    public void doQuickSortIsAscendingOrder() throws Exception {

        Vector vector = new Vector(0);
        vector.addElement(1, 2, 3, 4);
        double[] sortedArray = {1, 2, 3, 4};
        doQuickSort(vector, 0, vector.getLength() - 1);

        assertArrayEquals(sortedArray, vector.getVector(), 0.1);

    }

    @Test
    public void doQuickSortNoAscendingOrder() throws Exception {

        Vector vector = new Vector(0);
        vector.addElement(32, 22, 12);
        double[] sortedArray = {12, 22, 32};
        doQuickSort(vector, 0, vector.getLength() - 1);

        assertArrayEquals(sortedArray, vector.getVector(), 0.1);

    }

    @Test
    public void doQuickSortInvalidParameters() throws Exception {
        //will no sort at all
        Vector vector = new Vector(0);
        vector.addElement(32, 22, 12);
        double[] sortedArray = {32, 22, 12};
        doQuickSort(vector, 1, 1);

        assertArrayEquals(sortedArray, vector.getVector(), 0.1);

    }

    @Test
    public void doMergeSortVectorValidSize() throws Exception {

        Vector vector = new Vector(0);
        vector.addElement(5, 4, 3);
        double[] sortedArray = {3, 4, 5};
        doMergeSort(vector, 0, vector.getLength() - 1);

        assertArrayEquals(sortedArray, vector.getVector(), 0.1);

    }

    @Test(expected = NullPointerException.class)
    public void doMergeSortVectorInvalidSize() throws Exception {

        Vector vector = null;
        vector.addElement(3, 2, 1);
        double[] sortedArray = {1, 2, 3};
        doMergeSort(vector, 0, vector.getLength() - 1);

        assertArrayEquals(sortedArray, vector.getVector(), 0.1);
    }

    @Test
    public void doMergeSortIsAscendingOrder() throws Exception {

        Vector vector = new Vector(0);
        vector.addElement(1, 2, 3, 4);
        double[] sortedArray = {1, 2, 3, 4};
        doMergeSort(vector, 0, vector.getLength() - 1);

        assertArrayEquals(sortedArray, vector.getVector(), 0.1);

    }

    @Test
    public void doMergeSortNoAscendingOrder() throws Exception {

        Vector vector = new Vector(0);
        vector.addElement(32, 22, 12);
        double[] sortedArray = {12, 22, 32};
        doMergeSort(vector, 0, vector.getLength() - 1);

        assertArrayEquals(sortedArray, vector.getVector(), 0.1);

    }

    @Test
    public void doMergeSortInvalidParameters() throws Exception {
        //will no sort at all
        Vector vector = new Vector(0);
        vector.addElement(32, 22, 12);
        double[] sortedArray = {32, 22, 12};
        doMergeSort(vector, 1, 1);

        assertArrayEquals(sortedArray, vector.getVector(), 0.1);

    }


}