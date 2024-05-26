   import java.util.*;
public class four {
    public static void nTriangle(int n) {
        // Write your code here
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        
        int number=sc.nextInt();
        nTriangle(number);

    }
}
    
