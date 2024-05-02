public class LowerScreenCommand implements Command {
    private Screen screen;

    public LowerScreenCommand(Screen screen) {
        this.screen = screen;
    }

    @Override
    public void execute() {
        screen.lower();
    }
}
