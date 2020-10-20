package exercise4;

import java.util.Scanner;

public class ArrayOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int index = input.nextInt();
        int[] numbers = new int[index];
        String space = "";

        for (int i = 0; i < index; i++) {
            numbers[i] = input.nextInt();

        }
        for (int i = 0; i < index; i++) {
            System.out.println(space + numbers[i]);
            space = space + " ";
        }
    }
}
