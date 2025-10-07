import java.util.*;
import java.io.*;

public class Watermelon {  // You can rename to Main if needed
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] parts = br.readLine().trim().split(" ");
            long[] a = new long[2 * n];
            for (int i = 0; i < 2 * n; i++) {
                a[i] = Long.parseLong(parts[i]);
            }

            long[] diff = new long[n];
            for (int i = 0; i < n; i++) {
                diff[i] = a[n + i] - a[i];
            }

            // For each k, the answer is the sum of the first k diffs
            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum += diff[i];
                sb.append(sum).append(i == n - 1 ? "\n" : " ");
            }
        }

        System.out.print(sb.toString());
    }
}
