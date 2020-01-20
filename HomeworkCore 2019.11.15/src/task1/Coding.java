package task1;

import java.util.Random;

public class Coding {
    private StringBuilder text;
    private int key;
    private StringBuilder textOut;
    private char[] alphabet;

    public Coding(String text, int key) {
        this.text = new StringBuilder();
        this.text.append(text);
        this.key = key;
        this.textOut = new StringBuilder();
        this.alphabet = new char[26];
        initializeAlphabet();
    }


    public String shiftAndReverse() {
        int index = 0;
        String str = text.reverse().toString().toLowerCase().trim().replace("\n", "");
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

    public   String insertAdditionalLetter(String s) {
        char[] chars = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            stringBuilder.append(c);
            stringBuilder.append(getRandomValue());
        }

        return stringBuilder.toString();
    }

    private char getRandomValue() {
        return (char) (new Random().nextInt(26) + 'a');
    }

    private void initializeAlphabet() {
        int index = 0;
        for (int i = 97; i < 123; i++, index++) {
            alphabet[index] = (char) i;
        }
    }
}