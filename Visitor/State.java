public interface State {
    void accept(BonusVisitor visitor);
}

class State1 implements State {
    @Override
    public void accept(BonusVisitor visitor) {
        visitor.visit(this);
    }
}

class State2 implements State {
    @Override
    public void accept(BonusVisitor visitor) {
        visitor.visit(this);
    }
}