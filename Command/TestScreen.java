public class TestScreen {
    public static void main(String[] args) {
        Screen screen = new Screen();
        Command raiseCommand = new RaiseScreenCommand(screen);
        Command lowerCommand = new LowerScreenCommand(screen);
        Command toggleCommand = new ToggleScreenCommand(screen);

        WallButton raiseButton = new WallButton(raiseCommand);
        WallButton lowerButton = new WallButton(lowerCommand);
        WallButton toggleButton = new WallButton(toggleCommand);

        raiseButton.push();
        lowerButton.push();
        toggleButton.push();
        toggleButton.push();
        toggleButton.push();
    }
}
