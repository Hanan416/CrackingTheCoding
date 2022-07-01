package ArraysAndStrings.Q1_6_String_Compression;

/**
 * Given an array of characters chars, compress it using the following algorithm:
 *
 * Begin with an empty string s.
 * For each group of consecutive repeating characters in chars:
 *      If the group's length is 1, append the character to s.
 *      Otherwise, append the character followed by the group's length.
 *
 * The compressed string s should not be returned separately,
 * but instead, be stored in the input character array chars.
 * Note that group lengths that are 10 or longer will be split
 * into multiple characters in chars.
 *
 * After you are done modifying the input array,
 * return the new length of the array.
 *
 * You must write an algorithm that uses only constant extra space.
 *
 *  Constraints:
 *      1 <= chars.length <= 2000
 *      chars[i] is a lowercase English letter, uppercase English letter, digit, or symbol.
 */
public class StringCompression {

    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder(chars.length);
        int consecutiveChars = 0;
        for (int i = 0; i < chars.length; i++) {
            consecutiveChars++;
            if (i + 1 >= chars.length || chars[i] != chars[i+1]) {
                sb.append(chars[i]);
                if (consecutiveChars > 1) {
                    sb.append(consecutiveChars);
                }
                consecutiveChars = 0;
            }
        }
        String compressedString = sb.toString();
        return compressedString.length();
    }

}
