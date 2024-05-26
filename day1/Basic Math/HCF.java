

// import java.util.*;

// public class HCF {
//      public static int calcGCD(int n, int m){
//         // Write your code here.
//         while(n>0&&m>0){
//             if(n>m)n=n%m;
//             else{m=m%n;};
//         }
//         if(n==0)return m;
//         else{return n;}
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Write first no");
//         int n=sc.nextInt();
//         System.out.println("Write Second no");
//         int m=sc.nextInt();
//        System.out.println("HCF/GCD is : "+calcGCD( n,  m)); 

//     }

// }







import java.util.*;

public class HCF {
     public static int calcGCD(int n, int m){
        // Write your code here.
       while(n>0&&m>0){
        if(n>m)n=n%m;
        else m=  m%n;
        
      
                                                                           
       }
       if(n==0)return m;
       else return n;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Write first no");
        int n=sc.nextInt();
        System.out.println("Write Second no");
        int m=sc.nextInt();
       System.out.println("HCF/GCD is : "+calcGCD( n,  m)); 

    }

}
