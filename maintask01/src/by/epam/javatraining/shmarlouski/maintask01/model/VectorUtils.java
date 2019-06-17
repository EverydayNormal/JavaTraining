package by.epam.javatraining.shmarlouski.maintask01.model;

import java.util.Random;

import org.apache.log4j.Logger;

import static by.epam.javatraining.shmarlouski.maintask01.model.VectorSorts.doBubbleSort;

/**
 * This class contains different static methods for working with vector.
 *
 * @author Smarlouski Ihar
 * @version 1.1.1
 */

public class VectorUtils {

    public static final Logger LOGGER = Logger.getLogger(VectorUtils.class);
    private static final Random RANDOM = new Random();

    //almost pointless native check
    public static boolean isValidSize(Vector vector) {

        boolean validity = true;
        if (vector == null) {
            LOGGER.warn(" Vector shouldn't be null");
            validity = false;
        }
        return validity;
    }

    public static void fillVector(Vector vector) {

        if (!isValidSize(vector)) {
            LOGGER.warn("Can't fill the vector");
            return;
        }

        for (int i = 0; i < vector.getLength(); i++) {
            vector.setElement(i, (int) (RANDOM.nextDouble() * 10 + 1)); // +1 for "value>0" , int for better look
        }
        LOGGER.info("Vector was filled \n" + vector.toString());
    }

    public static double findMinElement(Vector vector) {

        if (!isValidSize(vector)) {
            return -1;
        }

        double minElement = vector.getElement(0);

        for (int i = 1; i < vector.getLength(); i++) {
            if (minElement > vector.getElement(i)) {
                minElement = vector.getElement(i);
            }
        }
        LOGGER.info("Smallest vector's element value is " + minElement);
        return minElement;
    }

    public static double findMaxElement(Vector vector) {

        if (!isValidSize(vector)) {
            return -1;
        }

        double maxElement = vector.getElement(0);
        for (int i = 1; i < vector.getLength(); i++) {
            if (vector.getElement(i) > maxElement) {
                maxElement = vector.getElement(i);
            }
        }
        LOGGER.info("Biggest vector's element value is " + maxElement);
        return maxElement;
    }

    public static double findArithmeticAverage(Vector vector) {

        if (!isValidSize(vector)) {
            return -1;
        }

        double sumOfAllElements = 0;

        for (int i = 0; i < vector.getLength(); i++) {
            sumOfAllElements += vector.getElement(i);
        }

        double numberOfElements = vector.getLength();
        double arithmeticAverage = sumOfAllElements / numberOfElements;

        LOGGER.info("Arithmetic average of vector's values is " + arithmeticAverage);
        return arithmeticAverage;
    }

    public static double findGeometricAverage(Vector vector) {

        if (!isValidSize(vector)) {
            return -1;
        }

        double numbersMultiply = 1;
        for (int i = 0; i < vector.getLength(); i++) {
            numbersMultiply *= vector.getElement(i);
        }
        double geometricAverage = Math.pow(numbersMultiply, 1.0 / vector.getLength());

        LOGGER.info("Geometric average of vector's values is " + geometricAverage);
        return geometricAverage;
    }

    public static boolean isAscending(Vector vector) {

        if (!isValidSize(vector)) {
            return false;
        }

        boolean ascendingOfNumbers = true;
        for (int i = 1; i < vector.getLength(); i++) {
            if (vector.getElement(i) < vector.getElement(i - 1)) {
                ascendingOfNumbers = false;
                break;
            }
        }

        LOGGER.info("Ascending of numbers in a vector is " + ascendingOfNumbers);
        return ascendingOfNumbers;
    }

    public static boolean isDescending(Vector vector) {

        if (!isValidSize(vector)) {
            return false;
        }

        boolean descendingOfNumbers = true;
        for (int i = 1; i < vector.getLength(); i++) {
            if (vector.getElement(i) > vector.getElement(i - 1)) {
                descendingOfNumbers = false;
                break;
            }
        }

        LOGGER.info("Order in a vector is " + descendingOfNumbers);
        return descendingOfNumbers;
    }

    public static int findLocalMinElementPosition(Vector vector) {

        if (!isValidSize(vector)) {
            return -1;
        }

        int position = -1;
        //except first and last elements because they don't have both neighbors
        for (int i = 1; i < vector.getLength() - 1; i++) {
            if (vector.getElement(i) < vector.getElement(i - 1)
                    && vector.getElement(i) < vector.getElement(i + 1)) {
                position = i;
                break;
            }
        }

        LOGGER.info("Position of local minimum element in vector is " + position);
        return position;
    }

    public static int findLocalMaxElementPosition(Vector vector) {

        if (!isValidSize(vector)) {
            return -1;
        }

        int position = -1;

        //except first and last elements because they don't have both neighbors
        for (int i = 1; i < vector.getLength() - 1; i++) {
            if (vector.getElement(i) > vector.getElement(i - 1) && vector.getElement(i) > vector.getElement(i + 1)) {
                position = i;
                break;
            }
        }

        LOGGER.info("Position of local maximum element in vector is " + position);
        return position;
    }

    public static int hasElementLinearSearch(Vector vector, double element) {

        if (!isValidSize(vector)) {
            return -1;
        }

        int position = 0;
        for (int i = 0; i < vector.getLength(); i++) {
            if (vector.getElement(i) == element) {
                position = i;
                break;
            }
        }
        LOGGER.info("Position of " + element + " in vector is " + position);
        return position;
    }

    public static int hasElementBinarySearch(Vector vector, double element) {

        if (!isValidSize(vector)) {
            return -1;
        }

        doBubbleSort(vector);
        int position = 0;

        int leftBorder = 0;
        int rightBorder = vector.getLength() - 1;

        while (leftBorder <= rightBorder) {

            int middle = (leftBorder + rightBorder) / 2;
            if (element == vector.getElement(middle)) {
                position = middle;
                break;
            }
            if (element > vector.getElement(middle)) {
                leftBorder = middle + 1;
            } else {
                rightBorder = middle - 1;
            }
        }
        LOGGER.info("Position of " + element + " in vector is " + position);
        return position;
    }

    public static void reverseVector(Vector vector) {

        if (!isValidSize(vector)) {
            LOGGER.warn("Can't reverse the vector");
            return;
        }

        int leftBorder = 0;
        int rightBorder = vector.getLength() - 1;

        while (leftBorder < rightBorder) {
            swapElements(vector, leftBorder, rightBorder);
            leftBorder++;
            rightBorder--;
        }
        LOGGER.info("Vector's elements was reversed \n" + vector.toString());
    }

    public static void swapElements(Vector vector, int index1, int index2) {


        if (!isValidSize(vector)) {
            LOGGER.warn("Can't swap elements");
            return;
        }

        double temp = vector.getElement(index1);
        vector.setElement(index1, vector.getElement(index2));
        vector.setElement(index2, temp);
    }

}
