package HwAnimal;

public abstract class Animal {
    String food;
    String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }
    public abstract void makeNoise();
    public void eat(){
        System.out.println("Тварина їсть" + food);
    }
    public void sleep(){
        System.out.println("Тварина спить");
    }
}
