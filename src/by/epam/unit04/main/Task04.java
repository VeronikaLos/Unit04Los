package by.epam.unit04.main;

import java.util.Random;

public class Task04 {
    public static void main(String[] args) {
        int[] ar = new int[10];
        Random rand = new Random();

        for (int i = 0; i < ar.length; i++) {
            ar[i] = rand.nextInt(1000);
        }

        for (int i = 0; i < ar.length; i++) {
            System.out.printf("%4d ", ar[i]);
        }
        System.out.println();

        int max, temp;
        for (int i = 0; i < ar.length - 1; i++) {
            max = i;

            for (int j = i + 1; j < ar.length; j++) {
                if (ar[j] > ar[max]) {
                    max = j;
                }
            }
            temp = ar[i];
            ar[i] = ar[max];
            ar[max] = temp;
        }
        for (int i = 0; i < ar.length; i++) {
            System.out.printf("%4d ", ar[i]);
        }
        System.out.println();
    }
}
