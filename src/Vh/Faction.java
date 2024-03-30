package Vh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Faction {
    List<Deputy> list = new ArrayList<>();

    public Faction(String nameFaction) {
    }

    public void addDeputy() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть ім'я депутата:");
        String nameDeputy = scanner.next();

        System.out.println("Введіть прізвище депутата:");
        String lastNameDeputy = scanner.next();

        System.out.println("Введіть вік депутата:");
        int ageDeputy = scanner.nextInt();

        System.out.println("Депутат є хабарником:");
        boolean bribe = scanner.nextBoolean();

        System.out.println("Яка вага у депутата");
        int weightDeputy = scanner.nextInt();

        System.out.println("Яка висота у депутата");
        int heightDeputy = scanner.nextInt();

        Deputy deputy = new Deputy(weightDeputy, heightDeputy, lastNameDeputy, nameDeputy, ageDeputy, bribe);
        if (bribe) {
            deputy.giveBribe();
        }
        list.add(deputy);
    }

    public void removeDeputy() {
        System.out.println("Введіть ім'я депутата якого хочете видалити");
        Scanner sRemoveDeputy = new Scanner(System.in);
        String removeDeputys = sRemoveDeputy.next();
        Iterator<Deputy> iterator = list.iterator();
        while (iterator.hasNext()) {
            Deputy d = iterator.next();
            if (removeDeputys.equalsIgnoreCase(d.getName())) {
                iterator.remove();
            }
        }
    }

    public void getBriber() {
        for (Deputy d : list) {
            if (d.isBribe()) {
                System.out.println(d.getLastName() + "" + d.getName() + "вік" + d.getAge() + "років" + "сумарно взяв хабарів na " + d.getSizeOfBribe());
            }
        }
    }

    public void clearAllDeputy() {
        list.clear();
        System.out.println("Всіх видалено");
    }
    public void getBigestBriber(){
        Deputy deputy = new Deputy();
        for (Deputy d : list){
            if(deputy.getSizeOfBribe() <= d.getSizeOfBribe()){
                deputy = d;
            }
        }
        System.out.println(deputy);
    }
    public String getFactionName(){
        return null;
    }
}




