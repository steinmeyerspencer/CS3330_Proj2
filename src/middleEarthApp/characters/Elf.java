package middleEarthApp.characters;

public class Elf extends MiddleEarthCharacter{

	private String race = "Elf";
		
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		if (target.getRace() == "Orc") {
			target.setHealth(target.getHealth() - (1.5 * this.power));
			return true;
		}
		else if (target.getRace() == "Dwarf" || target.getRace() == "Elf") {
			
			return false;
		}
		else if (target.getRace() == "Human" || target.getRace() == "Wizard") {
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
