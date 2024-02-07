public class Nyrkkeilyottelu {
    public void suoritaOttelu() {
        Pisteidenlasku pisteidenlasku = Pisteidenlasku.getInstance();

        // Simuloidaan nyrkkeilyottelua ja lisätään pisteitä
        pisteidenlasku.lisaaPisteet(1);
        pisteidenlasku.lisaaPisteet(2);
        pisteidenlasku.lisaaPisteet(1);
    }
}
