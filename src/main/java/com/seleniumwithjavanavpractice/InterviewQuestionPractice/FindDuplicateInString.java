package com.seleniumwithjavanavpractice.InterviewQuestionPractice;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateInString {
    public static void main(String[] args) {
        findDuplicate("automation");
    }

    public static void findDuplicate(String input){
        Map<Character,Integer> characterCount = new HashMap<>();

        for (char c : input.toCharArray()) {
            characterCount.put(c, characterCount.getOrDefault(c,0)+1);
        }

        for (Map.Entry<Character,Integer> entry : characterCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate::"+ entry.getKey());
            }
        }
    }
}
