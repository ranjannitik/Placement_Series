//Collections.reverse(Arrays.asList(arr));
//Collections.reverse(Arrays.asList(arr));
// public class ReverseArray {
//     public static void reverse(int l, int r, int[] arr) {
//         if (l >= r) {
//             return;
//         }

//         // Swap arr[l] and arr[r]
//         int temp = arr[l];
//         arr[l] = arr[r];
//         arr[r] = temp;

//         // Recursively reverse the rest of the array
//         reverse(l + 1, r - 1, arr);
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};
//         int l = 0;
//         int r = arr.length - 1;

//         // Call the reverse function
//         reverse(l, r, arr);

//         // Print the reversed array foreach loop
//        for(int value:arr){
//         System.out.print(value+" ");
//        }
//     }
// }

import java.util.Scanner;

public class ReverseArray {
    public static void reverse(int i,int n, int[] arr) {
        
        if ( i>=n/2) {
            return;
        }

        // Swap arr[l] and arr[r]
        int temp = arr[i];
        arr[i] = arr[n-1];
        arr[n-1] = temp;

        // Recursively reverse the rest of the array
        reverse(i+1, n-i-1, arr);
    }

    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements in Array :");
        int no=sc.nextInt();
        int[]arr=new int[no];
        System.out.println("Enter Elements of Array :");
        for(int i=0;i<no;i++){
           arr [i]=sc.nextInt();

        }
        
        

        // Call the reverse function
        reverse(0,no, arr);

        // Print the reversed array foreach loop
       for(int value:arr){
        System.out.print(value+" ");
       }
    }
}
