import java.util.Scanner;

public class wiBaN21 {
     public static void printNos(int i ,int x) {
        // Write Your Code Here
        
        if(i>x)return;
       
       
        printNos(i+1,x);
         System.out.print(i);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printNos(1,n);
    }
    
}
