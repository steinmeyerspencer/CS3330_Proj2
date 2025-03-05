package middleEarthApp;

import java.util.Scanner;

import middleEarthApp.charactermanager.CharacterManager;
import middleEarthApp.characters.Dwarf;
import middleEarthApp.characters.Elf;
import middleEarthApp.characters.Human;
import middleEarthApp.characters.MiddleEarthCharacter;
import middleEarthApp.characters.Orc;
import middleEarthApp.characters.Wizard;

public class Menu {
	
	
	/**
	 * constructor so I can use menu class
	 */
	public Menu() {
		
	}

	// starts scanner
	private Scanner input = new Scanner(System.in);
	
	/**
	 * parameterized function getting integer from an input
	 * returns integer if is in range of [startInclusive, endInclusive]
	 * loops until integer in range is submitted
	 * @param startInclusive
	 * @param endInclusive
	 * @return
	 */
	private int getIntFromInput(int startInclusive, int endInclusive) {
		while(true) {
			if(input.hasNextInt()) {
				int answer = input.nextInt();
				if(answer >= startInclusive && answer <= endInclusive) {
					System.out.println("You entered " + answer);
					input.nextLine();
					return answer;
				}
				else {
					System.out.println("Integer not in accepted range, try again.");
					input.nextLine();
					continue;
				}
			}
			else {
				System.out.println("Input not recognized as an integer, try again.");
				input.nextLine();
				continue;
			}
		}
	}
	
	/**
	 * nonparameterized function getting a string from input
	 * returns string if input is a string
	 * @return
	 */
	private String getStringFromInput() {
		String string = input.next();
		input.nextLine();
		System.out.println("You entered " + string);
		return string;
	}
	
	
	
	/**
	 * prints menu and returns selected choice
	 * @return
	 */
	public int printMenu() {
		System.out.println("1. Add a new character.");
		System.out.println("2. View all characters.");
		System.out.println("3. Update a character.");
		System.out.println("4. Delete a character.");
		System.out.println("5. Execute all characters' attack actions.");
		System.out.println("6. Exit.");
		System.out.println("Enter your option: ");
		return getIntFromInput(1,6);
	}

	
	/**
	 * runs the add character function after prompting for all necessary info
	 * @param manager
	 * @return
	 */
	public boolean runAdd(CharacterManager manager) {
		
		System.out.println("Enter Name: ");
		String name = getStringFromInput();
		
		System.out.println("Enter health (1-1000): ");
		int health = getIntFromInput(1,1000);
		
		System.out.println("Enter power (1-100): ");
		int power = getIntFromInput(1,100);
		
		System.out.println("What race would you like your character to be? Enter an integer.");
		System.out.println("1. Dwarf");
		System.out.println("2. Elf");
		System.out.println("3. Human");
		System.out.println("4. Orc");
		System.out.println("5. Wizard");
		int race = getIntFromInput(1,5);
		
		MiddleEarthCharacter newCharacter;
		if(race == 1) {
			newCharacter = new Dwarf(name,health,power);
		}
		else if (race == 2) {
			newCharacter = new Elf(name,health,power);
		}
		else if (race == 3) {
			newCharacter = new Human(name,health,power);
		}
		else if (race == 4) {
			newCharacter = new Orc(name,health,power);
		}
		else{
			newCharacter = new Wizard(name,health,power);
		}
		return manager.addCharacter(newCharacter);
		
	}
	
	/**
	 * displays all characters 
	 * @param manager
	 */
	public void viewAllCharacters(CharacterManager manager) {
		manager.displayAllCharacters();
	}
	
	/**
	 * runs update character function after prompting for old name, new name, new health, new power
	 * @param manager
	 * @return
	 */
	public boolean runUpdate(CharacterManager manager) {
		
		System.out.println("Enter current name of character to update: ");
		try {
			String oldName = getStringFromInput();
			
			System.out.println("Enter Name: ");
			String newName = getStringFromInput();
			
			System.out.println("Enter health (1-1000): ");
			int newHealth = getIntFromInput(1,1000);
			
			System.out.println("Enter power (1-100): ");
			int newPower = getIntFromInput(1,100);
			
			MiddleEarthCharacter characterToUpdate = manager.getCharacter(oldName);
			
			return manager.updateCharacter(characterToUpdate, newName, newHealth, newPower);
		}catch (Exception e) {
			System.out.println("ERROR: Could not find character.");
			return false;
		}
		
	}
	
	/**
	 * runs deleteCharacter() after prompting for name of character to delete
	 * @param manager
	 * @return
	 */
	public boolean runDelete(CharacterManager manager) {
		System.out.println("Enter name of character to delete: ");
		String name = getStringFromInput();
		
		try {
			MiddleEarthCharacter characterToDelete = manager.getCharacter(name);
			
			return manager.deleteCharacter(characterToDelete);
		}catch (Exception e){
			System.out.println("ERROR: Cannot find character.");
			return false;
		}
		

	}
	
	/**
	 * executes all characters attacks
	 * @param manager
	 */
	public void allCharactersAttack(CharacterManager manager) {
		manager.executeAllAttacks();
	}
	
	
	/**
	 * Provides way to initialize and access scanner
	 * @return
	 */
	public Scanner getScanner() {
        return input;
    }
	
	
}


