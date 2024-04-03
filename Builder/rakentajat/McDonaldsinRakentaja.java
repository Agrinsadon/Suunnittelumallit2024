package rakentajat;

import osat.Osat;
import hampurilaiset.Hampurilainen;
import hampurilaiset.McDonalds;

public class McDonaldsinRakentaja implements HampurilaisenRakentaja {
    private StringBuilder osat = new StringBuilder();

    public void lisaaOsa(Osat osa) {
        osat.append(osa.nimi()).append(", ");
    }

    public Hampurilainen haeHampurilainen() {
        return new McDonalds(osat.toString());
    }
}
