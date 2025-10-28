import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AandB {
  static long calcSwaps(List<Integer> pos) {
        if (pos.isEmpty()) return 0;
        int n = pos.size();
        int mid = n / 2;
        int median = pos.get(mid);
        long swaps = 0;
        for (int i = 0; i < n; i++) {
            swaps += Math.abs(pos.get(i) - (median - mid + i));
        }
        return swaps;
    }

    static long minSwapsToGroup(String s) {
        List<Integer> aPos = new ArrayList<>();
        List<Integer> bPos = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') aPos.add(i);
            else bPos.add(i);
        }

        return Math.min(calcSwaps(aPos), calcSwaps(bPos));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            System.out.println(minSwapsToGroup(s));
        }

        sc.close();
    }

}
