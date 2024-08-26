package com.seleniumwithjavanavpractice.InterviewQuestionPractice;

public class ReverseString {
    public static void main(String[] args) {
        String s = "ABCD";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
