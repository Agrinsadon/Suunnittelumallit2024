public class Feta extends Paallysteenkoristelu {
    public Feta(AgrininPizza pizza) {
        super(pizza);
    }

    @Override
    public String getKuvaus() {
        return pizza.getKuvaus() + ", Feta";
    }

    @Override
    public double getHinta() {
        return pizza.getHinta() + 1.0;
    }
}
