public class VaateKappale implements Vaate {
    private String merkki;

    public VaateKappale(String merkki) {
        this.merkki = merkki;
    }

    @Override
    public String toString() {
        return merkki + " " + this.getClass().getSimpleName();
    }
}
