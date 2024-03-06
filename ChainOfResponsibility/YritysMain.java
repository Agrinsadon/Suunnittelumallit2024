public class YritysMain {
    public static void main(String[] args) {
        Palkankorotuspyynto lahiesimies = new Lahiesimies();
        Palkankorotuspyynto yksikonPaallikko = new YksikonPaallikko();
        Palkankorotuspyynto toimitusjohtaja = new Toimitusjohtaja();

        lahiesimies.asetaSeuraavaKasittelija(yksikonPaallikko);
        yksikonPaallikko.asetaSeuraavaKasittelija(toimitusjohtaja);

        double pyyntoMaara1 = 0.015; // Lähiesimies hyväksyy
        double pyyntoMaara2 = 0.03;  // Yksikön päällikkö ohjaa toimitusjohtajalle
        double pyyntoMaara3 = 0.06;  // Toimitusjohtaja käsittelee

        lahiesimies.kasittelePyynto(pyyntoMaara1);
        lahiesimies.kasittelePyynto(pyyntoMaara2);
        lahiesimies.kasittelePyynto(pyyntoMaara3);
    }
}
