public class PohjatietokoneMain {

    public static void main(String[] args) {
        Muistipiiri muistipiiri = new Muistipiiri(50);
        Emolevy emolevy = new Emolevy(150);
        Prosessori prosessori = new Prosessori(250);
        Verkkokortti verkkokortti = new Verkkokortti(100);
        Naytinohjain naytinohjain = new Naytinohjain(200);
        Kotelo kotelo = new Kotelo(400);

        kotelo.lisaaOsa(muistipiiri);
        kotelo.lisaaOsa(emolevy);
        kotelo.lisaaOsa(prosessori);
        kotelo.lisaaOsa(verkkokortti);
        kotelo.lisaaOsa(naytinohjain);

        double hinta = kotelo.getHinta();

        System.out.println("Kokonpanon hinta: " + hinta);
    }
}
