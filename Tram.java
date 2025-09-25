import java.util.Scanner;

class Tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int current =0;
        int capacity=0;
        for (int i=0;i<x;i++){
            int ai=sc.nextInt();
            int bi=sc.nextInt();
            
            current-=ai;
            current+=bi;
            
            if (current>capacity){
                capacity =current ;
                
            }
        }
        System.out.println(capacity);
    }
}