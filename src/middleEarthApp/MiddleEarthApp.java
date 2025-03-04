package middleEarthApp;

import middleEarthApp.charactermanager.CharacterManager;
import middleEarthApp.characters.Orc;
import middleEarthApp.council.MiddleEarthCouncil;

public class MiddleEarthApp {

	public static void main(String[] args) {
		
		MiddleEarthCouncil newCouncil = MiddleEarthCouncil.getInstance();
		CharacterManager characterManager = newCouncil.getCharacterManager();
		
		Menu menu = new Menu();
		while(true) {
			int optionChoice = menu.printMenu();
			if (optionChoice == 1) {
				menu.runAdd(characterManager);
				continue;
			}
			else if (optionChoice == 2) {
				menu.viewAllCharacters(characterManager);
				continue;
			}
			else if (optionChoice == 3) {
				menu.runUpdate(characterManager);
				continue;
			}
			else if (optionChoice == 4) {
				menu.runDelete(characterManager);
				continue;
			}
			else if (optionChoice == 5) {
				menu.allCharactersAttack(characterManager);
				continue;
			}
			else if(optionChoice == 6) {
				break;
			}
		}
		
		
		
//		Orc orc1 = new Orc("Orc", 100,12);
//		characterManager.addCharacter(orc1);

		
		
		
	}

}
