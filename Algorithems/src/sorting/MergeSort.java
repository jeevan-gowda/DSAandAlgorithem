package sorting;

public class MergeSort {
    static int arr[] ={4,5,3,1,6};

    public static void main(String[] args)
    {
        printArr(arr);
    }

    static void merge(int arr[], int l, int m, int r)
    {
        // Your code here
        int n1,n2;
        n1=m-l+1;
        n2=r-m;
        int larr[]=new int[n1];
        int rarr[]=new int[n2];
        for(int i=0;i<n1;i++)
        {
            larr[i]=arr[l+i];
        }
        for(int j=0;j<n2;j++)
        {
            rarr[j]=arr[m+1+j];
        }

        int k=l,i=0,j=0;
        while(i<n1 && j<n2)
        {
            if(larr[i]<=rarr[j]){
                arr[k]=larr[i];
                i++;
            }
            else{
                arr[k]=rarr[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=larr[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=rarr[j];
            j++;
            k++;
        }



    }
    static void mergeSort(int arr[], int l, int r)
    {
        if(l<r)
        { //code here
            int mid=l+(r-l)/2;

            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);

        }


    }


    public static void printArr(int[] arr){
       int n=arr.length;
        mergeSort(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
