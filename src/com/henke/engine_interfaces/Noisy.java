package com.henke.engine_interfaces;

/**
 * The noisy sound that can be used by engines.
 * @author henke
 *
 */
public class Noisy implements Sound {

	@Override
	public String playSound() {
		return "*VROOM VROOM";
	}

}
