import java.util.Scanner;


public class sort{
    public static int[] insertionSort(int[]arr){
       for(int i=1;i<arr.length-1;i++){
        int j=i;
        while(j>0&&arr[j]<arr[j-1]){
            int temp=arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
            j--;

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
        int res[]=insertionSort(arr);
        for(int x:res){
           System.out.print(x+" ");

        }

    }
}