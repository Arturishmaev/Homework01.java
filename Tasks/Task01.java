// Задача 1: Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120

package Tasks;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите число n: ");
        int n = sc.nextInt();
        int summ = 0;
        int multiple = 1;
        for (int i = 1; i <= n; i++) {
            summ = summ + i;
        }
        for (int i = 1; i <= n ; i++) {
            multiple = multiple * i;
        }
        System.out.printf("Сумма n чисел: ");
        System.out.println(summ);
        System.out.printf("Произведение n чисел: ");
        System.out.println(multiple);
        sc.close();
    }
}