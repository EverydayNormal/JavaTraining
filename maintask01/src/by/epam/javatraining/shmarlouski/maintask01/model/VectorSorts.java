package by.epam.javatraining.shmarlouski.maintask01.model;

import java.util.Arrays;

import static by.epam.javatraining.shmarlouski.maintask01.model.VectorUtils.*;

/**
 * This class contains different static methods for working with vector.
 *
 * @author Smarlouski Ihar
 * @version 1.1.1
 */

public class VectorSorts {

    public static void doBubbleSort(Vector vector) {

        if (!isValidSize(vector)) {
            LOGGER.warn("Can't do Bubble sort");
            return;
        }

        for (int i = vector.getLength() - 1; i > 0; i--) {
            for (int j = 1; j < vector.getLength(); j++) {
                if (vector.getElement(j) < vector.getElement(j - 1)) {
                    swapElements(vector, j, j - 1);
                }
            }
        }
        LOGGER.info("Vector was sorted by Bubble sort \n" + vector.toString());
    }

    public static void doInsertionSort(Vector vector) {

        if (!isValidSize(vector)) {
            LOGGER.warn("Can't do Insertion sort");
            return;
        }

        for (int i = 0; i < vector.getLength(); i++) {
            for (int j = i; j > 0; j--) {
                if (vector.getElement(j) < vector.getElement(j - 1)) {
                    swapElements(vector, j, j - 1);
                } else {
                    break;
                }
            }
        }
        LOGGER.info("Vector was sorted by Insertion sort \n" + vector.toString());
    }

    public static void doSelectionSort(Vector vector) {

        if (!isValidSize(vector)) {
            LOGGER.error("Can't do Selection sort");
            return;
        }

        for (int left = 0; left < vector.getLength(); left++) {
            int minIndex = left;
            for (int i = left + 1; i < vector.getLength(); i++) {
                if (vector.getElement(i) < vector.getElement(minIndex)) {
                    minIndex = i;
                }
            }
            swapElements(vector, left, minIndex);
        }
        LOGGER.info("Vector was sorted by Selection sort \n" + vector.toString());
    }

    public static void doOneCircleForSort(Vector vector) {

        if (!isValidSize(vector)) {
            LOGGER.error("Can't do One-Circle-For sort");
            return;
        }

        if (isAscending(vector)) {
            LOGGER.info("Vector was sorted by One-Circle-For sort \n" + vector.toString());
            return;
        }

        for (int i = 1; i < vector.getLength(); i++) {
            if (vector.getElement(i) < vector.getElement(i - 1)) {
                swapElements(vector, i, i - 1);
                doOneCircleForSort(vector);
            }
        }
    }

    public static void doQuickSort(Vector vector, int left, int right) {

        if (!isValidSize(vector)) {
            LOGGER.error("Can't do Quick sort");
            return;
        }

        if (isAscending(vector)) {
            LOGGER.info("Vector was sorted by Quick sort \n" + vector.toString());
            return;
        }

        if (left < right) {

            double pivot = vector.getElement(left + (right - left) / 2);

            int leftMarker = left;
            int rightMarker = right;

            while (leftMarker <= rightMarker) {

                while (vector.getElement(leftMarker) < pivot) {
                    leftMarker++;
                }

                while (vector.getElement(rightMarker) > pivot) {
                    rightMarker--;
                }

                if (leftMarker <= rightMarker) {
                    swapElements(vector, leftMarker, rightMarker);
                    leftMarker++;
                    rightMarker--;
                }
            }
            if (left < rightMarker) {
                doQuickSort(vector, left, rightMarker);
            }
            if (right > leftMarker) {
                doQuickSort(vector, leftMarker, right);
            }
        }
    }

    public static void doMergeSort(Vector vector, int left, int right) {

        if (!isValidSize(vector)) {
            LOGGER.error("Can't do Merge sort");
            return;
        }

        if (right > left) {
            int mid = left + (right - left) / 2;
            doMergeSort(vector, left, mid);
            doMergeSort(vector, mid + 1, right);

            double[] buf = Arrays.copyOf(vector.getVector(), vector.getLength());

            for (int k = left; k <= right; k++) {
                buf[k] = vector.getElement(k);
            }
            int i = left, j = mid + 1;
            for (int k = left; k <= right; k++) {

                if (i > mid) {
                    vector.setElement(k, buf[j]);
                    j++;
                } else if (j > right) {
                    vector.setElement(k, buf[i]);
                    i++;
                } else if (buf[j] < buf[i]) {
                    vector.setElement(k, buf[j]);
                    j++;
                } else {
                    vector.setElement(k, buf[i]);
                    i++;
                }
            }
        }

        if (isAscending(vector)) {
            LOGGER.info("Vector was sorted by Merge sort \n" + vector.toString());
        }
    }

}
