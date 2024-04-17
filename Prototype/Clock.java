public class Clock implements Cloneable {
    private Hand hour;
    private Hand minute;

    public Clock(Hand hour, Hand minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public Hand getHour() {
        return hour;
    }

    public Hand getMinute() {
        return minute;
    }

    @Override
    protected Clock clone() throws CloneNotSupportedException {
        Hand clonedHour = this.hour.clone();
        Hand clonedMinute = this.minute.clone();
        return new Clock(clonedHour, clonedMinute);
    }
}
