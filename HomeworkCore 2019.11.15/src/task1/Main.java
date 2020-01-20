package task1;

public class Main {
    public static void main(String[] args) {
        Coding text = new Coding("Coffee", 3);
        String s = text.shiftAndReverse();
        String s1 = text.insertAdditionalLetter(s);
        System.out.println("Coding: "+s1);
        System.out.println();

        DeCoding text1 = new DeCoding(s1,3);
        String s2 = text1.shiftAndReverse();
        String s3 = text1.deleteLetter(s2);
        System.out.println("Decoding: "+s3);
    }
}
