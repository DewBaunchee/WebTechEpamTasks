package by.varyvoda.matvey.utils;

public class SortUtils {

    public static int[] shellSort(int[] numbers) {
        boolean notSorted = true;
        for (int i = 0; notSorted && i < numbers.length; i++) {
            notSorted = false;
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    swap(numbers, j, j + 1);
                    notSorted = true;
                    j--;
                }
            }
        }
        return numbers;
    }

    public static void swap(int[] numbers, int first, int second) {
        int temp = numbers[first];
        numbers[first] = numbers[second];
        numbers[second] = temp;
    }
}
