package lesson14;

public enum SizeCoffe {
    S(150),
    M(250),
    L(350),
    XL(450);

    private final int volume;

    SizeCoffe(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

}
