package exercise4;

import java.util.Scanner;

public class MinIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int index = input.nextInt();
        double[] array = new double[index];
        int minIndex = Integer.MAX_VALUE;

        for (int i = 0; i < index; i++) {
            array[i] = input.nextDouble();
            if (array[i] < minIndex) {
                minIndex = i;
            }
        }

        System.out.println("Min index: " + minIndex);
    }
}
