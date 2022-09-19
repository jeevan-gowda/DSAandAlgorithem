package sorting;

//Given an unsorted array of size N, use selection sort to sort arr[] in increasing order.
public class SelectionSort {

    static int n;
    static int arr[] ={4,5,3,1,6};

    public static void main(String[] args)
    {
        printArr(arr);
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

    public static void printArr(int[] arr){
        n=arr.length;
        sort(arr,n);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
