//principle : Check Min and Swap Each other and then increase each time i 
public class SelectionSort{
    public static void Selection(int[]arr){
        int n=arr.length;
        for(int i=0;i<=n-2;i++){   //i<=n-2 bcz if 6 element then if 5 sort ,so not necessaryt to 6th element
            for(int j=i;j<=n-1;j++){     //j<=n-1 bcz if 6 element and every time we have to check all theseup to 6th element for minimum
                if(arr[j]<arr[i]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;

                }

            }

        }

    }
    public static void main(String[] args) {
        int arr[]={12,24,7,56,42,9};
        Selection(arr);
        System.out.print("[ ");
        for (int i =0;i<arr.length;i++) {
            System.out.print(arr[i]+",");
        }
        System.out.print(" ]");
    }
}