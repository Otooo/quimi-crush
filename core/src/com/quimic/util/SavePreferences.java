package com.quimic.util;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;

public class SavePreferences {	
	private static final String PREF_MUSIC_VOLUME = "volume";
	private static final String PREF_SOUND_VOL = "sound";
	private static final String PREF_MUSIC_ENABLED = "music.enabled";
	private static final String PREF_SOUND_ENABLED = "sound.enabled";	
	
	private static final String PREFS_NAME = "quimiCrushSaves";
	
	private static final String SAVE_LEVEL_PASS = "level.pass";
	
	
	private Preferences preferences; // As preferencias (ajustes do jogador)
	
	protected Preferences getPrefs() {
		if (preferences == null)
			preferences = Gdx.app.getPreferences(PREFS_NAME);
		return preferences;
	}
	
	public boolean isSoundEffectsEnabled() {
		return getPrefs().getBoolean(PREF_SOUND_ENABLED, true);
	}
 
	public void setSoundEffectsEnabled(boolean soundEffectsEnabled) {
		getPrefs().putBoolean(PREF_SOUND_ENABLED, soundEffectsEnabled);
		getPrefs().flush();
	}
 
	public boolean isMusicEnabled() {
		return getPrefs().getBoolean(PREF_MUSIC_ENABLED, true);
	}
 
	public void setMusicEnabled(boolean musicEnabled) {		
		getPrefs().putBoolean(PREF_MUSIC_ENABLED, musicEnabled);
		getPrefs().flush();
	}
 
	public float getMusicVolume() {
		return getPrefs().getFloat(PREF_MUSIC_VOLUME, 0.5f);
	}
 
	public void setMusicVolume(float volume) {
		getPrefs().putFloat(PREF_MUSIC_VOLUME, volume);
		getPrefs().flush();
	}
	
	public float getSoundVolume() {
		return getPrefs().getFloat(PREF_SOUND_VOL, 0.5f);
	}
 
	public void setSoundVolume(float volume) {
		getPrefs().putFloat(PREF_SOUND_VOL, volume);
		getPrefs().flush();
	}
	
	public int getLevelPass() {
		return getPrefs().getInteger(SAVE_LEVEL_PASS, 0);
	}
 
	public void setLevelPass(int level) {
		getPrefs().putInteger(SAVE_LEVEL_PASS, level);
		getPrefs().flush();
	}
}