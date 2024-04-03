package hampurilaiset;

import java.util.ArrayList;
import osat.Osat;

public class Hesburger implements Hampurilainen {
    private ArrayList<Osat> osat;

    public Hesburger(ArrayList<Osat> osat) {
        this.osat = osat;
    }

    public String kuvaus() {
        StringBuilder kuvaus = new StringBuilder("Hesburgerin hampurilainen, jossa on: ");
        for (Osat osa : osat) {
            kuvaus.append(osa.nimi()).append(", ");
        }
        return kuvaus.toString();
    }
}
