package intervallen;

/**
 * Elke instantie van deze klasse slaat een interval
 * met gehele ondergrens en gehele bovengrens op.
 * 
 * @invar De lengte is niet negatief.
 *   | 0 <= this.getLength()
 * @invar 
 *   | getLength() == getBovengrens() - getOndergrens()
 */
public class Interval {
	/**
	 * @invar | 0 <= lengte 
	 */
	private int ondergrens;
	private int lengte;
	
	public int getOndergrens() { 
		return ondergrens;
	}
	public int getBovengrens() { 
		return ondergrens + lengte; 
	}
	public int getLength() {
		return this.lengte;
	}
	
	/**
	 * Initialiseert het object met de gegeven
	 * ondergrens en bovengrens.
	 * @throws IllegalArgumentException
	 *     | ondergrens > bovengrens 
	 * @post | getOndergrens() == ondergrens
	 * // een van de twee is voldoende (dus bovengrens kan ook)
	 * // om de toestan vh nieuwe object volledig te bepalen.
	 * @post | getLength() == bovengrens - ondergrens
	 */
	public Interval(int ondergrens, int bovengrens){
		if (ondergrens > bovengrens)
			throw new IllegalArgumentException(
					"`ondergrens` is groter dan" +
			        "`bovengrens`");
		
		this.ondergrens = ondergrens;
		lengte = bovengrens - ondergrens;
	}// this bij lengte wordt weggelaten omdat er 
	 // geen verwarring is zoals bij ondergrens (wel verwarring)
	 // lengte is geen locale variabele dus gaat java lengte 
	 // zoeken als een veld van this dus dan moet je niet this. schrijven
	
	
	/**
	 * Stelt de ondergrens van het intervam in op
	 * de gegeven waarde.
	 * 
	 * @mutates | this 
	 * @post | getOndergrens() == ondergrens
	 * @post | getLength() == old(getLength()) 
	 */
	public void setOndergrens(int ondergrens) {
		this.ondergrens = ondergrens;
	}
	
	
	/**
	 * Stelt de bovengrens van het interval in op
	 * de gegeven waarde.
	 * @pre | getOndergrens() <= bovengrens
	 * @mutates | this
	 * @post | getBovengrens() == bovengrens
	 * @post | getOndergrens() == old(getOndergrens())
	 */
	public void setBovengrens(int bovengrens) {
		lengte = bovengrens - this.ondergrens;
	}

}
