package com.henke.the_other_classes;

import java.util.Scanner;

import com.henke.engine_interfaces.Noisy;
import com.henke.engine_interfaces.Power;
import com.henke.engine_interfaces.Quiet;
import com.henke.engine_interfaces.Sound;
import com.henke.engine_interfaces.Strong;
import com.henke.engine_interfaces.Weak;

/**
 * Contains the main function.
 * 
 * @author henke
 *
 */
public class CarBuilder {

	/**
	 * Is the main function.
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Sound sound;
		Power power;
		Car car;
		boolean again = true;
		int choice;

		while (again) {
			System.out.println("Welcome to car builder!\n\n" + "Please choose the sound you want your car to make:\n"
					+ "1: for a loud noisy sound\n" + "2: for a quieter sound\n");
			choice = Integer.parseInt(sc.nextLine());
			sound = choice <= 1 ? new Noisy() : new Quiet();
			
			System.out.println("\nMasterfully done!\n\n" + "Now choose engine power\n\n"
					+ "1: for a weaker engine or \n2: for a stronger one.\n");
			choice = Integer.parseInt(sc.nextLine());
			power = choice <= 1 ? new Weak() : new Strong();
			
			car = new Car(sound, power);
			System.out.println("\nGreat work!\n\n" + "Here is your car:\n\n");
			car.checkSpecs();
			System.out.println("\nMake another?\n\n1: for 'yes'\n2: for 'no'\n");
			choice = Integer.parseInt(sc.nextLine());
			again = choice <= 1 ? true : false;

		} // End of while loop.
		sc.close();
		System.out.println("Goodbye!");
		System.exit(0);
	} // end of main.

}
