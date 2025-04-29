import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел Фибоначчи: ");
        int n = scanner.nextInt();

        int first = 1;
        int second = 1;

        if (n <= 0) {
            System.out.println("Введите положительное число.");
        } else if (n == 1) {
            System.out.println("Числа Фибоначчи: " + first);
        } else {
            System.out.print("Числа Фибоначчи: " + first + " " + second + " ");
            for (int i = 3; i <= n; i++) {
                int next = first + second;
                System.out.print(next + " ");
                first = second;
                second = next;
            }
        }

        scanner.close();
    }
}
