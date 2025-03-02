package middleEarthApp.characters;

public class Dwarf extends MiddleEarthCharacter{
	
	private String race = "Dwarf";
	
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		if (target.getRace() == "Elf") {
			target.setHealth(target.getHealth() - (1.5 * this.power));
			return true;
		}
		else if (target.getRace() == "Dwarf" || target.getRace() == "Wizard") {
			
			return false;
		}
		else if (target.getRace() == "Human" || target.getRace() == "Orc") {
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
