package Hw;

public class Methods {
    public static void add(int a, int c) throws IllegalArgumentException, ArithmeticException, MyException, IllegalAccessException {
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
    }

    public int myltiply(int a, int c) {
        int result = a * c;
        return result;
    }

    public double dvidie(int a, int c) {
        if (a < 0 && c < 0) {
            throw new IllegalArgumentException("відємні числа");
        } else if (a == 0 && c != 0) {
            throw new ArithmeticException("ділення на нуль");
        } else if (a != 0 && c == 0) {
            throw new ArithmeticException("ділення на нуль");
        }
        int result = a / c;
        return result;
    }

    public static int subtract(int a, int c) {
        int result = a - c;
        return result;
    }
}
