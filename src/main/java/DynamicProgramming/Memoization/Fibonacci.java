package DynamicProgramming.Memoization;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    public BigInteger fib(int n){
        return fib(n, new HashMap<>());
    }

    private BigInteger fib(int n, Map<Integer, BigInteger> memo){
        if(memo.containsKey(n)) { return memo.get(n); }
        if(n <= 2) { return BigInteger.ONE; }
        memo.put(n, fib(n - 1, memo).add(fib(n - 2, memo)));
        return memo.get(n);
    }
}
