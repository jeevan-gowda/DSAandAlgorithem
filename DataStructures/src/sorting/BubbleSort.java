package sorting;
//Given an unsorted array of size N, use Insertion sort to sort arr[] in increasing order.
public class BubbleSort {
    static int arr[] ={4,5,3,1,6,9,8,7,2};

    public static void main(String[] args)
    {
        printArr(arr);
    }
    public static void sort(int[] arr, int n){
        int temp;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void printArr(int[] arr){
        int n=arr.length;
        sort(arr,n);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
