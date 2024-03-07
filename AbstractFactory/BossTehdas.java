public class BossTehdas implements VaateTehdas {
    @Override
    public Vaate luoFarmarit() {
        return new VaateKappale("Boss farmari");
    }

    @Override
    public Vaate luoTPaita() {
        return new VaateKappale("Boss t-paita");
    }

    @Override
    public Vaate luoLippis() {
        return new VaateKappale("Boss lippis");
    }

    @Override
    public Vaate luoKengat() {
        return new VaateKappale("Boss kengät");
    }
}
