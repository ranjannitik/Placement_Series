    public static void printNos(int i ,int x) {
        // Write Your Code Here
        
        if(i>x)return;
       
        System.out.print(i);
        printNos(i+1,x);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printNos(1,n);
    }