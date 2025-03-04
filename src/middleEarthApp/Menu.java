package middleEarthApp;

import java.util.Scanner;

public class Menu {
	
	Scanner input = new Scanner(System.in);
	
	public int printMenu() {
		
		System.out.println("1. Add a new character.");
		System.out.println("2. View all characters.");
		System.out.println("3. Update a character.");
		System.out.println("4. Delete a character.");
		System.out.println("5. Execute all characters' attack actions.");
		System.out.println("6. Exit.");
		while(true) {
			if(input.hasNextInt()) {
				int answer = input.nextInt();
				System.out.println("You entered " + answer);
				input.nextLine();
				return answer;
			}
			else {
				System.out.println("Input not recognized as an integer, try again.");
				input.nextLine();
				continue;
			}
		}
	}
	
	public boolean runAdd() {
		while(true) {
			System.out.println("Enter Name: ");
			if(input.hasNext()) {
				String name = input.next();
				input.nextLine();
			}
			else {
				System.out.println("Name not recognized, try again.");
				input.nextLine();
				continue;
			}
			System.out.println("Enter health: ");
			if(input.hasNextInt()) {
				int health = input.nextInt();
				input.nextLine();
			}
			else {
				System.out.println("Input not recognized as an integer, try again.");
				input.nextLine();
				continue;
			}
			System.out.println("Enter power: ");
			if(input.hasNextInt()) {
				int power = input.nextInt();
				input.nextLine();
			}
			else {
				System.out.println("Input not recognized as an integer, try again.");
				input.nextLine();
				continue;
			}
	}
	}
	
}
