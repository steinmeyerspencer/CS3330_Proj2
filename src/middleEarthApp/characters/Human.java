package middleEarthApp.characters;

public class Human extends MiddleEarthCharacter{
	
	public Human(String name, double health, double power) {
		super(name, health, power);
		// TODO Auto-generated constructor stub
	}

	
	
	/**
	 * Attacks wizard with 1.5 power, dwarf and elf with regular power, does not attack human and orc 
	 */
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		if (target.getRace() == "Wizard") {
			target.setHealth(target.getHealth() - (1.5 * power));
			return true;
		}
		else if (target.getRace() == "Orc" || target.getRace() == "Human") {
			
			return false;
		}
		else if (target.getRace() == "Dwarf" || target.getRace() == "Elf") {
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
		return "Human";
	}
}
