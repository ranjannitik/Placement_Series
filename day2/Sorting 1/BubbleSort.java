//Principle: max check push to last
public class BubbleSort {
    public static void Selection(int[]arr){
        int n=arr.length;
        
        for(int i=n-1;i>=1;i--){   //i=n-1 bcz if 6 element then if 5 step , and after each step decrese with 1 adnd go last
           int check=0;
            for(int j=0;j<=i-1;j++){     //j=0 bcz check from 1st element every time we have to check up to i-1 element bcz last is already short
                if(arr[j]>arr[i]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                    
                    check=1;

                }

            }
           
             if(check==0){   //jb arrange h to faltu time waste na ho 
                break;

        }

        }
       

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        Selection(arr);
        System.out.print("[ ");
        for (int i =0;i<arr.length;i++) {
            System.out.print(arr[i]+",");
        }
        System.out.print(" ]");
    }
}
