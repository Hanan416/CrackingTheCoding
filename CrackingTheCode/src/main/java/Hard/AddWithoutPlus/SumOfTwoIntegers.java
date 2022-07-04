package Hard.AddWithoutPlus;

/**
 * Given two integers a and b, return the sum of the two
 * integers without using the operators + and -.
 *
 *
 *  Constraints:
 *      -1000 <= a, b <= 1000
 */
public class SumOfTwoIntegers {

    public int getSum(int a, int b) {
        int carry;
        while(b != 0){
            carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
}
