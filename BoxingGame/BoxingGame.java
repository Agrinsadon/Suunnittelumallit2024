import java.util.Random;

class BoxingGame extends Game {

    private String[] fighters = {"Mike Tyson", "Muhammad Ali"};
    private int[] health = {100, 100};
    private Random random = new Random();

    void StartMatch() {
        System.out.println("Let the match begin!");
    }

    void StatusOfMatch(int fighter) {
        int opponent = (fighter + 1) % fightersCount;
        int punchPower = random.nextInt(20) + 1;
        health[opponent] -= punchPower;
        System.out.println(fighters[fighter] + " throws a punch with power " + punchPower);
        System.out.println("Health remaining for " + fighters[opponent] + ": " + health[opponent]);
        System.out.println(" ");
    }

    boolean endOfMatch() {
        return health[0] <= 0 || health[1] <= 0;
    }

    void printWinner() {
        if (health[0] <= 0 && health[1] <= 0) {
            System.out.println("It's a draw!");
        } else {
            int winner = (health[0] <= 0) ? 1 : 0;
            System.out.println(fighters[winner] + " wins the boxing match!");
        }
    }
}