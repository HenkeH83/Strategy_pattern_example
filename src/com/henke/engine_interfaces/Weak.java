package com.henke.engine_interfaces;

/**
 * Weak power that can be used on engines.
 * @author henke
 *
 */
public class Weak implements Power{

	@Override
	public int getPower() {
		return 100;
	}

}
