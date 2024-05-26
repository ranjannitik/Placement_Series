import java.util.Scanner;

public class sumAllDivisor {
     public static int Divi(int n) {
        int sum = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
               
                sum += i;
                if ((n / i) != i) {
                    
                    sum += (n / i);
                }
            }
        }
        return sum;
    }
public static int cutter(int n){
    int tsum=0;
   for(int i=1;i<=n;i++){
       
    tsum += Divi(i);
      

    }
    return tsum;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Sum of divisors: " + cutter(n));
    }
    
}
