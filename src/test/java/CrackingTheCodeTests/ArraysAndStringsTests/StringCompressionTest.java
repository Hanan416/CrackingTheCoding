package CrackingTheCodeTests.ArraysAndStringsTests;

import CrackingTheCode.ArraysAndStrings.Q1_6_String_Compression.StringCompression;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringCompressionTest {

    private final StringCompression stringCompression = new StringCompression();
    private char[] chars;

    @Test
    public void compress_singleCharacter(){
        chars = new char[]{'a'};
        Assertions.assertEquals(1, stringCompression.compress(chars));      // a
    }

    @Test
    public void compress_multipleConsecutiveChars(){
        chars = new char[]{'a','a','b','b','c','c','c'};
        Assertions.assertEquals(6, stringCompression.compress(chars));      // a2b2c3
    }

    @Test
    public void compress_singleConsecutiveChars(){
        chars = new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        Assertions.assertEquals(4, stringCompression.compress(chars));     // ab12
    }

}
