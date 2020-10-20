package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReversal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int index = input.nextInt();
        char[] symbols = new char[index];
        char[] reversedSymbols = new char[index];
        int counter = index - 1;

        for (int i = 0; i < index; i++) {
            symbols[i] = input.next().charAt(0);
            reversedSymbols[counter] = symbols[i];
            counter--;
        }

        String reversedSymbolsAsString = Arrays.toString(reversedSymbols);
        System.out.println("Reversed symbols: " + reversedSymbolsAsString);
    }

}