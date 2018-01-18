package com.henke.engine_interfaces;

/**
 * Quiet sound that can be used on engines.
 * @author henke
 *
 */
public class Quiet implements Sound{

	@Override
	public String playSound() {
		return "*vrom vrom...*";
	}

}
