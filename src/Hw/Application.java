package Hw;

import static Hw.Methods.add;

public class Application {
    public static void main(String[] args) {
        try {
            add(8,16);
        }catch (IllegalArgumentException | ArithmeticException | MyException | IllegalAccessException e){
            System.out.println("Помилка;" + e.getMessage());
        }
    }
}
