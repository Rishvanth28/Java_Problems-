import java.io.*;
import java.util.*;

public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            System.out.println(findSpecialNumber(n));
        }
    }

    static int findSpecialNumber(int n) {
        while (true) {
            if (isSpecial(n)) return n;
            n++;
        }
    }

    static boolean isSpecial(int num) {
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return sum % 4 == 0;
    }
}
