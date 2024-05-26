 import java.util.*;
public class twelve {
    public static void numberCrown(int n) {
        // Write your code here
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=i;j++){
                System.out.print(j);

            }
             for(int j=1;j<=2*(n-i);j++){
                  System.out.print(" ");

            }
             for(int j=1;j<=i;j++){
                  System.out.print(j);

            }
            System.out.println();
        }
    }
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        
        int number=sc.nextInt();
        numberCrown(number);

    }
}
    

    
