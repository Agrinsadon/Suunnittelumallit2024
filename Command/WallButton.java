public class WallButton {
    private Command cmd;

    public WallButton(Command cmd) {
        this.cmd = cmd;
    }

    public void push() {
        cmd.execute();
    }
}
