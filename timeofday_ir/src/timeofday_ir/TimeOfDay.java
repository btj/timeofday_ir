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

	public int getHours() { throw new RuntimeException("Not yet implemented"); }
	
	public int getMinutes() { throw new RuntimeException("Not yet implemented"); }
	
	/**
	 * @throws IllegalArgumentException | hours < 0 || 23 < hours
	 * @throws IllegalArgumentException | minutes < 0 || 59 < minutes
	 * @mutates |
	 * @post | getHours() == hours
	 * @post | getMinutes() == minutes
	 */
	public TimeOfDay(int hours, int minutes) { throw new RuntimeException("Not yet implemented"); }
	
	/**
	 * @pre | 0 <= hours && hours <= 23
	 * @mutates | this
	 * @post | getHours() == hours
	 * @post | getMinutes() == old(getMinutes())
	 */
	public void setHours(int hours) { throw new RuntimeException("Not yet implemented"); }
	
	/**
	 * @pre | 0 <= minutes && minutes <= 59
	 * @mutates | this
	 * @post | getHours() == old(getHours())
	 * @post | getMinutes() == minutes
	 */
	public void setMinutes(int minutes) { throw new RuntimeException("Not yet implemented"); }
}
