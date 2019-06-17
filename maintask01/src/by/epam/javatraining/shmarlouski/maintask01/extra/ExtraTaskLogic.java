package by.epam.javatraining.shmarlouski.maintask01.extra;

import java.util.Arrays;

public class ExtraTaskLogic {

    private static boolean isSquare(int[][] matrix) {

        if (matrix == null) {
            return false;
        }

        boolean answer = true;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length != matrix.length) {
                answer = false;
            }
        }
        return answer;
    }

    public static int findMinimum(int[][] matrix) {

        int minimum = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < minimum) {
                    minimum = matrix[i][j];
                }
            }
        }
        return minimum;
    }

    public static int findMaximum(int[][] matrix) {
        int maximum = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > maximum) {
                    maximum = matrix[i][j];
                }
            }
        }
        return maximum;
    }

    public static int[][] fillMatrix(int[][] matrix) {

        int k = 11;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = k++;
            }
        }
        return matrix;
    }

    public static void showMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
            }
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public static boolean isSymetric(int[][] matrix) {

        boolean answer = false;

        if (!isSquare(matrix)) {
            return answer;
        }

        int diagonal = 1;

        while (diagonal < matrix.length) {
            if (matrix[diagonal][diagonal] == matrix[diagonal - 1][diagonal - 1]) {
                answer = true;
            } else {
                answer = false;
            }
            diagonal++;
        }
        return answer;
    }

   //not work if !Square for now
    public static int[][] transposeMatrix(int[][] matrix) {

        if (!isSquare(matrix)){
            return matrix;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        return matrix;
    }

}
