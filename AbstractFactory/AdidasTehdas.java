public class AdidasTehdas implements VaateTehdas {
    @Override
    public Vaate luoFarmarit() {
        return new VaateKappale("Adidas farmari");
    }

    @Override
    public Vaate luoTPaita() {
        return new VaateKappale("Adidas t-paita");
    }

    @Override
    public Vaate luoLippis() {
        return new VaateKappale("Adidas lippis");
    }

    @Override
    public Vaate luoKengat() {
        return new VaateKappale("Adidas kengät");
    }
}
