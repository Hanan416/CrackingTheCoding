package CrackingTheCode.ArraysAndStrings.Q1_7_Rotate_Matrix;

/**
 * You are given an n x n 2D matrix representing an image,
 * rotate the image by 90 degrees (clockwise).
 *
 * You have to rotate the image in-place, which means you have
 * to modify the input 2D matrix directly. DO NOT allocate another
 * 2D matrix and do the rotation.
 *
 *
 *  Constraints:
 *      n == matrix.length == matrix[i].length
 *      1 <= n <= 20
 *      -1000 <= matrix[i][j] <= 1000
 */
public class RotateImage {
    private final boolean displayMatrixEachIteration;

    public RotateImage() {
        this.displayMatrixEachIteration = false;
    }

    public RotateImage(boolean displayMatrixEachIteration) {
        this.displayMatrixEachIteration = displayMatrixEachIteration;
    }

    // Solution Complexity O(n^2)
    public void rotate(int[][] matrix) {
        int matrixDimensions = matrix.length;
        int tempValue;
        for (int row = 0; row < matrixDimensions / 2 ; row++){
            for (int col = row; col < matrixDimensions - row - 1; col++){
                tempValue = matrix[row][col];
                matrix[row][col] = matrix[matrixDimensions - 1 - col][row];
                matrix[matrixDimensions - 1 - col][row] = matrix[matrixDimensions - 1 - row][matrixDimensions - 1 - col];
                matrix[matrixDimensions - 1 - row][matrixDimensions - 1 - col] = matrix[col][matrixDimensions - 1 - row];
                matrix[col][matrixDimensions - 1 - row] = tempValue;
                if (displayMatrixEachIteration) {
                    displayMatrix(matrix);
                }
            }
        }
    }

    public void displayMatrix(int[][] matrix) {
        int matrixDimensions = matrix.length;
        for (int[] ints : matrix) {
            for (int j = 0; j < matrixDimensions; j++)
                System.out.print(" " + ints[j]);

            System.out.print("\n");
        }
        System.out.print("\n");
    }
}
