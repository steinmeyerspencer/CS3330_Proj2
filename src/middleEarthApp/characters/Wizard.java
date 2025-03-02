package middleEarthApp.characters;

public class Wizard extends MiddleEarthCharacter{
	private String race = "Wizard";
	
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		if (target.getRace() == "Dwarf") {
			target.setHealth(target.getHealth() - (1.5 * this.power));
			return true;
		}
		else if (target.getRace() == "Human" || target.getRace() == "Wizard") {
			
			return false;
		}
		else if (target.getRace() == "Elf" || target.getRace() == "Orc") {
			target.setHealth(target.getHealth() - this.power);
			return true;
		}
		return false;
		
	}

	@Override
	public String getRace() {
		return this.race;
	}
}
