package intervallen;

public class Interval {
	int ondergrens;
	int bovengrens;
	
	static void setOndergrens(Interval interval, int ondergrens) {
		interval.ondergrens = ondergrens;
	}
	
	static void setBovengrens(Interval interval, int bovengrens) {
		interval.bovengrens = bovengrens;
	}
	
	static int getLength(Interval interval) {
		return interval.bovengrens - interval.ondergrens;
	}

}
