package ArraysAndStringsTests;

import ArraysAndStrings.Q1_7_Rotate_Matrix.RotateImage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Objects;

public class RotateImageTest {

    private final RotateImage rotateImage = new RotateImage();
    int[][] matrix;
    int[][] expectedResult;

    @Test
    public void oneByOneMatrixRotation(){
        matrix = new int[][]{{1}};
        expectedResult = new int[][]{{1}};

        rotateImage.rotate(matrix);
        Assertions.assertTrue(Objects.deepEquals(expectedResult, matrix));
    }

    @Test
    public void threeByThreeMatrixRotation(){
        matrix = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}};

        expectedResult = new int[][]{
                {7,4,1},
                {8,5,2},
                {9,6,3}};

        rotateImage.rotate(matrix);
        Assertions.assertTrue(Objects.deepEquals(expectedResult, matrix));
    }

    @Test
    public void fourByFourMatrixRotation(){
        matrix = new int[][]{
                {5,1,9,11},
                {2,4,8,10},
                {13,3,6,7},
                {15,14,12,16}};

        expectedResult = new int[][]{
                {15,13,2,5},
                {14,3,4,1},
                {12,6,8,9},
                {16,7,10,11}};

        rotateImage.rotate(matrix);
        Assertions.assertTrue(Objects.deepEquals(expectedResult, matrix));
    }
}
