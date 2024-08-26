package com.seleniumwithjavanavpractice.InterviewQuestionPractice;

public class Palindrom {
    public static void main(String[] args) {
        // stringBuilderApprach("ABBA");
        if (twoPointerApprach("ABBA")) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

    public static boolean twoPointerApprach(String s){
        int f=0;
        int l=s.length()-1;

        while (f<l) {
            if (s.charAt(f) != s.charAt(l)) {
                return false;
            }
            f++;
            l--;
        }
        return true;
    }

    public static void stringBuilderApprach(String s){
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();

        if (s.equals(stringBuilder.toString())) {
            System.out.println("Palindorm");
        }else{
            System.out.println("Not palindrom");
        }
    }
}
