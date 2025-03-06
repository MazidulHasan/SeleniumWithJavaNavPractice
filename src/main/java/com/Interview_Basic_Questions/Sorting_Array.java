// Sort an Array without using built-in methods

package com.Interview_Basic_Questions;

public class Sorting_Array {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 4, 5};
        System.out.println("Sorted Array : "+sortArray(arr).toString());
    }

    // Bubble Sort Implementation
    public static int[] sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
