package org.geekbrains;


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
        int j = 0;

        while (sChar[i] == ' ') i--;    // Убираем хвостовые пробелы
        while (sChar[j] == ' ') j++;    // Убираем лидирующие пробелы
        while (i >= j) {
            while (i >= j) {
                if (sChar[i] == ' ') {    // Пропускаем пробелы
                    i--;
                    continue;
                }
                while (i >= j && (sChar[i] != ' ')) {   // Определяем границы слова
                    if (!fWord) lastIndexWord = i;
                    fWord = true;
                    firstIndexWord = i;
                    i--;
                }
                // Записываем слово в буфер
                buf.append(Arrays.copyOfRange(sChar, firstIndexWord, lastIndexWord + 1));
                fWord = false;
                i--;
                if (i >= 0) {
                    buf.append(' ');
                }
            }
        }
        if (buf.charAt(buf.length()-1) == ' '){     // Убираем хвостовой пробел
            buf.deleteCharAt(buf.length()-1);
        }
        return buf.toString();
    }
}
