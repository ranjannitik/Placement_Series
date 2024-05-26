import java.util.Scanner;

public class factorial {
    public static int mul( int n) {
        // Write Your Code Here
        
        if(n==0){
          
          return 1;
        }

      return (n * mul(n-1));
       
       

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
     int k= mul(n);
      System.out.println(k);
      
    }
    
}
