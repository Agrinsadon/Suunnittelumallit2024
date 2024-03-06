public class YksikonPaallikko implements Palkankorotuspyynto {
    private static final double ALARAJA = 0.02;
    private static final double YLARAJA = 0.05;
    private Palkankorotuspyynto seuraavaKasittelija;

    @Override
    public void kasittelePyynto(double pyyntoMaara) {
        if (pyyntoMaara > ALARAJA && pyyntoMaara <= YLARAJA) {
            System.out.println("Yksikön päällikkö ohjaa palkankorotuspyynnön toimitusjohtajalle " + pyyntoMaara * 100 + "%");
        } else if (seuraavaKasittelija != null) {
            seuraavaKasittelija.kasittelePyynto(pyyntoMaara);
        }
    }

    @Override
    public void asetaSeuraavaKasittelija(Palkankorotuspyynto seuraavaKasittelija) {
        this.seuraavaKasittelija = seuraavaKasittelija;
    }
}
