package by.epam.javatraining.shmarlouski.maintask01.model;

import java.util.Arrays;

import static by.epam.javatraining.shmarlouski.maintask01.model.VectorUtils.LOGGER;

/**
 * This is Vector class.
 *
 * @author Smarlouski Ihar
 * @version 1.1.1
 */

public class Vector {

    private double[] vector;

    public Vector(int length) {
        if (length > 0) {
            this.vector = new double[length];
        } else {
            this.vector = new double[0];
        }
    }

    private boolean isValidElement(double... element) {
        boolean validity = true;
        for (double elem:element) {
            if (elem < 0) {
                validity = false;
            }
        }

        return validity;
    }

    public void addElement(double... element) {

        if (element == null || !isValidElement(element)) {
            LOGGER.warn("Added element shouldn't be null or negative");
            return;
        }

        double[] newVector = Arrays.copyOf(vector, vector.length + element.length);
        for (int i = vector.length, j = 0; i < newVector.length; i++) {
                newVector[i] = element[j];
            j++;
        }
        vector = newVector;
        LOGGER.info("Element was added \n" + toString());
    }

    public void removeElement(int index) {

        if (index > getLength() || index < 0) {
            LOGGER.warn("Index is incorrect");
            return;
        }

        double[] firstHalf = Arrays.copyOfRange(vector, 0, index);
        double[] secondHalf = Arrays.copyOfRange(vector, index + 1, vector.length);

        LOGGER.info("Element " + getElement(index) + " was removed");

        this.vector = new double[0];
        this.addElement(firstHalf);
        this.addElement(secondHalf);
        LOGGER.info("After deleting vector look like \n" + toString());
    }

    public double getElement(int index) {

        if (index > getLength() || index < 0) {
            LOGGER.warn("Index is incorrect");
            return -1;
        }
        return vector[index];
    }

    public void setElement(int index, double element) {

        if (index > getLength() || index < 0) {
            LOGGER.warn("Index is incorrect");
            return;
        }

        vector[index] = element;
    }

    public int getLength() {
        return vector.length;
    }

    public String toString() {
        return Arrays.toString(vector);
    }

    public double[] getVector() {
        return vector;
    }

}
