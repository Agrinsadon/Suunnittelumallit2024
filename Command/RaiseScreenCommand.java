public class RaiseScreenCommand implements Command {
    private Screen screen;

    public RaiseScreenCommand(Screen screen) {
        this.screen = screen;
    }

    @Override
    public void execute() {
        screen.raise();
    }
}
