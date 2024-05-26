public class countSort {
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
        for(int x:arr){
            countArr[x]++;
        }
        int idx=0;
        for(int i=0;i<maxlen;i++){
            while(countArr[i]>0){
                arr[idx++]=i;
                countArr[i]--;
            }
        }
        print(countArr);
        System.out.println();
        print(arr);


    }
    public static void main(String[] args) {
        int arr[]={4,3,1,5,3,1,3,5};
        print(arr);
        count(arr);
        
        


    }
}
