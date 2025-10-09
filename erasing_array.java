import java.util.Scanner;

public class erasing_array {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            boolean hasInversion = false;

            // Check if any inversion (1 before 0) exists
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] == 1 && arr[i + 1] == 0) {
                    hasInversion = true;
                    break;
                }
            }

            if (hasInversion)
                System.out.println(2);
            else
                System.out.println(1);
        }
        
        sc.close();
    }
}
