package exercise4;

import java.util.Scanner;

public class MinIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int index = input.nextInt();
        double[] array = new double[index];
        double minValue = Double.MAX_VALUE;
        int minIndex = 0;

        for (int i = 0; i < index; i++) {
            array[i] = input.nextDouble();
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }

        System.out.println("Min index: " + minIndex);
    }
}
