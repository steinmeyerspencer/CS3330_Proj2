package middleEarthApp.characters;

public class Orc extends MiddleEarthCharacter{

	public Orc(String name, double health, double power) {
		super(name, health, power);
	}

	/**
	 * Attacks human with 1.5 power, dwarf and wizard with regular power, does not attack orc and elf 
	 */
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		if (target.getRace() == "Human") {
			target.setHealth(target.getHealth() - (1.5 * power));
			return true;
		}
		else if (target.getRace() == "Orc" || target.getRace() == "Elf") {
			
			return false;
		}
		else if (target.getRace() == "Dwarf" || target.getRace() == "Wizard") {
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
		return "Orc";
	}
}
