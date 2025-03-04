package middleEarthApp.characters;

public class Human extends MiddleEarthCharacter{
	
	/**
	 * Attacks wizard with 1.5 power, dwarf and elf with regular power, does not attack human and orc 
	 */
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		if (target.getRace() == "Wizard") {
			target.setHealth(target.getHealth() - (1.5 * this.power));
			return true;
		}
		else if (target.getRace() == "Orc" || target.getRace() == "Human") {
			
			return false;
		}
		else if (target.getRace() == "Dwarf" || target.getRace() == "Elf") {
			target.setHealth(target.getHealth() - this.power);
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
