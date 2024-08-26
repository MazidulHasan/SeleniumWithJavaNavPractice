package com.seleniumwithjavanavpractice.InterviewQuestionPractice;

public class PreAndPostIncrement {
    public static void main(String[] args) {
        int i=1;

        int r = ++i;
        System.out.println(r+" "+i);
        int r2 = i--;
        System.out.println(r2+" "+i);
    }
}
