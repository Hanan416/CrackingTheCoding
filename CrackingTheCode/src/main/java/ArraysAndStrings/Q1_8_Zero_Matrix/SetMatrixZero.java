package ArraysAndStrings.Q1_8_Zero_Matrix;

/**
 * Given an m x n integer matrix, if an element is 0,
 * set its entire row and column to 0's.
 *
 * You must do it in place.
 *
 *  Constraints:
 *      m == matrix.length
 *      n == matrix[0].length
 *      1 <= m, n <= 200
 *      -2^31 <= matrix[i][j] <= 2^31 - 1
 *
 *  Follow up:
 *      A straightforward solution using O(mn) space is probably a bad idea.
 *      A simple improvement uses O(m + n) space, but still not the best solution.
 *      Could you devise a constant space solution?
 */
public class SetMatrixZero {

    /**
     * We will iterate over the matrix elements, when we see
     * the value 0 in some column matrix[i][j],
     * we will set a flag to mark that row & column as 0
     */
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        boolean[] zeroRowsFlag = new boolean[rows];
        boolean[] zeroColumnsFlag = new boolean[columns];

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++) {
                if(matrix[i][j] == 0) {
                    zeroRowsFlag[i] = true;
                    zeroColumnsFlag[j] = true;
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (zeroRowsFlag[i] || zeroColumnsFlag[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
