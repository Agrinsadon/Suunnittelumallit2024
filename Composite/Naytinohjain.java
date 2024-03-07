public class Naytinohjain implements Laiteosa {

    private double hinta;

    public Naytinohjain(double hinta) {
        this.hinta = hinta;
    }

    @Override
    public double getHinta() {
        return hinta;
    }
}
