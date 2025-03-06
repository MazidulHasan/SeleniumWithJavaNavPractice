// Reverse a String without using in-built methods


package com.Interview_Basic_Questions;
public class Array_nd_String_Manupulation {
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(reverseString(str));
    }

    public static String reverseString(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - i - 1];
            chars[chars.length - i - 1] = temp;
        }
        return new String(chars);
    }

}
