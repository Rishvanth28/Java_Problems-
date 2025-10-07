public class Theatre_Square {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();

        long rows = (n + a - 1) / a;
        long cols = (m + a - 1) / a; 

        System.out.println(rows * cols);
    }
}
