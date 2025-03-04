package middleEarthApp;

import middleEarthApp.charactermanager.CharacterManager;
import middleEarthApp.characters.Orc;
import middleEarthApp.council.MiddleEarthCouncil;

public class MiddleEarthApp {

	public static void main(String[] args) {
		
		MiddleEarthCouncil newCouncil = MiddleEarthCouncil.getInstance();
		CharacterManager characterManager = newCouncil.getCharacterManager();
		
		Menu menu = new Menu();
		int optionChoice = menu.printMenu();
		if (optionChoice == 1) {
			menu.runAdd(characterManager);
		}
		
		
		
//		Orc orc1 = new Orc("Orc", 100,12);
//		characterManager.addCharacter(orc1);

		
		
		
	}

}
