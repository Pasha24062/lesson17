package lesson12;

public class DressMakingStudio {
    public void dressMale(Clothes[] clothes){
        System.out.println("Чоловічий одяг:");
        for (Clothes c:clothes){
            if (c instanceof MaleClothes){
                System.out.println(c);
            }
        }
    }
    public void dressFeMale(Clothes[] clothes){
        System.out.println("Жіночий одяг");
        for (Clothes c:clothes){
            if (c instanceof FemaleClothes){
                System.out.println(c);
            }
        }
    }
}
