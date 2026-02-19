package intervallen;

public class Interval {
	private int ondergrens;
	private int bovengrens;
	
	void setOndergrens(int ondergrens) {
		this.ondergrens = ondergrens;
	}
	
	void setBovengrens(int bovengrens) {
		this.bovengrens = bovengrens;
	}
	
	int getLength() {
		return this.bovengrens - this.ondergrens;
	}
}
