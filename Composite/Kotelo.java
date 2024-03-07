import java.util.ArrayList;
import java.util.List;

public class Kotelo implements Laiteosa {

    private double omaHinta;
    private List<Laiteosa> osat;

    public Kotelo(double omaHinta) {
        this.omaHinta = omaHinta;
        this.osat = new ArrayList<>();
    }

    public void lisaaOsa(Laiteosa osa) {
        osat.add(osa);
    }

    public void poistaOsa(Laiteosa osa) {
        osat.remove(osa);
    }

    @Override
    public double getHinta() {
        return omaHinta + osat.stream().mapToDouble(Laiteosa::getHinta).sum();
    }
}
