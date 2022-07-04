package DynamicProgrammingTests.MemoizationTests;

import DynamicProgramming.Memoization.GridTraveller;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GridTravellerTest {

    private final GridTraveller gridTraveller = new GridTraveller();
    private long m, n, expectedResult;


    @Test
    public void getNumberOfPaths_zeroCase(){
        m = 0;
        n = 13;
        expectedResult = 0;
        Assertions.assertEquals(expectedResult, gridTraveller.getNumberOfPaths(m, n));
    }

    @Test
    public void getNumberOfPaths_baseCase(){
        m = 1;
        n = 1;
        expectedResult = 1;
        Assertions.assertEquals(expectedResult, gridTraveller.getNumberOfPaths(m, n));
    }

    @Test
    public void getNumberOfPaths_simpleCase(){
        m = 2;
        n = 3;
        expectedResult = 3;
        Assertions.assertEquals(expectedResult, gridTraveller.getNumberOfPaths(m, n));
    }

    @Test
    public void getNumberOfPaths_simpleCaseMirrored(){
        m = 3;
        n = 2;
        expectedResult = 3;
        Assertions.assertEquals(expectedResult, gridTraveller.getNumberOfPaths(m, n));
    }

    @Test
    public void getNumberOfPaths_complexCase(){
        m = 18;
        n = 18;
        expectedResult = 2333606220L;
        Assertions.assertEquals(expectedResult, gridTraveller.getNumberOfPaths(m, n));
    }
}
