package CrackingTheCode.ArraysAndStrings.Q1_5_One_Away;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 * Given two strings word1 and word2,
 * return the minimum number of operations required to convert word1 to word2.
 *
 * You have the following three operations permitted on a word:
 *
 * Insert a character
 * Delete a character
 * Replace a character
 *
 *  Constraints:
 *      0 <= word1.length, word2.length <= 500
 *      word1 and word2 consist of lowercase English letters.
 */
public class
EditDistance {

    public int minDistance(String word1, String word2){
        return minDistanceRecursive(word1, word2, word1.length(), word2.length());
    }

    private int minDistanceRecursive(String word1, String word2, int m, int n){
        // word1 is empty, so we need to do n add operations
        if (m == 0){
            return n;
        }

        // similarly for m delete operations
        if (n == 0) {
            return m;
        }

        // last character equals - nothing to do, cont.
        if (word1.charAt(m-1) == word2.charAt(n-1)){
            return minDistanceRecursive(word1, word2, m-1, n-1);
        }

        int insertResult = minDistanceRecursive(word1, word2, m, n-1);
        int deleteResult = minDistanceRecursive(word1, word2, m-1, n);
        int replaceResult = minDistanceRecursive(word1, word2, m-1, n-1);

        return 1 + Stream.of(insertResult,deleteResult,replaceResult)
                .min(Comparator.naturalOrder())
                .get();
    }

}
