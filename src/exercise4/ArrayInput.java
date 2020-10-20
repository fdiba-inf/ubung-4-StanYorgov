package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int index = input.nextInt();
        int[] numbers = new int[index];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        String numbersAsString = Arrays.toString(numbers);
        System.out.println("Numbers: " + numbersAsString);
    }
}
