import java.util.Scanner;

public class ArvausPeliMain {
    public static void main(String[] args) {
        Arvuuttaja arvuuttaja = new Arvuuttaja();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Montako arvaajaa haluat lisätä peliin? ");
        int arvaajienMaara = scanner.nextInt();

        for (int i = 1; i <= arvaajienMaara; i++) {
            Arvaaja arvaaja = new Arvaaja(arvuuttaja, i);
            arvaaja.start();
        }

        scanner.close();
    }
}
