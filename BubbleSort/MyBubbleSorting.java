package BubbleSort;

import java.util.Arrays;

public class MyBubbleSorting {
    public static void main(String[] args) {
        int arr[] = {12,4,7,7,2,1,9,16};
        System.out.println("Unsorted Array---> "+Arrays.toString(arr));
        MyBubbleSorting obj = new MyBubbleSorting();
        obj.SortArray(arr);
        System.out.println("Sorted Array---> "+Arrays.toString(arr));
    }
    public void SortArray(int arr[]){
        int c=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr.length-1 ; j++) {  //O(n^2)
                int temp;
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    c++;
                }
            }

        }
        System.out.println("Total swapping count is--> "+c);
    }
}
