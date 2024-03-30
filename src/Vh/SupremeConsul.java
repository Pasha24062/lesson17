package Vh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class SupremeConsul {
    private static SupremeConsul instance = new SupremeConsul();

    private SupremeConsul() {
    }

    public static SupremeConsul getInstance() {
        if (instance == null) {
            instance = new SupremeConsul();
        }
        return instance;
    }

    List<Faction> list = new ArrayList<>();

    public void clearFaction() {
        System.out.println("Введіть назву фракції");
        Scanner scanner = new Scanner(System.in);
        String nameOfFaction = scanner.next();
        for (Faction a : list) {
            if (nameOfFaction.equalsIgnoreCase(a.getFactionName())) {
                a.clearAllDeputy();
            }
        }
    }

    public void allFaction() {
        for (Faction a : list) {
            System.out.println(a.getFactionName());
        }
    }

    public void addFaction() {
        System.out.println("Введіть назву фракції");
        Scanner scanner = new Scanner(System.in);
        String nameFaction = scanner.next();
        Faction faction = new Faction(nameFaction);
        list.add(faction);
        System.out.println("Фракція" + nameFaction + "cтворена");
    }

    public void removeDeputy() {
        System.out.println("Введіть назву фракції");
        Scanner scanner = new Scanner(System.in);
        String nameFaction = scanner.next();
        for (Faction a : list) {
            if (nameFaction.equalsIgnoreCase(a.getFactionName())) {
                a.removeDeputy();
            }
        }
    }

    public void infoFaction() {
        System.out.println("Введіть назву фракції");
        Scanner scanner = new Scanner(System.in);
        String nameFaction = scanner.next();
        for (Faction a : list) {
            if (nameFaction.equalsIgnoreCase(a.getFactionName())) {

            }
        }
    }

    public void addDeputyToFaction() {
        System.out.println("Введіть назву фракції");
        Scanner scanner = new Scanner(System.in);
        String nameFaction = scanner.next();
        for (Faction a : list) {
            if (nameFaction.equalsIgnoreCase(a.getFactionName())) {
                a.addDeputy();
            }
        }
    }

    public void allBriberOfFaction() {
        System.out.println("Введіть назву фракції");
        Scanner scanner = new Scanner(System.in);
        String nameFaction = scanner.next();
        for (Faction a : list) {
            if (nameFaction.equalsIgnoreCase(a.getFactionName())) {
                a.getBriber();
            }
        }
    }

    public void topBribersOfFaction() {
        System.out.println("Введіть назву фракції");
        Scanner scanner = new Scanner(System.in);
        String nameFaction = scanner.next();
        for (Faction a : list) {
            if (nameFaction.equalsIgnoreCase(a.getFactionName())) {
                a.getBigestBriber();
            }
        }
    }

    public void removeFaction() {
        System.out.println("Введіть назву фракції яку видалимо");
        Scanner scanner = new Scanner(System.in);
        String nameFaction = scanner.next();
        Iterator<Faction> iterator = list.iterator();
        while (iterator.hasNext()) {
            Faction nextFaction = iterator.next();
            if (nameFaction.equalsIgnoreCase(nextFaction.getFactionName())) {
            }
        }
    }
}
