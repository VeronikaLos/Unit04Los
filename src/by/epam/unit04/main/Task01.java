package by.epam.unit04.main;

import java.util.Random;

public class Task01 {
    public static void main(String[] args) {
        double[] mas = new double[10];
        int count = 0;

        Random rand = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(1000);
            if (mas[i] % 2 == 0) {
                count++;
                System.out.printf("[%3.0f]", mas[i]);
            }
        }
        if (count == 0) {
            System.out.println("No even numbers");
        }
    }
}
