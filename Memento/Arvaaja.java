import java.util.Random;

public class Arvaaja extends Thread {
    private final Arvuuttaja arvuuttaja;
    private final int arvaajanNumero;

    public Arvaaja(Arvuuttaja arvuuttaja, int arvaajanNumero) {
        this.arvuuttaja = arvuuttaja;
        this.arvaajanNumero = arvaajanNumero;
    }

    @Override
    public void run() {
        ArvaajaMemento memento = arvuuttaja.liityPeliin();

        for (int i = 0; i < 10; i++) {
            int arvaus = randomArvaus();
            boolean oikein = arvuuttaja.arvaa(memento, arvaus);

            if (oikein) {
                System.out.println("Arvaaja " + arvaajanNumero + " arvasi numeron " + arvaus + " ja se on oikein!");
                break;
            } else {
                System.out.println("Arvaaja " + arvaajanNumero + " arvasi numeron " + arvaus + " ja se on väärin!");
            }
        }
    }

    private int randomArvaus() {
        return new Random().nextInt(100);
    }
}
