package org.campus02.array;

public class ArrayHelper {

    public static void main(String[] args) {

        int[] arr = new int[6];
        arr[0] = 8;
        arr[1] = 5;
        arr[2] = 1;
        arr[3] = 9;
        arr[4] = 0;
        arr[5] = 4;

        arrangeOrder(arr);
        for (int element : arr){
            System.out.print(element + ", ");
        }
    }

    public static void arrangeOrder(int[] array){

        boolean exchanged = true;
        while (exchanged) {
            exchanged = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    exchanged = true;
                }
            }
        }
    }
}
