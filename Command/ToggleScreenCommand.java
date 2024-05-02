public class ToggleScreenCommand implements Command {
    private Screen screen;

    public ToggleScreenCommand(Screen screen) {
        this.screen = screen;
    }

    @Override
    public void execute() {
        screen.toggle();
    }
}
