package by.epam.javatraining.shmarlouski.maintask01.extra;

import java.util.Arrays;
import static by.epam.javatraining.shmarlouski.maintask01.extra.ExtraTaskLogic.*;

public class ExtraTaskMain {

    /// WHEN JOBS DONE WILL ADD PACKAGE AND LOGGING ///

    public static void main(String[] args) {

        int N = 3;
        int M = 3;
        int[][] matrix = new int[N][M];

        matrix = fillMatrix(matrix);

        showMatrix(matrix);

        System.out.println(findMinimum(matrix));
        System.out.println(findMaximum(matrix));
        System.out.println(isSymmetric(matrix));

        matrix = transposeMatrix(matrix);
        showMatrix(matrix);

        System.out.println(" simetric = " + isSimetric(matrix));
    }
}
