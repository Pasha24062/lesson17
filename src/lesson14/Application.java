package lesson14;

import lesson12.Sizes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void menu() {
        int i = 0;
        Menu menus = new Menu();
        System.out.println("===MENU===");
        for (Coffe h : menus.getAvailableCoffee()) {
            System.out.println("======[+ (i+1) +]======");
            System.out.println(menus.getAvailableCoffee().get(i).getName());
            System.out.println("Ціна " + menus.getAvailableCoffee().get(i).getPrice());
            System.out.println("Доступні розміри " + menus.getAvailableCoffee().get(i).getSize());
            i++;
        }
    }

    public static void main(String[] args) {
        Order order = new Order();
        Scanner mainScanner = new Scanner(System.in);
        System.out.println("Введіть номер: ");
        String mainCode = mainScanner.next();
        switch (mainCode) {
            case "1" -> {
                System.out.println("Виберіть розмір: ");
                Scanner scanner = new Scanner(System.in);
                String sizeCaffeAmericano = scanner.next();
                switch (sizeCaffeAmericano) {
                    case "XL" -> {
                        order.createOrder(new Coffe("Americano", 2, List.of(Sizes.XL)));
                        System.out.println("Кава Americano розміру XL додана до вашого кошика");
                    }
                    case "L" -> {
                        order.createOrder(new Coffe("Americano", 2, List.of(Sizes.L)));
                        System.out.println("Кава Americano розміру L додана до вашого кошика");
                    }
                    case "M" -> {
                        order.createOrder(new Coffe("Americano", 2, List.of(Sizes.M)));
                        System.out.println("Кава Americano розміру M додана до вашого кошика");
                    }

                }
            }
            case "2" -> {
                System.out.println("Виберіть розмір: ");
                Scanner scanner = new Scanner(System.in);
                String sizeCaffeCapuchino = scanner.next();
                switch (sizeCaffeCapuchino) {
                    case "S" -> {
                        order.createOrder(new Coffe("Capuchino", 4, List.of(SizeCoffe.S)));
                        System.out.println("Кава Capuchino розміру S додана до вашого кошика");
                    }
                    case "L" -> {
                        order.createOrder(new Coffe("Capuchino", 4, List.of(Sizes.L)));
                        System.out.println("Кава Capuchino розміру L додана до вашого кошика");
                    }
                }
            }
            case "3" -> {
                System.out.println("Виберіть розмір: ");
                Scanner scanner = new Scanner(System.in);
                String sizeCaffeLatte = scanner.next();
                switch (sizeCaffeLatte) {
                    case "S" -> {
                        order.createOrder(new Coffe("Latte", 2, List.of(SizeCoffe.L)));
                    }
                    case "L" -> {
                        order.createOrder(new Coffe("Latte", 2, List.of(SizeCoffe.L)));
                        System.out.println("Кава Latte розміру L додана до  кошика");
                    }
                    case "M" -> {
                        order.createOrder(new Coffe("Latte", 2,List.of(SizeCoffe.M))));
                        System.out.println("Кава Latte розміру M додана до кошика");
                    }
                }
            }
            case "4" -> {
                int i = 0;
                int sum = order.getTotalPrice();
                System.out.println("===============Ваш список замовлень==================");
                for (Coffe c : order.getTotalList()) {
                    System.out.println(order.getTotalList().get(i).getName() + " розміром " + order.getTotalList().get(i).getSizes());
                    sum = order.getTotalList().get(1).getPrice() + sum;

                    i++;
                }
            }
        }
    }
}