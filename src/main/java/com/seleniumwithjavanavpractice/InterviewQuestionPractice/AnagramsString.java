package com.seleniumwithjavanavpractice.InterviewQuestionPractice;

import java.util.Arrays;

public class AnagramsString {
    public static void main(String[] args) {
        String s1 = "ABC";
        String s2 = "ABC";

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        System.out.println(Arrays.equals(c1, c2));

    }
}
