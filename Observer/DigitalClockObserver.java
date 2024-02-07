import java.util.Observable;
import java.util.Observer;

public class DigitalClockObserver implements Observer {

    private ClockSubject clockSubject;

    public DigitalClockObserver(ClockSubject clockSubject) {
        this.clockSubject = clockSubject;
        clockSubject.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof ClockSubject) {
            ClockSubject clock = (ClockSubject) o;
            int hour = clock.getHour();
            int minute = clock.getMinute();
            int second = clock.getSecond();
            System.out.println("Aika: " + hour + ":" + minute + ":" + second);
        }
    }
}
