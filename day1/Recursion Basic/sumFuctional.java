import java.util.Scanner;

public class sumFuctional {
        public static int sumNo( int n) {
        // Write Your Code Here
        
        if(n==0){
          
          return 0;
        }

      return (n + sumNo(n-1));
       
       

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
     int k= sumNo(n);
      System.out.println(k);
      
    }
}
