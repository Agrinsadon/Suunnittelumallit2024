public class Toimitusjohtaja implements Palkankorotuspyynto {
    @Override
    public void kasittelePyynto(double pyyntoMaara) {
        System.out.println("Toimitusjohtaja käsittelee palkankorotuspyynnön " + pyyntoMaara * 100 + "%");
    }

    @Override
    public void asetaSeuraavaKasittelija(Palkankorotuspyynto seuraavaKasittelija) {
    }
}
