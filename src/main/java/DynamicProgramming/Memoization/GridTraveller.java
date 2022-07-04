package DynamicProgramming.Memoization;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Given a 2d grid of size m*n,
 * Return the number of different paths from the
 * top left corner to the bottom right corner
 */
public class GridTraveller {

    public long getNumberOfPaths(long m, long n){
        return getNumberOfPaths(m, n, new HashMap<>());
    }

    private long getNumberOfPaths(long m, long n, Map<GridKey, Long> memo){
        GridKey gridKey = new GridKey(m, n);
        if (memo.containsKey(gridKey)) { return memo.get(gridKey); }
        if (m == 1 && n == 1) { return 1; }
        if (m == 0 || n == 0) { return 0; }

        memo.put(gridKey, getNumberOfPaths(m - 1, n, memo) + getNumberOfPaths(m, n -1, memo));
        return memo.get(gridKey);
    }


    public static class GridKey {
        private final long m;
        private final long n;

        public GridKey(long m, long n) {
            this.m = m;
            this.n = n;
        }


        @Override
        public int hashCode() {
            return Objects.hash(m, n);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj){
                return true;
            }
            if (obj == null || getClass() != obj.getClass()){
                return false;
            }
            GridKey other = (GridKey) obj;
            return m == other.m && n == other.n;
        }
    }
}
