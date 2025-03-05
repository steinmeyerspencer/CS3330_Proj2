package middleEarthApp.council;

import middleEarthApp.charactermanager.CharacterManager;

public class MiddleEarthCouncil {
	
	private static MiddleEarthCouncil instance;
	
	/**
	 * prevent from being invoked outside
	 * Made by Dane
	 */
	private MiddleEarthCouncil() {
		
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
	
	/**
	 * returns an instance of characterManager
	 * @return
	 */
	public CharacterManager getCharacterManager() {
		CharacterManager characterManager = new CharacterManager();
		return characterManager;
	}
	

}
