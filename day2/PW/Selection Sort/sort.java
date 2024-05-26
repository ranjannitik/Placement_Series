import java.util.Scanner;


public class sort{
    public static int[] selectionSort(int[]arr){
        for(int i=0;i<arr.length-1;i++){  //n-1=arr.lenght-1     rown=6then5time iter
         int min_idx=i;
            for(int j=i+1;j<=arr.length-1;j++){     //column ==n-1bcz last tk dekhna h aage se ek ek chorte jana hai
                if(arr[j]<arr[min_idx]){
                    min_idx =j;
                }
                
              
            }
            
            arr[i]=arr[i]^arr[min_idx];
            arr[min_idx]=arr[i]^arr[min_idx];
            arr[i]=arr[i]^arr[min_idx];
           
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
        int res[]=selectionSort(arr);
        for(int x:res){
           System.out.print(x+" ");

        }

    }
}