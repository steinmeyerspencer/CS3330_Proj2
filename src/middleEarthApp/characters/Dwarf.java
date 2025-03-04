package middleEarthApp.characters;

public class Dwarf extends MiddleEarthCharacter{
	
	public Dwarf(String name, double health, double power) {
		super(name, health, power);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Attacks elf with 1.5 power, human and orc with regular power, does not attack dwarf and wizard 
	 */
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		if (target.getRace() == "Elf") {
			target.setHealth(target.getHealth() - (1.5 * power));
			return true;
		}
		else if (target.getRace() == "Dwarf" || target.getRace() == "Wizard") {
			
			return false;
		}
		else if (target.getRace() == "Human" || target.getRace() == "Orc") {
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
		return "Dwarf";
	}
}
