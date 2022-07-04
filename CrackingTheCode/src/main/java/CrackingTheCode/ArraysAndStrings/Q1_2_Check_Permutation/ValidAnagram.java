package CrackingTheCode.ArraysAndStrings.Q1_2_Check_Permutation;

import java.util.Arrays;

/**
 * Given two strings s and t,
 * return true if t is an anagram of s, and false otherwise.
 *
 * An Anagram is a word or phrase formed by rearranging the letters
 * of a different word or phrase, typically using all the original
 * letters exactly once.
 *
 * Constraints:
 *      1 <= s.length, t.length <= 5 * 10^4
 *      s and t consist of lowercase English letters.
 */
public class ValidAnagram {

    public String sort(String str){
        char[] sChars = str.toCharArray();  // O(n)
        Arrays.sort(sChars);                // O(n log(n))
        return new String(sChars);          // O(n)
    }

     // Solution complexity O(n log(n))
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        return sort(s).equals(sort(t));     // O(n)
    }
}
