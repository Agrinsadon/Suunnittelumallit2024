public class PokemonMain {
    public static void main(String[] args) {
        Pokemon charmander = new Pokemon();

        for (int i = 1; i <= 3; i++) {
            System.out.println("Tilanne " + i + " :");
            charmander.performAction();
            charmander.evolve();
            System.out.println(" ");
        }
    }
}
