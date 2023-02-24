package timeofday_ir;

// Stappenplan definiëren API data-abstractie:
//
// 1. Getters declareren =
//    definiëren abstractetoestandsruimte
//
// 2. Definiëren geldige abstractetoestandsruimte
//    = noteren van abstractetoestandsinvarianten
//
// 3. Declareren en documenteren
//    van constructoren en mutatoren

/**
 * @invar | 0 <= getHours() && getHours() <= 23
 * @invar | 0 <= getMinutes() && getMinutes() <= 59
 */
public class TimeOfDay {
	
	/**
	 * @invar | 0 <= minutesSinceMidnight && minutesSinceMidnight < 24 * 60
	 */
	private int minutesSinceMidnight;

	public int getHours() { return minutesSinceMidnight / 60; }
	
	public int getMinutes() { return minutesSinceMidnight % 60; }
	
	/**
	 * @throws IllegalArgumentException | hours < 0 || 23 < hours
	 * @throws IllegalArgumentException | minutes < 0 || 59 < minutes
	 * @mutates |
	 * @post | getHours() == hours
	 * @post | getMinutes() == minutes
	 */
	public TimeOfDay(int hours, int minutes) {
		if (hours < 0 || 23 < hours)
			throw new IllegalArgumentException("`hours` out of range");
		if (minutes < 0 || 59 < minutes)
			throw new IllegalArgumentException("`minutes` out of range");
		
		minutesSinceMidnight = hours * 60 + minutes;
	}
	
	/**
	 * @pre | 0 <= hours && hours <= 23
	 * @mutates | this
	 * @post | getHours() == hours
	 * @post | getMinutes() == old(getMinutes())
	 */
	public void setHours(int hours) {
		this.minutesSinceMidnight = hours * 60 + minutesSinceMidnight % 60;
	}
	
	/**
	 * @pre | 0 <= minutes && minutes <= 59
	 * @mutates | this
	 * @post | getHours() == old(getHours())
	 * @post | getMinutes() == minutes
	 */
	public void setMinutes(int minutes) {
		this.minutesSinceMidnight = (minutesSinceMidnight / 60) * 60 + minutes;
	}
}
