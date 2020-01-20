package task1;

import java.util.Random;

public class DeCoding {
    private StringBuilder text;
    private int key;
    private StringBuilder textOut;
    private char[] alphabet;

    public DeCoding(String text, int key) {
        this.text = new StringBuilder();
        this.text.append(text);
        this.key = -key;
        this.textOut = new StringBuilder();
        this.alphabet = new char[26];
        initializeAlphabet();
    }


    public String shiftAndReverse() {
        int index = 0;
        String str = text.reverse().toString();
        text = new StringBuilder().append(str);
        char[] arr = text.toString().toCharArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (arr[i] == alphabet[j]) {
                    index = j;
                }
            }
            if (arr[i] < 97 || arr[i] > 122) {
                textOut.append(arr[i]);
            } else if (arr[i] + key > 122) {
                textOut.append(alphabet[key - (123 - arr[i])]);
            } else {
                textOut.append(alphabet[key + index]);
            }
        }
        return textOut.toString();
    }


    public String deleteLetter(String abc){
        char[] chars = abc.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < chars.length; i+=2) {
            char c = chars[i];
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }


    private void initializeAlphabet() {
        int index = 0;
        for (int i = 97; i < 123; i++, index++) {
            alphabet[index] = (char) i;
        }
    }
}
