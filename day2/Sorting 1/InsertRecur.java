//Principle: choose one and put it on correct place
public class InsertRecur {
    public static void insertionSort(int[]arr,int i,int n){
        
        
          if(i==n)return;//i<=n-1 bcz if 6 element then if 5 step
           
            int j=i;                     //j=ikuki hr step me 1 element sahi jgh pe aayega to faltu ku check kare
           while(j>0&&arr[j-1]>arr[j]){    //j>0 ,esliye kuki arr ke first element tk check krna h//uske baad ka dekh rha h ki bda h kya present se pehle wala
            int temp=arr[j-1];
            arr[j-1]=arr[j];
            arr[j]=temp;
             j--;
            }
            insertionSort(arr,i+1,n);
             
       

    }
    public static void main(String[] args) {
        int arr[]={56,42,24,12,9,7};
        int n=arr.length;
        int i=0;
       insertionSort(arr,i,n);

        System.out.print("[ ");
        for (int k =0;k<arr.length;k++) {
            System.out.print(arr[k]+",");
        }
        System.out.print(" ]");
    }
}
