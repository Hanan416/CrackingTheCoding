package ArraysAndStrings.Q1_9_String_Rotation;

/**
 * Given two strings s and goal, return true if and only if
 * s can become goal after some number of shifts on s.
 *
 * A shift on s consists of
 * moving the leftmost character of s to the rightmost position.
 *
 * For example, if s = "abcde", then it will be "bcdea" after one shift.
 *
 *
 *  Constraints:
 *      1 <= s.length, goal.length <= 100
 *      s and goal consist of lowercase English letters.
 */

public class RotateString {

    /**
     * If we concatenate s with s, we can scan goal through
     * it to find a match
     */
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()){
            return false;
        }

        String sDoubled = s.concat(s);
        int matchCounter = goal.length();   // we will decrease this counter as we go
        int goalIndex = 0;
        for (int i = 0; i < sDoubled.length(); i++){
            if (matchCounter == 0) {
                return true;
            }
            if (sDoubled.charAt(i) == goal.charAt(goalIndex)){
                goalIndex++;
                matchCounter--;
            } else {
                goalIndex = 0;
                matchCounter = goal.length();
            }
        }
        return false;
    }
}
