package ArraysAndStringsTests;

import CrackingTheCode.ArraysAndStrings.Q1_1_Is_Unique.IsUnique;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsUniqueTest {

    private final IsUnique isUnique = new IsUnique();
    private int[] arr;

    @Test
    public void containsDuplicate_singleSizeArray_negative(){
        arr = new int[]{1};
        Assertions.assertFalse(isUnique.containsDuplicate(arr));
    }

    @Test
    public void containsDuplicate_negative(){
        arr = new int[]{1,2,3,4,5,6};
        Assertions.assertFalse(isUnique.containsDuplicate(arr));
    }

    @Test
    public void containsDuplicate_positive(){
        arr = new int[]{1,4,5,2,6,1,3,6};
        Assertions.assertTrue(isUnique.containsDuplicate(arr));
    }
}
