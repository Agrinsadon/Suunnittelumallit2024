import java.util.Observable;

public class ClockSubject extends Observable {

    private int hour;
    private int minute;
    private int second;

    public ClockSubject() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public void tick() {
        second++;
        if (second == 60) {
            second = 0;
            minute++;
        }
        if (minute == 60) {
            minute = 0;
            hour++;
        }
        setChanged();
        notifyObservers();
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
}
