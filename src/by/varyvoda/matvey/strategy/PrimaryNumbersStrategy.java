package by.varyvoda.matvey.strategy;

import by.varyvoda.matvey.utils.InputUtils;

import java.util.Arrays;
import java.util.Scanner;

public class PrimaryNumbersStrategy implements TaskStrategy{

    private final Scanner in;

    public PrimaryNumbersStrategy(Scanner in) {
        this.in = in;
    }

    @Override
    public void algorithm() {
        int[] numbers = InputUtils.inputIntArray(in);

        int[] indexes = findIndexesOfPrimaryNumbers(numbers);
        System.out.println("Result: " + Arrays.toString(indexes));
    }

    private int[] findIndexesOfPrimaryNumbers(int[] numbers) {
        int[] answer = new int[numbers.length];
        int nextIndex = 0;
        for(int i = 0; i < numbers.length; i++) {
            if(isPrimary(numbers[i])) {
                answer[nextIndex] = i;
                nextIndex++;
            }
        }
        return Arrays.copyOf(answer, nextIndex);
    }

    private boolean isPrimary(int number) {
        if(number < 2) return false;
        if(number == 2 || number == 5) return true;
        if(number % 2 == 0 || number % 5 == 0) return false;


        int currentDivider = 2;
        double sqrtOfNumber = Math.sqrt(number);
        while(currentDivider <= sqrtOfNumber) {
            if(number % currentDivider++ == 0) return false;
        }
        return true;
    }

    @Override
    public String description() {
        return "Print indexes of primary numbers in array.";
    }
}
