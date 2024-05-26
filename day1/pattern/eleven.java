
   import java.util.*;
   public class eleven {

    public static void nBinaryTriangle(int n) {
        // Write your code here
        for(int i=1;i<=n;i++){
            int start=i;
            if(i %2==0)start=0;
             if(i %2!=0)start=1;

            for(int j=1;j<=i;j++){
                System.out.print(start+" ");
                start=1-start;
            }
            System.out.println();
        }
    }
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        
        int number=sc.nextInt();
        nBinaryTriangle(number);

    }
}
    
