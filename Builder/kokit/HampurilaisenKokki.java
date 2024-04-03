package kokit;

import rakentajat.HampurilaisenRakentaja;
import osat.HesburgerinOsat;
import osat.McDonaldsinOsat;

public class HampurilaisenKokki {
    public void rakennaYksinkertainenHampurilainen(HampurilaisenRakentaja rakentaja) {
        rakentaja.lisaaOsa(new HesburgerinOsat("Pihvi"));
        rakentaja.lisaaOsa(new HesburgerinOsat("Salaatti"));
        rakentaja.lisaaOsa(new HesburgerinOsat("Tomaatti"));
        rakentaja.lisaaOsa(new HesburgerinOsat("Majoneesi"));
    }

    public void rakennaDeluxeHampurilainen(HampurilaisenRakentaja rakentaja) {
        rakentaja.lisaaOsa(new McDonaldsinOsat("McFeast sämpylä"));
        rakentaja.lisaaOsa(new McDonaldsinOsat("Pihvi"));
        rakentaja.lisaaOsa(new McDonaldsinOsat("Special Sauce"));
        rakentaja.lisaaOsa(new McDonaldsinOsat("Salaatti"));
        rakentaja.lisaaOsa(new McDonaldsinOsat("Juusto"));
        rakentaja.lisaaOsa(new McDonaldsinOsat("Pikkelssi"));
        rakentaja.lisaaOsa(new McDonaldsinOsat("Sipuli"));
    }
}
