import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // a) Iteroidaan kokoelmaa kahdella säikeellä yhtä aikaa
        new Thread(() -> {
            synchronized(list) {
                Iterator<Integer> iterator = list.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }
            }
        }).start();

        new Thread(() -> {
            synchronized(list) {
                Iterator<Integer> iterator = list.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }
            }
        }).start();

        // b) Iteroidaan kokoelmaa kahdella säikeellä vuorotellen
        synchronized(list) {
            Iterator<Integer> iterator1 = list.iterator();
            Iterator<Integer> iterator2 = list.iterator();
            while (iterator1.hasNext()) {
                System.out.println(iterator1.next());
                if (iterator2.hasNext()) {
                    System.out.println(iterator2.next());
                }
            }
        }

        // c) Kokoelmaan tehdään muutoksia iteroinnin läpikäynnin aikana
        try {
            synchronized(list) {
                Iterator<Integer> iterator3 = list.iterator();
                while (iterator3.hasNext()) {
                    Integer element = iterator3.next();
                    System.out.println(element);
                    if (element == 2) {
                        iterator3.remove(); // Poistaa elementin iteraation aikana
                    }
                }
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("ConcurrentModificationException: Muutoksia tehtiin iteroinnin aikana");
        }

        // d) Testataan iteraattorin remove ja forEachRemaining
        synchronized(list) {
            Iterator<Integer> iterator4 = list.iterator();
            while (iterator4.hasNext()) {
                Integer element = iterator4.next();
                if (element == 1) {
                    iterator4.remove(); // Poistetaan elementti iteraation aikana
                }
            }
        }

        synchronized(list) {
            // Käytetään forEachRemaining jäljellä olevien elementtien käsittelyyn
            Iterator<Integer> iterator5 = list.iterator();
            iterator5.forEachRemaining(System.out::println);
        }
    }
}
