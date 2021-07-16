import java.util.Comparator;

public class Time implements Comparable<Time> {
    private int hour, min, sec;
    static final Time MIDDAY = new Time(12, 0, 0);
    static final Time MIDNIGHT = new Time(0, 0, 0);

    public Time(int h, int m, int s) {
        /**
         * Trucco necessario perchè il modulo in Java funziona in un modo impredicibile,
         * ???? ritorna numeri negativi ????
         */
        hour = (h % 24 + 24) % 24;
        min = (m % 60 + 60) % 60;
        sec = (s % 60 + 60) % 60;
    }

    // classe anonima non locale
    public static final Comparator<Time> comparator = new Comparator<>() {
        public int compare(Time t1, Time t2) {
            return t1.compareTo(t2);
        }
    };

    // lambda function
    public static final Comparator<Time> comparatorLambda = (t1, t2) -> {
        final Integer thisSec = t1.hour * 3600 + t1.min * 60 + t1.sec;
        final Integer paraSec = t2.hour * 3600 + t2.min * 60 + t2.sec;
        return thisSec.compareTo(paraSec);
    };

    @Override
    public String toString() {
        return hour + ":" + min + ":" + sec;
    }

    public Time minus(Time t) {
        if (this.sec < t.sec)
            t.min++;
        if (this.min < t.min)
            t.hour++;
        return new Time(this.hour - t.hour, this.min - t.min, this.sec - t.sec);
    }

    @Override
    public int compareTo(Time t) {
        final Integer thisSec = this.hour * 3600 + this.min * 60 + this.sec;
        final Integer paraSec = t.hour * 3600 + t.min * 60 + t.sec;
        return thisSec.compareTo(paraSec);
    }

    public static void main(String[] args) {
        Time t1 = new Time(14, 35, 0);
        Time t2 = new Time(7, 10, 30);
        Time t3 = t1.minus(t2);

        System.out.println(t3);
        System.out.println(t3.compareTo(t2));
        System.out.println(t3.compareTo(Time.MIDDAY));
        System.out.println(t3.compareTo(Time.MIDNIGHT));
        System.out.println(Time.comparator.compare(t3, t2));
        System.out.println(Time.comparatorLambda.compare(t3, t2));
    }
}
