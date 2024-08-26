package com.seleniumwithjavanavpractice.InterviewQuestionPractice;

public class ReverseInt {
    public static void main(String[] args) {
        int n = 123;
        String str = Integer.toString(n);
        StringBuilder stringBuilder = new StringBuilder(str);
        int result = Integer.parseInt(stringBuilder.reverse().toString());
        System.out.println(result);
    }
}
