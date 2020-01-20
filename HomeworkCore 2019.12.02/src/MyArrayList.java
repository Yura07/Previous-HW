import java.util.Arrays;

public class MyArrayList {
    private Integer arr[];
    private int size;

    public MyArrayList() {
        arr = new Integer[10];
    }

    public void add(Integer i) {
        if (size + 1 > arr.length) {
            Integer[] newArr = Arrays.copyOf(arr, (int) (arr.length * 1.5));
            arr = newArr;
            arr[size] = i;
            size++;
        } else {
            arr[size] = i;
            size++;
        }
    }


    public void printCollection() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(i);
            }
        }
    }

    public Integer get(Integer i) {
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == i) {
                return i;
            }
        }
        return null;
    }


    public boolean contains(Integer i) {
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == i){
                return true;
            }
        }
        return false;
    }


    public void sort(){
        boolean isSorted = false;
        int buf;
        while (!isSorted){
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++){
                if (arr[i] > arr[i+1]){
                    isSorted = false;

                    buf = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
