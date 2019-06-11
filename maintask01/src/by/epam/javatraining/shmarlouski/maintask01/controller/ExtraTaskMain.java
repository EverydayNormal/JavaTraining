package by.epam.javatraining.shmarlouski.maintask01.controller;

import java.util.Arrays;

public class ExtraTaskMain {

    private static boolean isSymmetric(int matrix[][]) {
        for (int a = 0; a < matrix.length; a++) {
            for (int b = 0; b < matrix[a].length / 2; b++) {
                if (matrix[a][b] != matrix[a][matrix[a].length - b - 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    private static int findMinimum(int[][] matrix) {
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

    private static int findMaximum(int[][] matrix) {
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

    private static int[][] fillMatrix(int[][] matrix) {

        int k = 11;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = k++;
            }
        }
        return matrix;
    }

    private static void showMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
            }
            System.out.println(Arrays.toString(matrix[i]));
        }
    }


    public static void main(String[] args) {

        int N = 4;
        int M = 4;
        int[][] matrix = new int[N][M];

        matrix = fillMatrix(matrix);

        showMatrix(matrix);

        System.out.println(findMinimum(matrix));
        System.out.println(findMaximum(matrix));
        System.out.println(isSymmetric(matrix));

    }
}
