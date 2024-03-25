public class ConcreteBonusVisitor implements BonusVisitor {
    @Override
    public void visit(State1 state) {
        System.out.println("Bonus points awarded for State1");
    }

    @Override
    public void visit(State2 state) {
        System.out.println("Bonus points awarded for State2");
    }
}
