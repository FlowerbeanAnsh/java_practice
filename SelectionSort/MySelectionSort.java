package SelectionSort;

import java.util.Arrays;

public class MySelectionSort {
    public static void main(String[] args) {
        int arr[] = {13,34,2,7,1,0,56,31,100,21};
        System.out.println("Unsorted Array---> "+Arrays.toString(arr));
        MySelectionSort obj = new MySelectionSort();
        obj.SelectionSort(arr);
        System.out.println("Sorted Array---> " +Arrays.toString(arr));
    }
    public void SelectionSort(int arr[]){
        int temp=0;
        int min=0;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[j] < arr[min]){
                    min =j;

                }

            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }
    }
}
