public class Hand implements Cloneable {
    private int time;

    public Hand(int time) {
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    protected Hand clone() throws CloneNotSupportedException {
        return new Hand(this.time);
    }
}
