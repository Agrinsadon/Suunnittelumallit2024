public class Screen {
    private boolean isUp = false;

    public void raise() {
        if (!isUp) {
            System.out.println("Screen is raised.");
            isUp = true;
        } else {
            System.out.println("Screen is already raised.");
        }
    }

    public void lower() {
        if (isUp) {
            System.out.println("Screen is lowered.");
            isUp = false;
        } else {
            System.out.println("Screen is already lowered.");
        }
    }

    public void toggle() {
        if (isUp) {
            lower();
        } else {
            raise();
        }
    }
}
