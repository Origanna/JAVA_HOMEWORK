/** Задание 2. */

package HW1.Task2;

class Answer {
    public static void printEvenNums() {
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
        }
    }
}

public class Printer {
    public static void main(String[] args) {
        Answer ans = new Answer();
        ans.printEvenNums();
    }
}
