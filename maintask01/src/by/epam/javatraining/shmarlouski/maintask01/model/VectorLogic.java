package by.epam.javatraining.shmarlouski.maintask01.model;

import java.util.Arrays;
import java.util.Random;

import org.apache.log4j.Logger;

/**
 * This class contains different static methods for working with vector.
 *
 * @author Smarlouski Ihar
 * @version 1.1.0
 */

public class VectorLogic {

    private static final Logger LOGGER = Logger.getLogger(VectorLogic.class);
    private static final Random RANDOM = new Random();

    private static boolean isValidSize(double[] vector) {
        boolean validity = true;
        if (vector == null || vector.length <= 0) {
            LOGGER.error(" Vector shouldn't be null and must have positive size");
            validity = false;
        }
        return validity;
    }

    public static double[] fillVector(double[] vector) {

        if (!isValidSize(vector)) {
            return new double[0];
        }

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (RANDOM.nextDouble() * 10 + 1); // +1 for "value>0" , int for better look
        }
        LOGGER.info("Vector was filled \n" + Arrays.toString(vector));
        return vector;
    }

    public static double findMinElement(double[] vector) {

        if (!isValidSize(vector)) {
            return -1;
        }

        double minElement = vector[0];

        for (int i = 1; i < vector.length; i++) {
            if (minElement > vector[i]) {
                minElement = vector[i];
            }
        }
        LOGGER.info("Smallest element value is " + minElement);
        return minElement;
    }

    public static double findMaxElement(double[] vector) {

        if (!isValidSize(vector)) {
            return -1;
        }

        double maxElement = vector[0];
        for (int i = 1; i < vector.length; i++) {
            if (vector[i] > maxElement) {
                maxElement = vector[i];
            }
        }
        LOGGER.info("Biggest element value is " + maxElement);
        return maxElement;
    }

    public static double findArithmeticAverage(double[] vector) {

        if (!isValidSize(vector)) {
            return -1;
        }

        double arithmeticAverage = 0;
        double sumOfAllElements = 0;

        for (int i = 0; i < vector.length; i++) {
            sumOfAllElements += vector[i];
        }

        double numberOfElements = vector.length;
        arithmeticAverage = sumOfAllElements / numberOfElements;

        LOGGER.info("Arithmetic average of vector's values is " + arithmeticAverage);
        return arithmeticAverage;
    }

    public static double findGeometricAverage(double[] vector) {

        if (!isValidSize(vector)) {
            return -1;
        }

        double numbersMultiply = 1;
        for (int i = 0; i < vector.length; i++) {
            numbersMultiply *= vector[i];
        }
        double geometricAverage = Math.pow(numbersMultiply, 1.0 / vector.length);

        LOGGER.info("Geometric average of vector's values is " + geometricAverage);
        return geometricAverage;
    }

    public static boolean isSorted(double[] vector) {

        if (!isValidSize(vector)) {
            return false;
        }

        boolean arisingOfNumbers = true;
        for (int i = 1; i < vector.length; i++) {
            if (vector[i] < vector[i - 1]) {
                arisingOfNumbers = false;
                break;
            }
        }

        boolean descendingOfNumbers = true;
        for (int i = 1; i < vector.length; i++) {
            if (vector[i] > vector[i - 1]) {
                descendingOfNumbers = false;
                break;
            }
        }

        LOGGER.info("Order in a vector is " + (arisingOfNumbers || descendingOfNumbers));
        return arisingOfNumbers || descendingOfNumbers;
    }

    public static int findLocalMinElementPosition(double[] vector) {

        if (!isValidSize(vector)) {
            return -1;
        }

        int position = -1;
        //except first and last elements because they don't have both neighbors
        for (int i = 1; i < vector.length - 1; i++) {
            if (vector[i] < vector[i - 1] && vector[i] < vector[i + 1]) {
                position = i;
                break;
            }
        }

        LOGGER.info("Position of local smallest element in vector is " + position);
        return position;
    }

    public static int findLocalMaxElementPosition(double[] vector) {

        if (!isValidSize(vector)) {
            return -1;
        }

        int position = -1;

        //except first and last elements because they don't have both neighbors
        for (int i = 1; i < vector.length - 1; i++) {
            if (vector[i] > vector[i - 1] && vector[i] > vector[i + 1]) {
                position = i;
                break;
            }
        }

        LOGGER.info("Position of local biggest element in vector is " + position);
        return position;
    }

    public static boolean hasElementLinearSearch(double[] vector, double element) {

        if (!isValidSize(vector)) {
            return false;
        }

        boolean answer = false;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == element) {
                answer = true;
                break;
            }
        }
        LOGGER.info("Availability of " + element + " is " + answer);
        return answer;
    }

    public static boolean hasElementBinarySearch(double[] vector, double element) {

        if (!isValidSize(vector)) {
            return false;
        }

        doBubbleSort(vector);
        boolean answer = false;

        int leftBorder = 0;
        int rightBorder = vector.length - 1;

        while (leftBorder <= rightBorder) {

            int middle = (leftBorder + rightBorder) / 2;
            if (element == vector[middle]) {
                answer = true;
                break;
            }
            if (element > vector[middle]) {
                leftBorder = middle + 1;
            } else {
                rightBorder = middle - 1;
            }
        }
        LOGGER.info("Availability of " + element + " is " + answer);
        return answer;
    }

    public static double[] reverseVector(double[] vector) {

        if (!isValidSize(vector)) {
            return new double[0];
        }

        int leftBorder = 0;
        int rightBorder = vector.length - 1;

        while (leftBorder < rightBorder) {
            swapElements(vector, leftBorder, rightBorder);
            leftBorder++;
            rightBorder--;
        }
        LOGGER.info("Vector's elements was reversed \n" + Arrays.toString(vector));
        return vector;
    }

    public static double[] doBubbleSort(double[] vector) {

        if (!isValidSize(vector)) {
            return new double[0];
        }

        for (int i = vector.length - 1; i > 0; i--) {
            for (int j = 1; j < vector.length; j++) {
                if (vector[j] < vector[j - 1]) {
                    swapElements(vector, j, j - 1);
                }
            }
        }
        LOGGER.info("Vector was sorted by Bubble sort \n" + Arrays.toString(vector));
        return vector;
    }

    public static double[] doInsertionSort(double[] vector) {

        if (!isValidSize(vector)) {
            return new double[0];
        }

        for (int left = 0; left < vector.length; left++) {
            double value = vector[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < vector[i]) {
                    vector[i + 1] = vector[i];
                } else {
                    break;
                }

            }
            vector[i + 1] = value;
        }
        LOGGER.info("Vector was sorted by Insertion sort \n" + Arrays.toString(vector));
        return vector;
    }

    public static double[] doSelectionSort(double[] vector) {

        if (!isValidSize(vector)) {
            return new double[0];
        }

        for (int left = 0; left < vector.length; left++) {
            int minIndex = left;
            for (int i = left + 1; i < vector.length; i++) {
                if (vector[i] < vector[minIndex]) {
                    minIndex = i;
                }
            }
            swapElements(vector, left, minIndex);
        }
        LOGGER.info("Vector was sorted by Selection sort \n" + Arrays.toString(vector));
        return vector;
    }

    public static double[] doOneCircleForSort(double[] vector) {

        if (!isValidSize(vector)) {
            return new double[0];
        }

        for (int i = 1; i < vector.length; i++) {
            if (vector[i] < vector[i - 1]) {
                swapElements(vector, i, i - 1);
                doOneCircleForSort(vector);
            }
        }
        return vector;
    }

    public static double[] doQuickSort(double[] vector, int left, int right) {

        if (!isValidSize(vector)) {
            return new double[0];
        }


        if (left < right) {

            double pivot = vector[left + (right - left) / 2];

            int leftMarker = left;
            int rightMarker = right;

            while (leftMarker <= rightMarker) {

                while (vector[leftMarker] < pivot) {
                    leftMarker++;
                }

                while (vector[rightMarker] > pivot) {
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
        return vector;
    }

    public static double[] doMergeSort(double[] vector, int left, int right) {

        if (!isValidSize(vector)) {
            return new double[0];
        }

        if (right > left) {
            int mid = left + (right - left) / 2;
            doMergeSort(vector, left, mid);
            doMergeSort(vector, mid + 1, right);

            double[] buf = Arrays.copyOf(vector, vector.length);

            for (int k = left; k <= right; k++) {
                buf[k] = vector[k];
            }
            int i = left, j = mid + 1;
            for (int k = left; k <= right; k++) {

                if (i > mid) {
                    vector[k] = buf[j];
                    j++;
                } else if (j > right) {
                    vector[k] = buf[i];
                    i++;
                } else if (buf[j] < buf[i]) {
                    vector[k] = buf[j];
                    j++;
                } else {
                    vector[k] = buf[i];
                    i++;
                }
            }
        }
        return vector;
    }

    private static void swapElements(double[] vector, int index1, int index2) {
        double temp = vector[index1];
        vector[index1] = vector[index2];
        vector[index2] = temp;
    }

    public static double[] addElement(double[] vector, double... element) {

        if (!isValidSize(vector)) {
            return new double[0];
        }

        double[] newVector = Arrays.copyOf(vector, vector.length + element.length);

        for (int i = vector.length, j = 0; i < newVector.length; i++) {
            newVector[i] = element[j];
            j++;
        }
        LOGGER.info("After adding elements vector look like \n" + Arrays.toString(newVector));
        return newVector;
    }

    public static double[] removeElement(double[] vector, int position) {

        if (!isValidSize(vector)) {
            return new double[0];
        }

        if (position >= vector.length || position < 0) {
            LOGGER.error("There is no such element position");
            return vector;
        }

        double[] newVector = new double[vector.length - 1];
/*
        if (position == 0){

            return newVector = Arrays.copyOfRange(vector, 1, vector.length-1);
        }

        if (position == vector.length-1){
            return newVector = Arrays.copyOf(vector, vector.length - 1);
        }
*/

        double[] firstPart = Arrays.copyOfRange(vector, 0, position);
        double[] secondPart = Arrays.copyOfRange(vector, position + 1, vector.length);
        newVector = addElement(firstPart, secondPart);

        LOGGER.info("Element " + vector[position] + " was deleted \n" + Arrays.toString(newVector));

        return newVector;
    }

}
