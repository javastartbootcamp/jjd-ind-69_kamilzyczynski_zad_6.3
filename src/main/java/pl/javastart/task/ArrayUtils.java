package pl.javastart.task;

import java.util.Scanner;

public class ArrayUtils {

    int[][] createArray() {
        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        boolean incorrectNumber = true;
        do {
            System.out.println("Podaj liczbę wierszy");
            rows = scanner.nextInt();
            System.out.println("Podaj liczbę kolumn");
            columns = scanner.nextInt();
            if (rows > 100 || rows < 1) {
                System.out.println("Błędna liczba wierszy. Prawidłowy przedział to <1 ; 100>!");
            } else if (columns > 100 || columns < 1) {
                System.out.println("Błędna liczba kolumn. Prawidłowy przedział to <1 ; 100>!");
            } else {
                incorrectNumber = false;
            }
        } while (incorrectNumber);

        int[][] tab = new int[rows][columns];

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = i * j;
            }
        }
        return tab;
    }

    void showArrayInfo(int[][] tab) {
        for (int[] ints : tab) {
            for (int anInt : ints) {
                System.out.printf("%3d |", anInt);
            }
            System.out.println();
            String separator = "-----".repeat(ints.length);
            System.out.println(separator);
        }
    }
}
