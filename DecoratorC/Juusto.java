public class Juusto extends Paallysteenkoristelu {
    public Juusto(AgrininPizza pizza) {
        super(pizza);
    }

    @Override
    public String getKuvaus() {
        return pizza.getKuvaus() + ", Juusto";
    }

    @Override
    public double getHinta() {
        return pizza.getHinta() + 1.0;
    }
}
