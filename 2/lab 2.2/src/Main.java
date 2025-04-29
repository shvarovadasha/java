//Найти наименьший среди локальных максимумов. (Элемент матрицы называется локальным
//минимумом, если он строго меньше всех своих соседей.)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int rows = scanner.nextInt();
        System.out.print("Введите количество столбцов: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int minLocalMax = Integer.MAX_VALUE;
        boolean found = false;

        for (int i = 1; i < rows - 1; i++) {
            for (int j = 1; j < cols - 1; j++) {
                int current = matrix[i][j];
                if (current > matrix[i - 1][j] &&
                        current > matrix[i + 1][j] &&
                        current > matrix[i][j - 1] &&
                        current > matrix[i][j + 1]) {

                    if (!found || current < minLocalMax) {
                        minLocalMax = current;
                        found = true;
                    }
                }
            }
        }
        
        if (found) {
            System.out.println("Наименьший из локальных максимумов: " + minLocalMax);
        } else {
            System.out.println("Локальные максимумы не найдены.");
        }

        scanner.close();
    }
}
