import java.util.Scanner;

public class sumPara {
     public static void sumNo( int i,int Sum) {
        // Write Your Code Here
        
        if(i<1){
          System.out.println(Sum);
          return;
        }

       sumNo(i-1,Sum+i);
       
       

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      sumNo(n,0);
      
    }
    
}
