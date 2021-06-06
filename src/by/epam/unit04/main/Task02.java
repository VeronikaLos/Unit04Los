package by.epam.unit04.main;

import java.util.Random;

public class Task02 {
    public static void main(String[] args) {
        double[] mas = new double[10];
        double length = 0.0;
        double min = 0.0;
        double max = 0.0;
        Random rand = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(1000);
        }
        min = mas[0];
        for (int i = 1; i < mas.length; i++) {
            if (mas[i] < min) {
                min = mas[i];
            }
        }
        max = mas[0];
        for (int i = 1; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
            }
        }
        length = max-min;
        System.out.println("min length=" + " " + length + "\n");
        for (int i = 0; i < mas.length; i++) {
            System.out.println("[" + mas[i] + "]");
        }
    }
}
