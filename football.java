import java.util.Scanner;

public class football {
    
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            int firstHalfRiOI = a;
            int firstHalfKDOI = b;
            int secondHalfRiOI = c - a;
            int secondHalfKDOI = d - b;

            boolean firstHalfValid = isValid(firstHalfRiOI, firstHalfKDOI);
            boolean secondHalfValid = isValid(secondHalfRiOI, secondHalfKDOI);

            if (firstHalfValid && secondHalfValid)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }

    private static boolean isValid(int x, int y) {
        int maxGoals = Math.max(x, y);
        int minGoals = Math.min(x, y);
        return maxGoals <= 2 * minGoals + 2;
    }
}
