public class Pokemon {
    private PokemonTila currentState;

    public Pokemon() {
        currentState = new CharmanderTila();
    }

    public void evolve() {
        if (currentState instanceof CharmanderTila) {
            System.out.println("Charmander kehittyy Charmeleoniksi!");
            currentState = new CharmeleonTila();
        } else if (currentState instanceof CharmeleonTila) {
            System.out.println("Charmeleon kehittyy Charizardiksi!");
            currentState = new CharizardTila();
        } else if (currentState instanceof CharizardTila) {
            System.out.println("Charizard ei voi enää kehittyä!");
        }
    }

    public void performAction() {
        currentState.suoritaToiminta();
    }
}
