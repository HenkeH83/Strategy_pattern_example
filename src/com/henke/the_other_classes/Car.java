package com.henke.the_other_classes;

import com.henke.engine_interfaces.Power;
import com.henke.engine_interfaces.Sound;

/**
 * Car object that makes use of the engine.
 * @author henke
 *
 */
public class Car {

	Engine engine;
	
	public Car(Sound sound, Power power) {
		engine = new Engine(sound, power);
	}
	
	public void checkSpecs() {
		System.out.printf("This car has an engine with %d horse power and sounds %s \n", engine.power(), engine.sound());
	}
	
}
