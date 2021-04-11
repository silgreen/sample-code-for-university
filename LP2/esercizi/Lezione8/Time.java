import java.util.*;
class Time implements Comparable<Time> {
private int hours,minutes,seconds;
static final Time MIDDAY = new Time(12,0,0);
static final Time MIDNIGHT = new Time(0,0,0);
	
	public Time(int h, int m, int s) {
	hours = (h % 24 + 24) % 24;
	minutes = (m % 60 + 60) % 60;
	seconds = (s % 60 + 60) % 60;	
	}

	public Time minus(Time t) {
	if(this.minutes < t.minutes) t.hours++;
	if(this.seconds < t.seconds) t.minutes++;
	return new Time(this.hours - t.hours, this.minutes - t.minutes, this.seconds - t.seconds);
	}

	@Override
	public String toString() {
	return hours + ":" + minutes + ":" + seconds;
	}


	@Override
	public int compareTo(Time t) {
		final int timeToSeconds = this.hours * 3600 + this.minutes * 60 + this.seconds;
		final int timeToSecondsParam = t.hours * 3600 + t.minutes * 60 + t.seconds;
		
		if(timeToSeconds > timeToSecondsParam) return 1;
		if(timeToSeconds < timeToSecondsParam) return -1;
		return 0;
	}
	
	public static void main(String [] args) {
	Time t1 = new Time(14,35,0);
	Time t2 = new Time(7,10,30);
	Time t3 = t1.minus(t2);

	System.out.println(t3);
	System.out.println(t3.compareTo(t2));
	System.out.println(t3.compareTo(Time.MIDDAY));
	}
		
}
