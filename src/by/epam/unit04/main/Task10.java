package by.epam.unit04.main;

public class Task10 {
    public static void main(String[] args) {
        int n = 6;
        int[][] mas = new int[n][n];
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < mas.length; j++) {
                mas[i][j] = 1;
            }
        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < 1; j++) {
                mas[i][j] = 1;
            }
        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 5; j < mas.length; j++) {
                mas[i][j] = 1;
            }
        }
        for (int i = 5; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                mas[i][j] = 1;
            }
        }

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                System.out.printf("[%4d]", mas[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
