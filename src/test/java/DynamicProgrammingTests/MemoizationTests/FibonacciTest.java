package DynamicProgrammingTests.MemoizationTests;

import DynamicProgramming.Memoization.Fibonacci;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

public class FibonacciTest {

    private final Fibonacci fibonacci = new Fibonacci();
    private int n;
    private BigInteger expectedResult;


    @Test
    public void fibTest_baseCase(){
        n = 1;
        expectedResult = BigInteger.ONE;
        Assertions.assertEquals(expectedResult, fibonacci.fib(n));
    }

    @Test
    public void fibTest_bigNumber(){
        n = 50;
        expectedResult = BigInteger.valueOf(12586269025L);
        Assertions.assertEquals(expectedResult, fibonacci.fib(n));
    }

    @Test
    public void fibTest_beyondLongValue(){
        n = 200;
        expectedResult = new BigInteger("280571172992510140037611932413038677189525");
        Assertions.assertEquals(expectedResult, fibonacci.fib(n));
    }

}
