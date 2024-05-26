public class swap{
    public static void swapNumber(int a, int b) {
        // Write your code here.
        a=a+b;
        b=a-b;
        a=a-b;
        
        System.out.println("x: "+a +" " +"y: "+ b);
    }
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
       swapNumber(x, y);
    }
}