public class SelectionSort {

    static int n=5;
    static int[] arr ={4,5,3,1,6};
    public static void main(String[] args)
    {
        printArr(arr,n);
    }
    public static void sort(int[] arr, int n){
        int temp;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j])
                {
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
    }

    public static void printArr(int[] arr, int n){
        sort(arr,n);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
