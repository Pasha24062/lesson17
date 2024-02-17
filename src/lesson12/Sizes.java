package lesson12;

public enum Sizes {
    XS(38),S(40),M(42),L(44),XL(46);
    private int euroSize;

    Sizes(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }
}
