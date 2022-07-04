package CrackingTheCodeTests.ArraysAndStringsTests;

import CrackingTheCode.ArraysAndStrings.Q1_2_Check_Permutation.ValidAnagram;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidAnagramTest {

    private final ValidAnagram validAnagram = new ValidAnagram();
    private String s,t;

    @Test
    public void isAnagram_positive(){
        s = "anagram";
        t = "nagaram";
        Assertions.assertTrue(validAnagram.isAnagram(s,t));
    }

    @Test
    public void isAnagram_negative(){
        s = "rat";
        t = "cat";
        Assertions.assertFalse(validAnagram.isAnagram(s,t));
    }

    @Test
    public void isAnagram_differentLenght_negative(){
        s = "abba";
        t = "bab";
        Assertions.assertFalse(validAnagram.isAnagram(s,t));
    }
}
