import java.util.ArrayList;
import java.util.List;

public class Emolevy implements Laiteosa {

    private double omaHinta;
    private List<Laiteosa> osat;

    public Emolevy(double omaHinta) {
        this.omaHinta = omaHinta;
        this.osat = new ArrayList<>();
    }

    public void lisaaOsa(Laiteosa osa) {
        osat.add(osa);
    }

    @Override
    public double getHinta() {
        return omaHinta + osat.stream().mapToDouble(Laiteosa::getHinta).sum();
    }
}
