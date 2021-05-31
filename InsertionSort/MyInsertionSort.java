package InsertionSort;

import java.util.Arrays;

public class MyInsertionSort {
    public static void main(String[] args) {
        int arr[] = {5,1,6,2,4,3,6};
        System.out.println("Unsorted Array ---> " + Arrays.toString(arr));
        MyInsertionSort obj = new MyInsertionSort();
        obj.InsertionSorting(arr);
        System.out.println("Sorted Array ---> "+ Arrays.toString(arr));
    }
    public void InsertionSorting(int arr[]){
        int temp,j;
        for (int i = 1; i < arr.length ; i++) {
            temp = arr[i];
            j = i;
            while(j>0 && arr[j-1]>temp){
                 arr[j]  = arr[j-1];
                 j--;
            }
            arr[j] = temp;
        }

            }
}
