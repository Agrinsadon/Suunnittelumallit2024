public abstract class Paallysteenkoristelu implements AgrininPizza {
    protected AgrininPizza pizza;

    public Paallysteenkoristelu(AgrininPizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getKuvaus() {
        return pizza.getKuvaus();
    }

    @Override
    public double getHinta() {
        return pizza.getHinta();
    }
}
