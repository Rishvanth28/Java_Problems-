import java.util.Scanner;

class HeightFence {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int h =sc.nextInt();
        int totalwidth=0;
        for (int i=0;i<n;i++){
            int ai=sc.nextInt();
            if (ai>h){
                totalwidth +=2;
            }else{
                totalwidth +=1;
            }
            
            
        }
        System.out.println(totalwidth);
        
    }
}