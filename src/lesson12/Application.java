package lesson12;

public class Application {
    public static void main(String[] args) {
        Clothes[] clothes ={
                new TeeShirt(Sizes.XL,"black",499),
                new TeeShirt(Sizes.S,"pink",999),
                new Skirt(Sizes.M,"white", 1999),
                new Skirt(Sizes.L,"blue",1234),
                new Tie(Sizes.S,"black",129)
        };
        DressMakingStudio dressMakingStudio = new DressMakingStudio();
        dressMakingStudio.dressFeMale(clothes);
        System.out.println("--------------");
        dressMakingStudio.dressMale(clothes);
        Skirt skirt = new Skirt(clothes);
    }

}

