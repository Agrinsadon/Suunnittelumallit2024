abstract class Game {

    protected int fightersCount;

    abstract void StartMatch();

    abstract void StatusOfMatch(int player);

    abstract boolean endOfMatch();

    abstract void printWinner();

    public final void PlayOneMatch(int fightersCount) {
        this.fightersCount = fightersCount;
        StartMatch();
        int x = 0;
        while (!endOfMatch()){
            StatusOfMatch(x);
            x = (x + 1) % fightersCount;
        }
        printWinner();
    }
}