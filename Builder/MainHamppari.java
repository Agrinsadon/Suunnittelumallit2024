import rakentajat.HampurilaisenRakentaja;
import rakentajat.HesburgerinRakentaja;
import rakentajat.McDonaldsinRakentaja;
import hampurilaiset.Hampurilainen;
import kokit.HampurilaisenKokki;

public class MainHamppari {
    public static void main(String[] args) {
        kokit.HampurilaisenKokki kokki = new kokit.HampurilaisenKokki();

        rakentajat.HampurilaisenRakentaja hesburgerinRakentaja = new rakentajat.HesburgerinRakentaja();
        kokki.rakennaYksinkertainenHampurilainen(hesburgerinRakentaja);
        hampurilaiset.Hampurilainen hesburger = hesburgerinRakentaja.haeHampurilainen();
        System.out.println(hesburger.kuvaus());

        rakentajat.HampurilaisenRakentaja mcdonaldsinRakentaja = new rakentajat.McDonaldsinRakentaja();
        kokki.rakennaDeluxeHampurilainen(mcdonaldsinRakentaja);
        hampurilaiset.Hampurilainen mcdonaldsHampurilainen = mcdonaldsinRakentaja.haeHampurilainen();
        System.out.println(mcdonaldsHampurilainen.kuvaus());
    }
}
