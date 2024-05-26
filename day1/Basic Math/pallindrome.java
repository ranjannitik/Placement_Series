// import java.util.Scanner;

// public class pallindrome {
//      public static boolean countDigits(int n){
//         // Write your code here.
//         int check=n;
        
//         int rev=0;
      
//         while(n>0){
           
//           int lst=  n%10;
//            rev=(rev*10)+lst;
          
//           n=  n/10;
          
//         }
//         boolean X1=(check==rev)?true:false;
//         return X1;
//     }
//     public static void main(String[] args)
//     {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//        System.out.println( countDigits(n));
//     }
// }




import java.util.Scanner;

public class pallindrome {
     public static boolean countDigits(int n){
        // Write your code here.
       int rev=0;
       int orig=n;
       while(n>0){
        int last=n%10;
        rev=(rev*10)+last;
        n/=10;

       }
       return orig==rev;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       System.out.println( countDigits(n));
    }
}
