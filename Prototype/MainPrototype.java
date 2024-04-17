public class MainPrototype {
    public static void main(String[] args) {
        Hand hour = new Hand(10);
        Hand minute = new Hand(30);
        Clock original = new Clock(hour, minute);

        try {
            Clock clone = original.clone();

            System.out.println("Original clock:");
            printClockTime(original);

            System.out.println("Cloned clock:");
            printClockTime(clone);

            hour.setTime(11);
            minute.setTime(45);

            System.out.println("After changing time of the original clock:");
            printClockTime(original);
            printClockTime(clone);

            // Shallow copy
            Clock shallowCopy = (Clock) original.clone();
            System.out.println("Shallow copy of the original clock:");
            printClockTime(shallowCopy);

            // Changing time of the original clock
            hour.setTime(12);
            minute.setTime(0);
            System.out.println("After changing time of the original clock again:");
            printClockTime(original);
            printClockTime(shallowCopy);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    private static void printClockTime(Clock clock) {
        System.out.println("Hour: " + clock.getHour().getTime() + ", Minute: " + clock.getMinute().getTime());
    }
}
