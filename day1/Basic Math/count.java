// import java.util.*;

// public class count {
//     public static int countDigits(int n){
//         // Write your code here.
//         int cnt=0;
//         while(n>0){
//           int lst=  n%10;
//           n=  n/10;
//           cnt++;
//         }
//         return cnt;
//     }
//     public static void main(String[] args)
//     {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//        System.out.println( countDigits(n));
//     }
// }


import java.util.*;

public class count {
    public static int countDigits(int n){
       int count=(int)(Math.log10(n)+1);
       return count;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       System.out.println( countDigits(n));
    }
}