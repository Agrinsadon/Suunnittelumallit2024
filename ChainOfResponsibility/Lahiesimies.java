public class Lahiesimies implements Palkankorotuspyynto {
    private static final double HYVAKSYNTA_RAJA = 0.02;
    private Palkankorotuspyynto seuraavaKasittelija;

    @Override
    public void kasittelePyynto(double pyyntoMaara) {
        if (pyyntoMaara <= HYVAKSYNTA_RAJA) {
            System.out.println("Lähiesimies hyväksyy palkankorotuspyynnön " + pyyntoMaara * 100 + "%");
        } else if (seuraavaKasittelija != null) {
            seuraavaKasittelija.kasittelePyynto(pyyntoMaara);
        }
    }

    @Override
    public void asetaSeuraavaKasittelija(Palkankorotuspyynto seuraavaKasittelija) {
        this.seuraavaKasittelija = seuraavaKasittelija;
    }
}
