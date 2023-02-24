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

// Stappenplan implementatie data-abstractie

// 1. Velden definiëren =
//    rauwe concretetoestandsruimte definiëren
//
// 2. Geldige concretetoestandsruimte definiëren
//    = representatie-invarianten noteren
//
// 3. Afbeelding concrete toestand op abstracte toestand
//    = getters implementeren
//    Daarbij moet gelden dat elke geldige concrete toestand
//    afgebeeld wordt op een geldige abstracte toestand
//
// 4. Implementeren van constructoren en mutatoren

/**
 * @invar | 0 <= getHours() && getHours() <= 23
 * @invar | 0 <= getMinutes() && getMinutes() <= 59
 */
public class TimeOfDay {
	
	/**
	 * @invar | 0 <= hours && hours <= 23
	 * @invar | 0 <= minutes && minutes <= 59
	 */
	private int hours;
	private int minutes;

	public int getHours() { return hours; }
	
	public int getMinutes() { return minutes; }
	
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
		
		this.hours = hours;
		this.minutes = minutes;
	}
	
	/**
	 * @pre | 0 <= hours && hours <= 23
	 * @mutates | this
	 * @post | getHours() == hours
	 * @post | getMinutes() == old(getMinutes())
	 */
	public void setHours(int hours) {
		this.hours = hours;
	}
	
	/**
	 * @pre | 0 <= minutes && minutes <= 59
	 * @mutates | this
	 * @post | getHours() == old(getHours())
	 * @post | getMinutes() == minutes
	 */
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
}
