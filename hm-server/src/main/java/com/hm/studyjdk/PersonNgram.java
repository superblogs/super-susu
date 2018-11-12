package com.hm.studyjdk;


import java.util.Arrays;
import java.util.List;

public class PersonNgram {


    public static void main(String[] args) {
//        personalNGram(2, 3, "hello world");
        List list = Arrays.asList(new String[]{"a", "b", "c", "d"});
        parselist(list, 5);
    }

    private static void parselist(List list, int n) {
        for (int j = 0; j < list.size() && (list.size() - j >= n); j++) {
            for (int k = 0; k < n; k++) {
                System.out.print(list.get(j + k));
            }
            System.out.println();

        }
    }

    /*public static void personalNGram(int minLength, int maxLength, String words) {

        int wordLength = words.length();
        System.out.println("字符串的长度是 : " + wordLength);

        maxLength = maxLength > words.length() ? wordLength : maxLength;


        if (minLength >= wordLength) {
            System.out.println(words);
        }

        for(int one =0;one <wordLength;one++){

        }
    }*/
}
