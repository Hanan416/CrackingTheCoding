package ArraysAndStrings.Q1_1_Is_Unique;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * Given an integer array nums,
 * return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 *
 * Constraints:
 *      1 <= nums.length <= 10^5
 *      -10^9 <= nums[i] <= 10^9
 */
public class IsUnique {

    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> numbersCounter = new HashMap<>();
        for (Integer i : nums) {
            if (numbersCounter.containsKey(i)){
                return true;
            } else {
                numbersCounter.put(i, 1);
            }
        }
        return false;
    }
}