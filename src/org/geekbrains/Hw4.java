package org.geekbrains;


import java.util.ArrayList;
import java.util.Arrays;

public class Hw4 {
    public String reverseWords(String s) {
        if (s.isEmpty() || s == null) return "";

        StringBuilder buf = new StringBuilder();
        char[] sChar = s.toCharArray();
        int lastIndexWord = sChar.length - 1;
        int firstIndexWord = 0;
        boolean fWord = false;
        int i = sChar.length - 1;
//        ArrayList<String> list = new ArrayList<>(s);

//        while (i >= 0) {
//            while (i>=0 && sChar[i] != ' ') {
//                if (!fWord) lastIndexWord = i;
//                fWord = true;
//                firstIndexWord = i;
//                i--;
//            }
//            buf.append(Arrays.copyOfRange(sChar, firstIndexWord, lastIndexWord + 1));
//            fWord = false;
//            i--;
//                if (i > 0) {
//                    buf.append(' ');
//                }
//        }

        return buf.toString();
    }
}
