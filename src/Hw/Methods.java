package Hw;

public class Methods {
    static void add(int a, int c) throws IllegalArgumentException, ArithmeticException, MyException, IllegalAccessException {
        if (a < 0 && c < 0) {
            throw new IllegalArgumentException("Не можуть бути 2 відємних");
        } else if (a == 0 && c != 0) {
            throw new ArithmeticException("на нуль ділить не можна");
        } else if (a != 0 && c == 0) {
            throw new ArithmeticException("на нуль ділить не можна");
        } else if (a == 0 && c == 0) {
            throw new IllegalAccessException("Не можуть дорівнювати 0");
        } else if (a > 0 && c > 0) {
            throw new MyException("незнаю");
        }

        int result = a + c;
        System.out.println("Результат " + result);
    }
}
