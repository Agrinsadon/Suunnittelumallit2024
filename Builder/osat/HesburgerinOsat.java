package osat;

public class HesburgerinOsat implements Osat {
    private String nimi;

    public HesburgerinOsat(String nimi) {
        this.nimi = nimi;
    }

    public String nimi() {
        return this.nimi;
    }
}
