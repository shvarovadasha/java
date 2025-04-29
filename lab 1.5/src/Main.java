//Ввести с консоли 3 целых числа. На консоль вывести: Найти сумму двух
//наибольших из них.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        System.out.print("Введите третье число: ");
        int c = scanner.nextInt();

        int sum;
        if (a <= b && a <= c) {
            sum = b + c;
        } else if (b <= a && b <= c) {
            sum = a + c;
        } else {
            sum = a + b;
        }

        System.out.println("Сумма двух наибольших чисел: " + sum);

        scanner.close();
    }
}
