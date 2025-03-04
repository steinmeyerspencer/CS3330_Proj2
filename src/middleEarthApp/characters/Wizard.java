package middleEarthApp.characters;

public class Wizard extends MiddleEarthCharacter{
	
	public Wizard(String name, double health, double power) {
		super(name, health, power);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Attacks dwarf with 1.5 power, elf and orc with regular power, does not attack human and wizard 
	 */
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		if (target.getRace() == "Dwarf") {
			target.setHealth(target.getHealth() - (1.5 * power));
			return true;
		}
		else if (target.getRace() == "Human" || target.getRace() == "Wizard") {
			
			return false;
		}
		else if (target.getRace() == "Elf" || target.getRace() == "Orc") {
			target.setHealth(target.getHealth() - power);
			return true;
		}
		return false;
		
	}

	/**
	 * returns race
	 */
	@Override
	public String getRace() {
		return "Wizard";
	}
}
