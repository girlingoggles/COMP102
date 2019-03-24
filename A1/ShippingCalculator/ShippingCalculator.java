// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a COMP102 assignment.
// You may not distribute it in any other way without permission.

/* Code for COMP102 - 2019T1, Assignment 1
 * Name: Ludmila Sinogeikina
 * Username: None yet
 * ID: 300512406
 */

import ecs100.*;
import java.lang.Math;

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
		double weight_pz = weight * 1.5; //weight per zone
		double size_chg = ((length / 100) * (width / 100) * (height / 100)) * SIZE_RATE;
		double total = HANDLING + (size_chg + ((weight * WEIGHT_RATE) * zones));
		UI.println("Shipping Calculator Core");
		UI.println("Length of package (cm): " + length);
		UI.println("Width of package (cm): " + width);
		UI.println("Height of package (cm): " + height);
		UI.println("Weight of package (kg): " + weight);
		UI.println("Number of zones (min 1): " + zones);
		UI.printf("Size charge per zone: $%.2f\n", size_chg);
		UI.printf("Weight charge per zone: $%.2f\n", weight_pz);
		UI.println("Zones: " + zones);
		UI.printf("Total charge: $%.2f", total);

	}

	/**
	 * Calculates and prints cost of shipping a collection of packages.
	 */
	public void calculateShippingCompletion(){
		

	}


}
