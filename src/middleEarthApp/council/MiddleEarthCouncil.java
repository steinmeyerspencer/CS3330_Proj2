package middleEarthApp.council;

import middleEarthApp.charactermanager.CharacterManager;

public class MiddleEarthCouncil {
	
	private static MiddleEarthCouncil instance;
	private CharacterManager characterManager;
	
	/**
	 * prevent from being invoked outside
	 * Made by Dane
	 */
	private MiddleEarthCouncil() {
		CharacterManager characterManager = new CharacterManager();
	}
	
	
	/**
	 * if there is no instance, creates the first instance
	 * If there already is an instance, override the instance with this new instance
	 * Singleton pattern
	 * Made by Dane
	 * @return
	 */
	public static MiddleEarthCouncil getInstance() {
		if(instance == null) {
			instance = new MiddleEarthCouncil();
		}
		return instance;
	}
	
	
	public CharacterManager getCharacterManager() {
		return characterManager;
	}
	

}
