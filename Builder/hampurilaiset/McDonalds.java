package hampurilaiset;

public class McDonalds implements Hampurilainen {
    private String osat;

    public McDonalds(String osat) {
        this.osat = osat;
    }

    public String kuvaus() {
        return "McDonald'sin hampurilainen, jossa on: " + osat;
    }
}
