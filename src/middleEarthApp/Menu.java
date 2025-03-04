package middleEarthApp;

import java.util.Scanner;

public class Menu {
	
	
	/**
	 * constructor so I can use menu class
	 */
	public Menu() {
		
	}

	// starts scanner
	Scanner input = new Scanner(System.in);
	
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
				if(input.nextInt() >= startInclusive || input.nextInt() <= endInclusive) {
					int answer = input.nextInt();
					System.out.println("You entered " + answer);
					input.nextLine();
					return answer;
				}
				else {
					System.out.println("Integer not in accepted range");
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
		while(true) {
			if(input.next() instanceof String) {
				String string = input.next();
				input.nextLine();
				return string;
			}
			else {
				System.out.println("Input not recognized as a string, try again.");
				input.nextLine();
				continue;
			}
		}
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
		return getIntFromInput(1,6);
	}

	
	
	public boolean runAdd() {
		
		System.out.println("Enter Name: ");
		String name = getStringFromInput();
		
		System.out.println("Enter health (1-1000): ");
		int health = getIntFromInput(1,1000);
		
		System.out.println("Enter power (1-100): ");
		int power = getIntFromInput(1,100);
		
		System.out.println("What race would you like your character to be?");
		System.out.println("1. Dwarf");
		System.out.println("2. Elf");
		System.out.println("3. Human");
		System.out.println("4. Orc");
		System.out.println("5. Wizard");
		int race = getIntFromInput(1,5);
		return true;
	
	}
	
}


