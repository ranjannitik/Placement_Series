// import java.util.Scanner;

// public class reverse {
//     public static int countDigits(int n){
//         // Write your code here.
        
//         int rev=0;
      
//         while(n>0){
           
//           int lst=  n%10;
//            rev=(rev*10)+lst;
          
//           n=  n/10;
          
//         }
//         return rev;
//     }
//     public static void main(String[] args)
//     {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//        System.out.println( countDigits(n));
//     }
// }




import java.util.Scanner;

public class reverse {
    public static int countDigits(int n){
        // Write your code here.
      int rev=0;
      while(n>0){
        int last=n%10;
        rev=(rev*10)+last;
        n/=10;
      }
      return rev;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       System.out.println( countDigits(n));
    }
}
