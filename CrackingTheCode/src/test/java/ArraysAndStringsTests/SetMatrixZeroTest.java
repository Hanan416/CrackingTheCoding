package ArraysAndStringsTests;

import CrackingTheCode.ArraysAndStrings.Q1_8_Zero_Matrix.SetMatrixZero;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Objects;

public class SetMatrixZeroTest {

    private final SetMatrixZero setMatrixZero = new SetMatrixZero();

    private int[][] matrix;
    private int[][] expectedResult;

    @Test
    public void oneByOneSetZero_noZero(){
        matrix = new int[][]{{1}};
        expectedResult = new int[][]{{1}};

        setMatrixZero.setZeroes(matrix);
        Assertions.assertTrue(Objects.deepEquals(expectedResult, matrix));
    }

    @Test
    public void twoByTwoSetZero_noZero(){
        matrix = new int[][]{
                {1,2},
                {3,4}};
        expectedResult = new int[][]{
                {1,2},
                {3,4}};

        setMatrixZero.setZeroes(matrix);
        Assertions.assertTrue(Objects.deepEquals(expectedResult, matrix));
    }

    @Test
    public void twoByTwoSetZero_withZero(){
        matrix = new int[][]{
                {1,0},
                {3,4}};
        expectedResult = new int[][]{
                {0,0},
                {3,0}};

        setMatrixZero.setZeroes(matrix);
        Assertions.assertTrue(Objects.deepEquals(expectedResult, matrix));
    }

    @Test
    public void threeByThreeSetZero(){
        matrix = new int[][]{
                {1,1,1},
                {1,0,1},
                {1,1,1}};
        expectedResult = new int[][]{
                {1,0,1},
                {0,0,0},
                {1,0,1}};

        setMatrixZero.setZeroes(matrix);
        Assertions.assertTrue(Objects.deepEquals(expectedResult, matrix));
    }

    @Test
    public void threeByFourSetZero(){
        matrix = new int[][]{
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}};
        expectedResult = new int[][]{
                {0,0,0,0},
                {0,4,5,0},
                {0,3,1,0}};

        setMatrixZero.setZeroes(matrix);
        Assertions.assertTrue(Objects.deepEquals(expectedResult, matrix));
    }
}
