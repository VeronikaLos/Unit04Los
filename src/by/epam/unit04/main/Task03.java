package by.epam.unit04.main;

public class Task03 {
    public static void main(String[] args) {
        int[] mas = new int[]{899, -586, 212, 0, -432, 0, 495, 161,
                984, 0, 0, 754, -309, 361, 40, -14, 697, -422, -884, 0};
        int countZero = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == 0) {
                countZero++;
            }
        }
        int negative = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < 0) {
                negative++;
            }
        }
        System.out.println("countZero=" + countZero);
        System.out.println("negative=" + negative);
    }
}
