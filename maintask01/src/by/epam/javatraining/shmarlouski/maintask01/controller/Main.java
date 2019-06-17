package by.epam.javatraining.shmarlouski.maintask01.controller;

import by.epam.javatraining.shmarlouski.maintask01.model.Vector;
import static by.epam.javatraining.shmarlouski.maintask01.model.VectorUtils.*;
import static by.epam.javatraining.shmarlouski.maintask01.model.VectorSorts.*;

/**
 * This is main class.
 *
 * @author Smarlouski Ihar
 * @version 1.1.1
 */

public class Main {

    public static void main(String[] args) {

        LOGGER.info("Program start");

        int N = 10;

        Vector vector = new Vector(N);

        fillVector(vector);

        double newElement1 = 3.1;

        vector.addElement(newElement1);

        vector.removeElement(1);

        double MinElement = findMinElement(vector);

        double maxElement = findMaxElement(vector);

        double arithmeticAverage = findArithmeticAverage(vector);

        double geometricAverage = findGeometricAverage(vector);

        boolean answer = isAscending(vector);

        boolean answer2 = isDescending(vector);

        int localMinElementPosition = findLocalMinElementPosition(vector);

        int localMaxElementPosition = findLocalMaxElementPosition(vector);

        int gotElementLinearSearch = hasElementLinearSearch(vector, 3);

        int gotElementBinarySearch = hasElementBinarySearch(vector, 5);

        reverseVector(vector);

        doBubbleSort(vector);

        doInsertionSort(vector);

        doSelectionSort(vector);

        doOneCircleForSort(vector);

        doQuickSort(vector, 0, vector.getLength() - 1);

        doMergeSort(vector, 0, vector.getLength() - 1);

        LOGGER.info("Program finish");
    }
}
