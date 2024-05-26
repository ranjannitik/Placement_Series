//    import java.util.*;
// public class five {
//     public static void seeding(int n) {
//         // Write your code here
//         for(int i=1;i<=n;i++){
//             for(int j=n;j>=i;j--){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] arg){
//         Scanner sc=new Scanner(System.in);
        
//         int number=sc.nextInt();
//         seeding(number);

//     }
// }


///or

   import java.util.*;
public class five {
    public static void seeding(int n) {
        // Write your code here
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        
        int number=sc.nextInt();
        seeding(number);

    }
}
    

    
