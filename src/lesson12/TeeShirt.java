package lesson12;

public class TeeShirt extends Clothes implements MaleClothes, FemaleClothes{
    public TeeShirt(Sizes size, String color, int price) {
        super(size, color, price);
    }

    @Override
    public void dressMale() {
        MaleClothes.super.dressMale();
    }
}
