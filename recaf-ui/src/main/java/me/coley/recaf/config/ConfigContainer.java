package me.coley.recaf.config;

/**
 * Container of config values, marked with {@link ConfigID}.
 *
 * @author Matt Coley
 */
public interface ConfigContainer {
	/**
	 * @return Display name for the {@link #internalName() internal name} to show in UI's.
	 */
	String displayName();

	/**
	 * @return Internal name of contained config items. Used as a prefix for items marked with {@link ConfigID}.
	 */
	String internalName();
}
