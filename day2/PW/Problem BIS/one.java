import java.util.Scanner;


public class one{
    public static int[] ZeroSort(int[]arr){
      for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-1;j++){
            if(arr[j]==0){
                
            }
        }
      }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size Of Array");
        int n = sc.nextInt();
        System.out.println("WRITE "+n+"ELEMENTS");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        int res[]=ZeroSort(arr);
        for(int x:res){
           System.out.print(x+" ");

        }

    }
}