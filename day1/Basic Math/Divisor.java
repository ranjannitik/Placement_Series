// import java.util.Scanner;

// public class Divisor {
//     public static int Divi(int n) {
//         int sum = 0;
//         for (int i = 1; i <= Math.sqrt(n); i++) {
//             if (n % i == 0) {
//                 System.out.println(i);
//                 sum += i;
//                 if ((n / i) != i) {
//                     System.out.println(n / i);
//                     sum += (n / i);
//                 }
//             }
//         }
//         return sum;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();
//         System.out.println("Sum of divisors: " + Divi(n));
//     }
// }





import java.util.Scanner;

public class Divisor {
    public static int Divi(int n) {
        int sum=0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.println(i);
                sum+=i;
                if(n/i!=i){
                    System.out.println(n/i);
                    sum+=n/i;
                }
            }
            
           

        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Sum of divisors: " + Divi(n));
    }
}
