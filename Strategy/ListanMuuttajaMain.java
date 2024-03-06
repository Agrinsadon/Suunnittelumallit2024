import java.util.List;

public class ListanMuuttajaMain {
    private ListanMuuttaja strategia;

    public ListanMuuttajaMain(ListanMuuttaja strategia) {
        this.strategia = strategia;
    }

    public void asetaStrategia(ListanMuuttaja strategia) {
        this.strategia = strategia;
    }

    public String suoritaStrategia(List<String> lista) {
        return strategia.muunnaListaMerkkijonoksi(lista);
    }

    public static void main(String[] args) {
        List<String> syoteLista = List.of("A", "B", "C", "D", "E", "F", "G", "H", "I", "J");

        ListanMuuttajaMain konteksti = new ListanMuuttajaMain(new Strategia1());
        System.out.println("Strategia 1:");
        System.out.println(konteksti.suoritaStrategia(syoteLista));

        konteksti.asetaStrategia(new Strategia2());
        System.out.println("Strategia 2:");
        System.out.println(konteksti.suoritaStrategia(syoteLista));

        konteksti.asetaStrategia(new Strategia3());
        System.out.println("Strategia 3:");
        System.out.println(konteksti.suoritaStrategia(syoteLista));
    }
}
