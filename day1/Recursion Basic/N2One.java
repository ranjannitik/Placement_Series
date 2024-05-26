import java.util.Scanner;

public class N2One {
        public static void printNos(int i ,int x) {
        // Write Your Code Here
        
        if(i<1)return;
       
        System.out.print(i);
        printNos(i-1,x);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printNos(n,n);
    }
}
