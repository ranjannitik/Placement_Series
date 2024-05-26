import java.util.*;

public class sort {
    public static void print(int[] arr){
        System.out.println("After insertion sort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }

    }
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
    
        while (i <= j) {        //jab tk cross na kare i and j tb tk
            while (i <= high && arr[i] < pivot) {    //i jo h high se km ho arr[i] pivot se km ho i ko badhate jao
                i++;
            }
            while (j >= low && arr[j] > pivot) {         
                j--;
            }
    
            if (i < j) {                   //arr[i]  se pivot ka value jada mil jaye and arr[j] chota to aapas me swap jb tk i<j
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
    
        int temp = arr[low];         //piviot ko utha ke sahi jgh pe baitha do
        arr[low] = arr[j];
        arr[j] = temp;
    
        return j;
    }
    

 public static void qS(int []arr,int low,int high){            //kmsekm ek element hona chahiye esliye low chota ho high se 
    if (low < high) {
                    int pIndex = partition(arr, low, high);            //partition index wo hai pivot ka right position
                    qS(arr, low, pIndex - 1);               //quick sort left side laga rahe hai to partition ke pehle ka
                    qS(arr, pIndex + 1, high);          // //quick sort left side laga rahe hai to partition ke baad ka
                }
   
           
 }


    public static void main(String args[]) {
        
       int [] arr =  {4, 6, 2, 5, 7, 9, 1, 3};
        int n = arr.length;
        System.out.println("Before Using insertion Sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int low=0;
        int high=n-1;
        qS(arr, low, high);
       
        print(arr);
         System.out.println();
       
       
        
    }
}

