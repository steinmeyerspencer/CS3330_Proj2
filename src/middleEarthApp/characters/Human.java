package middleEarthApp.characters;

public class Human extends MiddleEarthCharacter{
	
	private String race = "Human";
	
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

	@Override
	public String getRace() {
		return race;
	}
}
