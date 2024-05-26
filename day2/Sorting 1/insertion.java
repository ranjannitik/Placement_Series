//Principle: choose one and put it on correct place
public class insertion {
    public static void insertionSort(int[]arr){
        int n=arr.length;
        
        for(int i=0;i<=n-1;i++){   //i<=n-1 bcz if 6 element then if 5 step
           
            int j=i;                     //j=ikuki hr step me 1 element sahi jgh pe aayega to faltu ku check kare
           while(j>0&&arr[j-1]>arr[j]){    //j>0 ,esliye kuki arr ke first element tk check krna h//uske baad ka dekh rha h ki bda h kya present se pehle wala
            int temp=arr[j-1];
            arr[j-1]=arr[j];
            arr[j]=temp;
             j--;
            }
             }
       

    }
    public static void main(String[] args) {
        int arr[]={56,42,24,12,9,7};
       insertionSort(arr);
        System.out.print("[ ");
        for (int i =0;i<arr.length;i++) {
            System.out.print(arr[i]+",");
        }
        System.out.print(" ]");
    }
}
