package CrackingTheCodeTests.ArraysAndStringsTests;

import CrackingTheCode.ArraysAndStrings.Q1_9_String_Rotation.RotateString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RotateStringTest {

    private final RotateString rotateString = new RotateString();
    private String s, goal;

    @Test
    public void rotateString_DifferentSizes(){
        s = "abc";
        goal = "bcae";
        Assertions.assertFalse(rotateString.rotateString(s, goal));
    }

    @Test
    public void rotateString_positive(){
        s = "abcde";
        goal = "cdeab";
        Assertions.assertTrue(rotateString.rotateString(s, goal));
    }

    @Test
    public void rotateString_negative(){
        s = "abcde";
        goal = "abced";
        Assertions.assertFalse(rotateString.rotateString(s, goal));
    }
}
