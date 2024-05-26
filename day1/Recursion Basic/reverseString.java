import java.util.Scanner;

public class reverseString {
    public static boolean stringRev(int i,String s){
        
        if (i>=s.length()/2)return true;
        if(s.charAt(i)!=s.charAt(s.length()-1-i))return false;
        return stringRev(i+1,s);
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
      boolean ans=  stringRev(0,s);
      System.out.println(ans);
    }
}
