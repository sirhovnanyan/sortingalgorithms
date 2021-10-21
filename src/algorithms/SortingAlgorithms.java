package algorithms;

public class SortingAlgorithms {

    public static void bubbleSort(int[] array) {
        boolean isSorted;
        for (int i = 0; i < array.length; i++) {
            isSorted = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    isSorted = true;
                }
            }
            if (isSorted == false) {
                break;
            }
        }
    }

    public static void insertionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > element) {
                array[j] = array[j - 1];
                j = j - 1;
            }
            array[j] = element;
        }
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

