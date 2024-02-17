package lesson12;

import lesson12.Clothes;
import lesson12.FemaleClothes;

public class Skirt extends Clothes implements FemaleClothes {
    public Skirt(Sizes size, String color, int price) {
        super(size, color, price);
    }

    @Override
    public String toString() {
        return "Skirt{} " + super.toString();
    }
}
