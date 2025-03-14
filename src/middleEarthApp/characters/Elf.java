package middleEarthApp.characters;

public class Elf extends MiddleEarthCharacter{
	
	public Elf(String name, double health, double power) {
		super(name, health, power);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Attacks orc with 1.5 power, human and wizard with regular power, does not attack elf and dwarf 
	 */
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		if (target.getRace() == "Orc") {
			target.setHealth(target.getHealth() - (1.5 * power));
			return true;
		}
		else if (target.getRace() == "Dwarf" || target.getRace() == "Elf") {
			
			return false;
		}
		else if (target.getRace() == "Human" || target.getRace() == "Wizard") {
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
		return "Elf";
	}

}
