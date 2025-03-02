package middleEarthApp.characters;

public class Orc extends MiddleEarthCharacter{

	private String race = "Orc";
	
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		if (target.getRace() == "Human") {
			target.setHealth(target.getHealth() - (1.5 * this.power));
			return true;
		}
		else if (target.getRace() == "Orc" || target.getRace() == "Elf") {
			
			return false;
		}
		else if (target.getRace() == "Dwarf" || target.getRace() == "Wizard") {
			target.setHealth(target.getHealth() - this.power);
			return true;
		}
		return false;
		
	}

	@Override
	public String getRace() {
		return race;
	}
}
