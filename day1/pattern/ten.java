import java.util.Scanner;

public class ten {
    public static void nStarTriangle(int n) {
        // Write your code here
        for(int i=1;i<=(2*n)-1;i++){
            int star=i;
            if(i>n)star=2*n-i;
           for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        nStarTriangle(n);

    }
}