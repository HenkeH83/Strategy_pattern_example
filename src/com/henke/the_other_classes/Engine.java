package com.henke.the_other_classes;

import com.henke.engine_interfaces.Power;
import com.henke.engine_interfaces.Sound;

/**
 * The engine is the base class that really makes this strategy pattern work.
 * It has an instance of each interface related to engine so that they are interchangeable.
 * It should be used to create derived classes, and it could. But in this program it defines the car object it's in.
 * The strategy pattern theory is intact I think.
 * @author henke
 *
 */
public class Engine {

	private Sound sound;
	private Power power;
	
	public Engine(Sound sound, Power power) {
		this.sound = sound;
		this.power = power;
	}
	
	public String sound() {
		return this.sound.playSound();
	}
	
	public int power() {
		return this.power.getPower();
	}
	
}
