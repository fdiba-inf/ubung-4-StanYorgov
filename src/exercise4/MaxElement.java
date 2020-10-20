package exercise4;

import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int index = input.nextInt();
        double[] numbers = new double[index];
        double maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < index; i++) {
            numbers[i] = input.nextDouble();
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }

        System.out.println("Max number: " + maxValue);
    }
}
