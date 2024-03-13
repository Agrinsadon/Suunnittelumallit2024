import java.util.Scanner;

public class ArvausPeliMain {
    public static void main(String[] args) {
        Arvuuttaja arvuuttaja = new Arvuuttaja();
        System.out.println("Sinulla on 5 arvausta, arvaaa 0-19 väliltä. Onnea peliin!");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            int arvaus = promptArvaus(scanner);
            boolean oikein = arvuuttaja.arvaa(arvaus);

            if (oikein) {
                System.out.println("Oikein arvattu!");
                break;
            } else {
                System.out.println("Väärin arvattu. Yritä uudelleen.");
            }
        }

        scanner.close();
    }

    private static int promptArvaus(Scanner scanner) {
        System.out.print("Arvaa luku: ");
        return scanner.nextInt();
    }
}
