public class JasperMain {
    private VaateTehdas tehdas;

    public JasperMain(VaateTehdas tehdas) {
        this.tehdas = tehdas;
    }

    public void vaihdaTehdas(VaateTehdas uusiTehdas) {
        this.tehdas = uusiTehdas;
    }

    public void puePaalle() {
        Vaate farmarit = tehdas.luoFarmarit();
        Vaate tPaita = tehdas.luoTPaita();
        Vaate lippis = tehdas.luoLippis();
        Vaate kengat = tehdas.luoKengat();

        System.out.println("Jasperilla on päällään:");
        System.out.println(farmarit);
        System.out.println(tPaita);
        System.out.println(lippis);
        System.out.println(kengat);
    }

    public static void main(String[] args) {
        JasperMain jasper = new JasperMain(new AdidasTehdas());
        jasper.puePaalle();

        jasper.vaihdaTehdas(new BossTehdas());

        jasper.puePaalle();
    }
}
