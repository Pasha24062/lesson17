package HwAnimal;

public class Cat extends Animal{
    private int age;

    public Cat(String food, String location, int age) {
        super(food, location);
        this.age = age;
    }

    @Override
    public void makeNoise() {
        System.out.println("Кіт нявкає");
    }
}
