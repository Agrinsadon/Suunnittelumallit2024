import java.util.Random;
import java.util.Scanner;

public class Arvuuttaja {
    private final Random random = new Random();

    public ArvaajaMemento liityPeliin() {
        int arvottuLuku = random.nextInt(100);
        return new ArvaajaMemento(arvottuLuku);
    }

    public boolean arvaa(ArvaajaMemento memento, int arvaus) {
        return memento.getArvottuLuku() == arvaus;
    }
}
