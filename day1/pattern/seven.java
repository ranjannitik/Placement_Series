 import java.util.*;
public class seven {
    public static void nStarTriangle(int n) {
        // Write your code here
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");

            }
             for(int j=1;j<=(2*i)-1;j++){
                  System.out.print("* ");

            }
             for(int j=1;j<=n-i;j++){
                  System.out.print("  ");

            }
            System.out.println();
        }
    }
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        
        int number=sc.nextInt();
        nStarTriangle(number);

    }
}
    

    
