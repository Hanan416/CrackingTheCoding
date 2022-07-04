package SortingAndSearching;

import SortingAndSearching.Q10_1_SortedMerge.MergeSortedArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Objects;

public class MergeSortedArrayTest {

    private final MergeSortedArray mergeSortedArray = new MergeSortedArray();
    int[] nums1,nums2,expectedResult;
    int m,n;


    @Test
    public void mergeSortedArray_noOverlap(){
        nums1 = new int[]{1,2,3,0,0,0};
        m = 3;
        nums2 = new int[]{4,5,6};
        n = 3;
        expectedResult = new int[]{1,2,3,4,5,6};

        mergeSortedArray.merge(nums1, m, nums2, n);
        Assertions.assertTrue(Objects.deepEquals(expectedResult, nums1));
    }

    @Test
    public void mergeSortedArray_overlap(){
        nums1 = new int[]{1,2,3,0,0,0};
        m = 3;
        nums2 = new int[]{2,5,6};
        n = 3;
        expectedResult = new int[]{1,2,2,3,5,6};

        mergeSortedArray.merge(nums1, m, nums2, n);
        Assertions.assertTrue(Objects.deepEquals(expectedResult, nums1));
    }

    @Test
    public void mergeSortedArray_EmptyNums2(){
        nums1 = new int[]{1};
        m = 1;
        nums2 = new int[]{};
        n = 0;
        expectedResult = new int[]{1};

        mergeSortedArray.merge(nums1, m, nums2, n);
        Assertions.assertTrue(Objects.deepEquals(expectedResult, nums1));
    }

    @Test
    public void mergeSortedArray_EmptyNums1(){
        nums1 = new int[]{0};
        m = 0;
        nums2 = new int[]{1};
        n = 1;
        expectedResult = new int[]{1};

        mergeSortedArray.merge(nums1, m, nums2, n);
        Assertions.assertTrue(Objects.deepEquals(expectedResult, nums1));
    }
}
