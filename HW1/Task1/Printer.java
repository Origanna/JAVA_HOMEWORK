/** Задание 1. */

package HW1.Task1;

class Answer {
    public int factorial(int n) {
        if (n < 0) {
            return -1;
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

public class Printer {
    public static void main(String[] args) {
        int n = 5;
        if (args.length > 0) {
            n = Integer.parseInt(args[0]);
        }
        // Вывод результата на экран
        Answer ans = new Answer();
        int itresume_res = ans.factorial(n);
        System.out.println(itresume_res);
    }
}
