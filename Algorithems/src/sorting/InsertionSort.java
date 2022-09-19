package sorting;

//Given an unsorted array of size N, use Insertion sort to sort arr[] in increasing order.
public class InsertionSort {
    static int n;
    static int arr[] ={4,5,3,1,6};

    public static void main(String[] args)
    {
        printArr(arr);
    }
    public static void sort(int[] arr, int n){
        int key,j;
        for(int i=1;i<n;i++){
            key=arr[i];
            j=i-1;
            while (j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
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
