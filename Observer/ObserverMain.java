public class ObserverMain {

    public static void main(String[] args) {
        ClockSubject clockSubject = new ClockSubject();
        DigitalClockObserver digitalClockObserver = new DigitalClockObserver(clockSubject);

        while (true) {
            try {
                Thread.sleep(1000);
                clockSubject.tick();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
