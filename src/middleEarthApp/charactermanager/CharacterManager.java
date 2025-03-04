package middleEarthApp.charactermanager;

import middleEarthApp.characters.MiddleEarthCharacter;

public class CharacterManager {
	
	/**
	 * creating attributes
	 * Made by Dane
	 */
	public MiddleEarthCharacter[] characters;
	public int size;
	
	
	/**
	 * non parameterized constructor
	 * with array size starting at 5
	 * Made by Dane
	 */
	public CharacterManager() {
		this.characters = new MiddleEarthCharacter[5];
		this.size = 0;
		
	}
	
	/**
	 * creating method to add character to Character array
	 * If the characters array is full, create a new array that is double the size
	 * Copy the existing items over to the new array
	 * Adds character to the array
	 * Made by Dane
	 * @param c
	 * @return
	 */
	public boolean addCharacter(MiddleEarthCharacter c) {
		// Doubles the array if the array is full
		if (size == characters.length) {
			MiddleEarthCharacter[] newCharacters = new MiddleEarthCharacter[characters.length * 2];
			for(int i = 0; i < characters.length; i++) {
				newCharacters[i] = characters[i];
			}
			characters = newCharacters;
		}

		// add character
		for(int i = 0; i < characters.length; i++) {
			if (characters[i] == null) {
				characters[i] = c;
				size++;
				System.out.println("Character added");
				c.displayInfo();
				System.out.println("and they are a " + c.getRace());
				return true;
			}	
		}
		System.out.println("ERROR: Something went wrong.");
		return false;	
	}
	
	/**
	 * Method to get a MiddleEarthCharacter by name
	 * Iterate through the existing characters array
	 * If any of the existing characters has a matching name with the input argument, return the appropriate character
	 * Made by Dane
	 * @param name
	 * @return
	 */
	public MiddleEarthCharacter getCharacter(String name) {
		// get the character via the input name
		for (int i = 0; i < characters.length; i++) {
			if (name.equals(characters[i].getName())) {
				System.out.println("Character with name " + name + " retrieved!");
				return characters[i];
			}
		}
		System.out.println(name + " does not exist");
		return null;
	}
	
	
	/**
	 * Method to update character attributes based on the passed character
	 * Made by Dane
	 * @param character
	 * @param name
	 * @param health
	 * @param power
	 * @return
	 */
	public boolean updateCharacter (MiddleEarthCharacter character, String name, int health, int power) {
		// Find the character in the current characters list
		for (int i = 0; i < characters.length; i++) {
			if (character == characters[i]) {
				// update character attributes
				try {
					characters[i].setName(name);
					characters[i].setHealth(health);
					characters[i].setPower(power);
				}
				catch(Exception e) {
					System.out.println("Error with update: " + e);
				}
				
				System.out.println("Attributes updated.");
				return true;
			}
		}
		System.out.println("ERROR: Could not find character.");
		return false;
	}
	
	/**
	 * Method that deletes a character based on the passed character argument
	 * Then reindexes so that the array's first "size" elements are full and the rest are null
	 * Made by Dane
	 * @param character
	 * @return
	 */
	public boolean deleteCharacter(MiddleEarthCharacter character) {
		for (int i = 0; i < characters.length; i++) {
			if (character == characters[i]) {
				for (int j = i; j < characters.length - 1; j++) {
					characters[j] = characters[j + 1];
				}
				// should it be j-1 if you're shifting all of the elements toward the beginning?
				// should you delete the character first?
				// need to change "size" to size--
				characters[characters.length - 1] = null;
				System.out.println("Character deleted.");
				return true;
			}
		}
		System.out.println("ERROR: Could not find character.");
		return false;
	}
	
	
	
	/**
	 * Method that displays all the characters currently created
	 * Made by Dane
	 */
	public void displayAllCharacters() {
		for (int i = 0; i < characters.length; i++) {
			characters[i].displayInfo();
		}
	}
	
	/**
	 * executeAllAttacks that is the 5ht option in the menu
	 * runs through array of characters and attacks
	 * @return
	 */
	public void executeAllAttacks() {
		int successfulAttacks = 0;
		int totalAttacks = 0;
		for (int i = 0; i <= size - 1;i++) {
			for (int j = 0; j <= size - 1; j++) {
				if(i != j) {
					totalAttacks++;
					if(characters[i].attack(characters[j])) {
						successfulAttacks++;
					}
				}
			}
		}
		System.out.println(successfulAttacks+ " successful attacks out of " + totalAttacks + " attempted attacks.");
	}
	
	
	
	
	
	
	
	

}
