package lesson12;

public class Tie extends Clothes implements MaleClothes{
    public Tie(Sizes size, String color, int price) {
        super(size, color, price);
    }

    @Override
    public String toString() {
        return "Tie{} " + super.toString();
    }
}
