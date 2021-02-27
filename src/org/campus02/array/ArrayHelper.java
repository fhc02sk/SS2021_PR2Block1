package org.campus02.array;

public class ArrayHelper {

    public static void main(String[] args) {

        Car[] arr = new Car[6];
        arr[0] = new Car("Model 3", 2020, 10_000);
        arr[1] = new Car("Golf 3", 2001, 500_000);
        arr[2] = new Car("Golf 7", 2018, 20_000);
        arr[3] = new Car("Model S", 2014, 70_000);
        arr[4] = new Car("A3", 2002, 130_000);
        arr[5] = new Car("Mercedes C", 1999, 250_000);

        arrangeOrder(arr);
        for (Car element : arr){
            System.out.print(element + ", ");
        }
    }

    public static void arrangeOrder(IntSortable[] array){

        boolean exchanged = true;
        while (exchanged) {
            exchanged = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].sortValue() > array[i + 1].sortValue()) {
                    IntSortable tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    exchanged = true;
                }
            }
        }
    }
}
