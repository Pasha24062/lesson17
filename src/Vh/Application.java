package Vh;

import java.util.Scanner;

import static lesson14.Application.menu;

public class Application {
    public static void menu() {
        System.out.println();
        System.out.println("Введіть 1, щоб додати фракцію до Верховної Ради");
        System.out.println("Введіть 2, щоб видалити фракцію з Верховної Ради");
        System.out.println("Введіть 3, щоб вивести всі фракції у Верховній Раді");
        System.out.println("Введіть 4, щоб очистити введену фракцію");
        System.out.println("Введіть 5, щоб вивести введену фракцію");
        System.out.println("Введіть 6, щоб додати депутата до фракції");
        System.out.println("Введіть 7, щоб видалити депутата з фракції");
        System.out.println("Введіть 8, щоб вивести список хабарників");
        System.out.println("Введіть 9, щоб вивести найбільшого хабарника");
    }

    public static void main(String[] args) {
        while (true) {
            menu();
            System.out.println("введіть номер");
            String mainCode = mainScanner.next();
            switch (mainCode) {
                case "1" -> {
                    SupremeConsul.getInstance().addDeputyToFaction();
                }
                case "2" -> {
                    SupremeConsul.getInstance().removeFaction();
                }
                case "3" -> {
                    SupremeConsul.getInstance().allFaction();
                }
                case "4" -> {
                    SupremeConsul.getInstance().clearFaction();
                }
                case "5" -> {
                    SupremeConsul.getInstance().infoFaction();
                }
                case "6" -> {
                    SupremeConsul.getInstance().addDeputyToFaction();
                }
                case "7" -> {
                    SupremeConsul.getInstance().removeDeputy();
                }
                case "8" -> {
                    SupremeConsul.getInstance().allBriberOfFaction();
                }
                case "9" -> {
                    SupremeConsul.getInstance().topBribersOfFaction();
                }
            }
        }
    }
}
