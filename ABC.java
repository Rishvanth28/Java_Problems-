import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ABC{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            long X = Long.parseLong(br.readLine().trim());
            sb.append(countGoodDivisors(X)).append('\n');
        }
        System.out.print(sb.toString());
    }

    static long countGoodDivisors(long X) {
        if (X <= 0) return 0;
        int maxK = 64 - Long.numberOfLeadingZeros(X); 
        long ans = 0;
        for (int k = 1; k <= maxK; k++) {
            long lowerPow = 1L << (k - 1);       
            long upperPow = (1L << k) - 1;       

            long divBound = X >> k;              
            long low = Math.max(lowerPow, divBound + 1);
            long high = Math.min(X, upperPow);

            if (low <= high) ans += (high - low + 1);
        }
        return ans;
    }
}