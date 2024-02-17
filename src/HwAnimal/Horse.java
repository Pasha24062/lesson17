package HwAnimal;

public class Horse extends Animal {
    private String family;

    public Horse(String food, String location, String family) {
        super(food, location);
        this.family = family;
    }

    @Override
    public void makeNoise() {
        System.out.println("Кінь ірже");
    }
}
