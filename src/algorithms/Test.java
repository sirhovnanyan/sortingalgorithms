package algorithms;

public class Test {
    public static void main(String[] args) {
        int[] array1 = {5, 9, 1, 3, 4, 2, 6, 8, 7, 10};
        int[] array2 = {4, 85, 76, 11, 22, 1, 0, 63};
        SortingAlgorithms.bubbleSort(array1);
        System.out.print("\nSorted array through bubble sort: ");
        SortingAlgorithms.print(array1);
        SortingAlgorithms.insertionSort(array2);
        System.out.print("\nSorted array through insertion sort: ");
        SortingAlgorithms.print(array2);
    }
}
