import java.util.Random;

public class Arvuuttaja {
    private final Random random = new Random();
    private ArvausMemento memento;

    public Arvuuttaja() {
        liityPeliin();
    }

    public void liityPeliin() {
        int arvottuLuku = random.nextInt(20);
        memento = new ArvausMemento(arvottuLuku);
    }

    public boolean arvaa(int arvaus) {
        int arvottuLuku = memento.getArvottuLuku();
        return arvaus == arvottuLuku;
    }
}
