import java.util.*;
public class one {
    public static void nForest(int n) {
        // Write your code here
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("daal");
        int number=sc.nextInt();
        nForest(number);

    }
}