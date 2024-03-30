package Vh;


import java.util.Scanner;

public class Deputy extends Man {
    private String lastName;
    private String name;
    private int age;
    private boolean bribe;
    private int sizeOfBribe;

    public Deputy(int weight, int height, String lastName, String name, int age, boolean bribe) {
        super(weight, height);
        this.lastName = lastName;
        this.name = name;
        this.age = age;
        this.bribe = bribe;
    }

    public Deputy() {
    }

    public int getSizeOfBribe() {
        return sizeOfBribe;
    }

    public void setSizeOfBribe(int sizeOfBribe) {
        this.sizeOfBribe = sizeOfBribe;
    }

    public void giveBribe() {
        if (!bribe) {
            System.out.println("Цей депутат норм чувак");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введіть розмір хабара:");
            int bribe = scanner.nextInt();
            if (bribe >= 5000) {
                System.out.println("то депупат поїде далеко й надовго");
            } else {
                setSizeOfBribe(bribe);
            }
        }
    }

    public Deputy(int weight, int height) {
        super(weight, height);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getBribe() {
        return bribe;
    }

    public void setBribe(boolean bribe) {
        this.bribe = bribe;
    }

    @Override
    public String toString() {
        return "Deputy{" +
                "firstName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", bribe=" + bribe +
                "} " + super.toString();
    }

    public void remove(Deputy d) {
    }

    public boolean isBribe() {
        return false;
    }

    public void clear() {
    }
}
