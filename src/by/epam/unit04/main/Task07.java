package by.epam.unit04.main;

import java.util.Random;

public class Task07 {
    public static void main(String[] args) {
        int[][] mas = new int[4][4];
        Random rand = new Random();

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = rand.nextInt(100);
            }
        }

        System.out.println(" Матрица :");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("[%4d]", mas[i][j]);
            }
            System.out.println();
        }
        System.out.println("-----------------------------------");
        System.out.println(" Элементы стоящие на диагонали :");
        System.out.println(mas[0][0]);
        System.out.println(mas[1][1]);
        System.out.println(mas[2][2]);
        System.out.println(mas[3][3]);
    }
}

