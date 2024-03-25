// Main.java
public class MainVisitor {
    public static void main(String[] args) {
        Character character1 = new Character(new State1());
        Character character2 = new Character(new State2());

        BonusVisitor bonusVisitor = new ConcreteBonusVisitor();

        character1.accept(bonusVisitor);
        character2.accept(bonusVisitor);
    }
}
