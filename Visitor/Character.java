public class Character {
    private State state;

    public Character(State state) {
        this.state = state;
    }

    public void accept(BonusVisitor visitor) {
        state.accept(visitor);
    }
}
