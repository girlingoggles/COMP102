// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a COMP102 assignment.
// You may not distribute it in any other way without permission.

/* Code for COMP102 - 2019T1, Assignment 1
 * Name: Andrew Schmid
 * Username: schmidandr1
 * ID: 300328218
 */

import ecs100.*;

/** Program for calculating cost of shipping a package */

public class ShippingCalculator{

	public static final double HANDLING = 1.60;    // cost of handling a shipment
	public static final double SIZE_RATE = 300;           // cost per cubic meter
	public static final double WEIGHT_RATE = 1.50;        // cost per kg

	/**
	 * Calculates and prints cost of shipping a package.
	 */
	public void calculateShippingCore(){
		double length = UI.askDouble("Length (cm): ");
		double width = UI.askDouble("Width (cm): ");
		double height = UI.askDouble("Height (cm): ");
		double weight = UI.askDouble("Weight (kg): ");
		double zones = UI.askDouble("Zones: ");
		double size_chg = ((length * width * height) / 100) * 300
		UI.println("Shipping Calculator Core");
		UI.println("Length of package (cm): ");
		UI.println("Width of package (cm): ");
		UI.println("Height of package (cm): ");
		UI.println("Weight of package (kg): ");
		UI.println("Number of zones (min 1): ");
		UI.println("Size charge per zone: $" + size_chg);
		UI.println("Weight charge per zone: $" + (weight * 1.5));
		UI.println("Zones: " + zones);
		UI.println("Total charge: $" + (size_chg + (weight * 1.5)))_



	}

	/**
	 * Calculates and prints cost of shipping a collection of packages.
	 */
	public void calculateShippingCompletion(){
		

	}


}
