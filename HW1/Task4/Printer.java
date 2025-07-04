/** Задание 4. */

package HW1.Task4;

class Answer {
    // Функция для нахождения максимума из двух чисел
    public int findMaxOfTwo(int a, int b) {
        return (a > b) ? a : b;
    }

    // Функция для нахождения максимума из трёх чисел
    public int findMaxOfThree(int a, int b, int c) {
        // Сначала находим максимум между a и b, а затем сравниваем его с c
        return findMaxOfTwo(findMaxOfTwo(a, b), c);
    }
}

public class Printer {
    public static void main(String[] args) {
        int a = 5, b = 10, c = 3;
        if (args.length == 3) {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            c = Integer.parseInt(args[2]);
        }
        // Вывод результата на экран
        Answer ans = new Answer();
        int itresume_res = ans.findMaxOfThree(a, b, c);
        System.out.println(itresume_res);
    }
}