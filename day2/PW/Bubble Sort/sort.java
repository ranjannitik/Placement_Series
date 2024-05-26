import java.util.Scanner;


public class sort{
    public static int[] bubbleSort(int[]arr){
        for(int i=0;i<arr.length-1;i++){  //n-1=arr.lenght-1
            boolean check=false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    check=true;
                    arr[j]=arr[j]^arr[j+1];
                    arr[j+1]=arr[j]^arr[j+1];
                    arr[j]=arr[j]^arr[j+1];
                }
            }
            if(check==false){
               break;
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
        int res[]=bubbleSort(arr);
        for(int x:res){
           System.out.print(x+" ");

        }

    }
}