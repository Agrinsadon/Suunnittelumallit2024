public class Kebab extends Paallysteenkoristelu {
    public Kebab(AgrininPizza pizza) {
        super(pizza);
    }

    @Override
    public String getKuvaus() {
        return pizza.getKuvaus() + ", Kebab";
    }

    @Override
    public double getHinta() {
        return pizza.getHinta() + 3.0;
    }
}
