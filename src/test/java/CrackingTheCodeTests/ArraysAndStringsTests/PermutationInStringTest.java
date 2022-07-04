package CrackingTheCodeTests.ArraysAndStringsTests;

import CrackingTheCode.ArraysAndStrings.Q1_2_Check_Permutation.PermutationInString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PermutationInStringTest {
    private final PermutationInString permutationInString = new PermutationInString();
    private String s1,s2;



    @Test
    public void checkInclusion_singleCharacter_positive() {
        s1 = "a";
        s2 = "abcdef";
        Assertions.assertTrue(permutationInString.checkInclusion(s1, s2));
    }

    @Test
    public void checkInclusion_singleCharacter_negative() {
        s1 = "q";
        s2 = "abcdef";
        Assertions.assertFalse(permutationInString.checkInclusion(s1, s2));
    }

    @Test
    public void checkInclusion_example_positive() {
        s1 = "ab";
        s2 = "eidbaooo";
        Assertions.assertTrue(permutationInString.checkInclusion(s1, s2));
    }

    @Test
    public void checkInclusion_example_negative() {
        s1 = "ab";
        s2 = "eidboaoo";
        Assertions.assertFalse(permutationInString.checkInclusion(s1, s2));
    }

    @Test
    public void checkInclusion_multiInstanceCharacter_positive() {
        s1 = "aa";
        s2 = "sbgaaaa";
        Assertions.assertTrue(permutationInString.checkInclusion(s1, s2));
    }

    @Test
    public void checkInclusion_multiInstanceCharacter_negative() {
        s1 = "aa";
        s2 = "sbgacaba";
        Assertions.assertFalse(permutationInString.checkInclusion(s1, s2));
    }

    @Test
    public void checkInclusion_endOfS2_positive() {
        s1 = "abc";
        s2 = "abdcgabcde";
        Assertions.assertTrue(permutationInString.checkInclusion(s1, s2));
    }

    @Test
    public void checkInclusion_negative() {
        s1 = "abc";
        s2 = "abdcgacybde";
        Assertions.assertFalse(permutationInString.checkInclusion(s1, s2));
    }

}
