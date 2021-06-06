package by.epam.unit04.main;

public class Task09 {
    public static void main(String[] args) {
        int n = 6;
        int[][] mas = new int[n][n];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 5; j >= 0; j--) {
                mas[i][i]=i+1;
                mas[j][j]=j+1;
            }
        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 5; j >= 0; j--) {
                System.out.printf("[%4d]", mas[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
