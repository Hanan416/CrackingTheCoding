package CrackingTheCodeTests.ArraysAndStringsTests;

import CrackingTheCode.ArraysAndStrings.Q1_5_One_Away.EditDistance;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EditDistanceTest {

    private final EditDistance editDistance = new EditDistance();
    private String word1,word2;

    @Test
    public void minDistance_emptyWord1(){
        word1 = "";
        word2 = "abcdefg";
        Assertions.assertEquals(7, editDistance.minDistance(word1, word2));
    }

    @Test
    public void minDistance_emptyWord2(){
        word1 = "abcdefg";
        word2 = "";
        Assertions.assertEquals(7, editDistance.minDistance(word1, word2));
    }

    @Test
    public void minDistance_threeOperations(){
        word1 = "horse";
        word2 = "ros";
        Assertions.assertEquals(3, editDistance.minDistance(word1, word2));
    }

    @Test
    public void minDistance_fiveOperations(){
        word1 = "intention";
        word2 = "execution";
        Assertions.assertEquals(5, editDistance.minDistance(word1, word2));
    }
}
