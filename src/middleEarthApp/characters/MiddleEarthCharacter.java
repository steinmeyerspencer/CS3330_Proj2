package middleEarthApp.characters;

public abstract class MiddleEarthCharacter {
	
	/**
	 * initializing name, health, power
	 */
	public String name;
	public double health;
	public double power;
	
	
	/**
	 * parameterized constructor
	 * @param name
	 * @param health
	 * @param power
	 */
	public MiddleEarthCharacter(String name, double health, double power) {
		this.name = name;
		this.health = health;
		this.power = power;
	}

	/**
	 * abstract attack(target) function to attack the target character
	 * decides attack power by race of target
	 * @param target
	 * @return
	 */
	public abstract boolean attack(MiddleEarthCharacter target);
	
	/**
	 * returns race of character
	 * @return
	 */
	public abstract String getRace();
	
	/**
	 * displays info of character
	 */
	public void displayInfo() {
		System.out.println(name + " has " + health + " health and " + power + " power");
	}
	
	/**
	 * returns name of character 
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * used to set name of character
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * returns health of character
	 * @return
	 */
	public double getHealth() {
		return health;
	}
	
	/**
	 * used to set health of a character
	 * @param health
	 */
	public void setHealth(double health) {
		this.health = health;
	}
	
	/**
	 * returns power of a character
	 * @return
	 */
	public double getPower() {
		return power;
	}
	
	public void setPower(double power) {
		this.power = power;
	}
	
}
