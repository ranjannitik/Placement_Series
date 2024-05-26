public class StabilityCount {
    public static void print(int arr[]){
        System.out.println();
        for (int x:arr){
            System.out.print(x+" ");
        }
    }
    public static int largest(int arr[]){
        int max=arr[0];
        for (int x:arr){
            if(x>max)max=x;
        }
        return max;
    }
    public static void count(int arr[]){
        int maxlen=largest(arr)+1;
        int countArr[]=new int[maxlen];
        int n=arr.length;
        int op[]=new int[n];
        for(int x:arr){
            countArr[x]++;
        }
        for(int i=1;i<maxlen;i++){
            countArr[i]+=countArr[i-1];
        }
        for(int i=n-1;i>=0;i--){
           int idx=countArr[arr[i]]-1;
           op[idx]=arr[i];
           countArr[arr[i]]--;
        }
        print(op);
        System.out.println();
        print(arr);


    }
    public static void main(String[] args) {
        int arr[]={4,3,1,5,3,1,3,5};
        print(arr);
        count(arr);
        
        


    }
}
