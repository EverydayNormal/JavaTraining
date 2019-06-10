package by.epam.javatraining.shmarlouski.maintask01.controller;

        import java.util.Arrays;

        import static by.epam.javatraining.shmarlouski.maintask01.model.VectorLogic.*;

public class Main {

    public static void main(String[] args) {

        /*
        int N = 10;
        double[] vector = new double[N];
        vector = fillVector(vector);
        */

        double[] vector = {3, 4, 5, 6, 4, 3, 2, 1, 9, 7};

        double minElement = findMinElement(vector);

        double maxElement = findMaxElement(vector);

        double arithmeticAverage = findArithmeticAverage(vector);

        double geometricAverage = findGeometricAverage(vector);

        boolean answer = isSorted(vector);

        int localMinElementPosition = findLocalMinElementPosition(vector);

        int localMaxElementPosition = findLocalMaxElementPosition(vector);

        boolean gotElementLinearSearch = hasElementLinearSearch(vector, 3);

        boolean gotElementBinarySearch = hasElementBinarySearch(vector, 3);

        double[] reversedVector = reverseVector(vector);

        double[] sortedVector = doBubbleSort(vector);

        double[] sortedVector2 = doInsertionSort(vector);

        double[] sortedVector3 = doSelectionSort(vector);

        double[] sortedVector4 = doOneCicleForSort(vector);

        double[] sortedVector5 = doQuickSort(vector, 0, vector.length - 1);

        double[] sortedVector6 = doMergeSort(vector, 0, vector.length - 1);
    }
}
