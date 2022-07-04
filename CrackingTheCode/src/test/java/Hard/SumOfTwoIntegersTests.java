package Hard;

import Hard.AddWithoutPlus.SumOfTwoIntegers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumOfTwoIntegersTests {

    private final SumOfTwoIntegers sumOfTwoIntegers = new SumOfTwoIntegers();
    int a,b;

    @Test
    public void getSum_zeroA(){
        a = 0;
        b = 6;
        Assertions.assertEquals(6, sumOfTwoIntegers.getSum(a,b));
    }

    @Test
    public void getSum_zeroB(){
        a = 4;
        b = 0;
        Assertions.assertEquals(4, sumOfTwoIntegers.getSum(a,b));
    }

    @Test
    public void getSum_bothPositive(){
        a = 4;
        b = 5;
        Assertions.assertEquals(9, sumOfTwoIntegers.getSum(a,b));
    }

    @Test
    public void getSum_negativeA(){
        a = -3;
        b = 7;
        Assertions.assertEquals(4, sumOfTwoIntegers.getSum(a,b));
    }

    @Test
    public void getSum_negativeB(){
        a = 8;
        b = -2;
        Assertions.assertEquals(6, sumOfTwoIntegers.getSum(a,b));
    }
}
