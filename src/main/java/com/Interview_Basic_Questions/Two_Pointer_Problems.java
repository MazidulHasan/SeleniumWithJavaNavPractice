// Find duplicate elements in Array
package com.Interview_Basic_Questions;

import java.util.HashMap;
import java.util.HashSet;

public class Two_Pointer_Problems {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 2, 4, 8, 2, 9};
        nestedLoop(arr);
        hashSet(arr);
        hashMapForFrequencyCount(arr);
    }

    public static void nestedLoop(int[] arr) {
        System.out.println("Duplicate Elements:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break; // Avoid printing the same duplicate multiple times
                }
            }
        }
    }

    public static void hashSet(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        System.out.println("Duplicate Elements:");
        for (int num : arr) {
            if (!set.add(num)) { // If add() returns false → Duplicate found
                System.out.println(num);
            }
        }
    }

    public static void hashMapForFrequencyCount(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println("Duplicate Elements:");
        for (int key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.println(key);
            }
        }
    }
}
