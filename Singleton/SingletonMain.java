public class SingletonMain {
    public static void main(String[] args) {
        Nyrkkeilyottelu ottelu = new Nyrkkeilyottelu();
        ottelu.suoritaOttelu();

        Pisteidenlasku pisteidenlasku = Pisteidenlasku.getInstance();
        System.out.println("Ottelun kokonaispisteet: " + pisteidenlasku.getKokonaispisteet());
    }
}
