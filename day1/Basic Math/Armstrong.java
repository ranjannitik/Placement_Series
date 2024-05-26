// import java.util.Scanner;

// public class Armstrong {
//     public static boolean isArmstrong(int n) {
//         int originalNumber = n;
//         int sum = 0;
//         int numberOfDigits = (int) Math.log10(n) + 1;
//         System.out.println(numberOfDigits);

//         while (n > 0) {
//             int lastDigit = n % 10;
//             sum += Math.pow(lastDigit, numberOfDigits);
//             n /= 10;
//         }

//         return originalNumber == sum;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println(isArmstrong(n));
//     }
// }





import java.util.Scanner;

public class Armstrong {//0, 1, 153, 370, 371 and 407 
    public static boolean isArmstrong(int n) {
        int count=(int)(Math.log10(n)+1);
        int orig=n;
        int sum =0;
        while(n>0){
            int last=n%10;
            sum+=Math.pow(last, count);
            n/=10;

        }
        return orig==sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isArmstrong(n));
    }
}
