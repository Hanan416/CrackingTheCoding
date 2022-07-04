package CrackingTheCode.ArraysAndStrings.Q1_2_Check_Permutation;

/**
 * Given two strings s1 and s2,
 * return true if s2 contains a permutation of s1, or false otherwise.
 *
 * In other words, return true if one of s1's permutations is the substring of s2.
 *
 * Constraints:
 *      1 <= s1.length, s2.length <= 10^4
 *      s1 and s2 consist of lowercase English letters.
 */

// Solution Complexity
public class PermutationInString {

    /**
     * Lower case english letters only
     * a = 97, z = 122
     * hence we will reduce 97 from each character value
     * to put in the corresponding index (i.e a=0, b=1, ... z=25)
     *
     */
    public boolean checkInclusion(String s1, String s2) {
        int[] lettersCounter = new int[26];
        int indexThreshold = 97;
        for (char c : s1.toCharArray()) {
            lettersCounter[c - indexThreshold]++;
        }

        int flaggedChars = 0;
        for (char c : s2.toCharArray()) {
            if (lettersCounter[c - indexThreshold] > 0) {
                flaggedChars++;
                if (flaggedChars == s1.length()){
                    return true;
                }
            } else {
                flaggedChars = 0;
            }
        }

        return false;
    }
}
