public class Pisteidenlasku {
    private static Pisteidenlasku instance;
    private int kokonaispisteet;

    private Pisteidenlasku() {
        kokonaispisteet = 0;
    }

    public static Pisteidenlasku getInstance() {
        if (instance == null) {
            instance = new Pisteidenlasku();
        }
        return instance;
    }

    public void lisaaPisteet(int pisteet) {
        System.out.println("Lisättiin pisteet: " + pisteet);
        kokonaispisteet += pisteet;
        System.out.println("Kokonaispisteet nyt: " + kokonaispisteet);
        // Voitaisiin lisätä lisää toiminnallisuutta tarpeen mukaan
    }

    public int getKokonaispisteet() {
        return kokonaispisteet;
    }
}
