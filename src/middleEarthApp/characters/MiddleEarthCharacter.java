package middleEarthApp.characters;

public abstract class MiddleEarthCharacter {
	
	public String name;
	public double health;
	public double power;
	
	public abstract boolean attack(MiddleEarthCharacter target);
	public abstract String getRace();
	
	public void displayInfo() {
		System.out.println(name + " has " + health + " health and " + power + " power");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHealth() {
		return health;
	}
	public void setHealth(double health) {
		this.health = health;
	}
	public double getPower() {
		return power;
	}
	
}
