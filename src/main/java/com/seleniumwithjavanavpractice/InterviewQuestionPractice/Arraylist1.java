package com.seleniumwithjavanavpractice.InterviewQuestionPractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Arraylist1 {
    public static void main(String[] args) {

        // ArrayList:
        // Backed by a dynamic array, which allows random access in O(1) time.
        // Insertion/removal from the end is O(1), but from the middle is O(n) because elements need to be shifted.
        // Usage: When you need fast random access and infrequent modifications, like storing test data or logs.

        // LinkedList:
        // Backed by a doubly linked list, which allows easy insertion and removal from both ends in O(1) time.
        // Random access is O(n), as it requires traversal from the head or tail.
        // Usage: When you need frequent additions/removals, especially at the beginning or end, like maintaining a queue 
        // of tasks or storing a sequence of steps for backtracking.

        List<String> arrayList = new ArrayList<>();
        arrayList.add("Test1");
        arrayList.add("Test2");
        System.out.println(arrayList.get(1)); // O(1) access

        List<String> linkedList = new LinkedList<>();
        linkedList.add("Test1");
        linkedList.add("Test2");
        linkedList.add(1, "Test1.5"); // O(1) insertion at index 1
        System.out.println(linkedList.get(1)); // O(n) access

    }
}
