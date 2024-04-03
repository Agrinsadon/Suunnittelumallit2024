package rakentajat;

import java.util.ArrayList;
import osat.Osat;
import hampurilaiset.Hampurilainen;
import hampurilaiset.Hesburger;

public class HesburgerinRakentaja implements HampurilaisenRakentaja {
    private ArrayList<Osat> osat = new ArrayList<>();

    public void lisaaOsa(Osat osa) {
        osat.add(osa);
    }

    public Hampurilainen haeHampurilainen() {
        return new Hesburger(osat);
    }
}
