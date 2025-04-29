import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов в массиве (не более 30): ");
        int n = scanner.nextInt();
        if (n <= 0 || n > 30) {
            System.out.println("Некорректное количество элементов.");
            return;
        }
        int[] array = new int[n];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int minValue = array[0];
        int minIndex = 0;
        for (int i = 1; i < n; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        int middleIndex = n / 2;
        int start = Math.min(minIndex, middleIndex) + 1;
        int end = Math.max(minIndex, middleIndex);
        if (start >= end) {
            System.out.println("Сумма элементов между минимальным и средним элементом: 0");
        } else {
            int sum = 0;
            for (int i = start; i < end; i++) {
                sum += array[i];
            }
            System.out.println("Сумма элементов между минимальным и средним элементом: " + sum);
        }

        scanner.close();
    }
}
