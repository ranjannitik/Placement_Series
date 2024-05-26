import java.util.ArrayList;

public class Merge {
    public static void merge(int[]arr,int low,int high,int mid){
        ArrayList<Integer>temp=new ArrayList<>();
        int left = low;
        int right=mid+1;
        while(left<=mid&&right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;

            }
             else{
                temp.add(arr[right]);
                right++;

            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            arr[i]=temp.get(i-low);
        }

       

    }
    public static void mergeSort(int[]arr,int low,int high){
       if(low>=high)return;
       int mid=(low+high)/2;
       mergeSort(arr, low, mid);
       mergeSort(arr, mid+1, high);
       merge(arr, low, high, mid);
       

    }
    public static void main(String[] args) {
        int arr[]={12,24,7,56,42,9};
        int low=0;
        int high=arr.length-1;
        mergeSort(arr,low,high);
        System.out.print("[ ");
        for (int i =0;i<arr.length;i++) {
            System.out.print(arr[i]+",");
        }
        System.out.print(" ]");
}
}
