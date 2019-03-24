// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a COMP102 assignment.
// You may not distribute it in any other way without permission.

/* Exercise for COMP102 - 2019T1
 * Name: Ludmila Sinogeikina   
 * Username:
 * ID:
 */

import ecs100.*;
import java.lang.Math.*;

/** Program for calculating various things
 * Some methods convert between two units
 * Other methods perform other simple calculations 
 */

public class CalculatorExercise{

    /**
     * Ask for miles then convert to kilometers
     */
    public void milesToKilometers(){
        double miles = UI.askDouble("Miles: ");
        double kilometres = (miles / 1.609344);
        UI.println(miles + " miles -> " + kilometres + " kilometres");

    }	

    /**
     * Ask for base and height, then calculate area of triangle
     */
    public void triangleArea(){
        double base = UI.askDouble("Base: ");
        double height = UI.askDouble("Height: ");
        double area = (height * base) / 2;
        UI.println("Base: " + base + "\nHeight: " + height + "\nArea: " + area);

    }

    /**
     * Ask for grams then convert to ounces
     */
    public void gramsToOunces(){
        double grams = UI.askDouble("Grams: ");
        double ounces = grams / 28.34952;
        UI.println(grams + "grams -> " + ounces );

    }

    /**
     * Ask for radius, and then compute surface area and the volume of a sphere
     *  see notes or http://math2.org/math/geometry/areasvols.htm  for formulas
     */
    public void surfaceAndVolumeOfSphere(){
        double r = UI.askDouble("Radius: "); // r = radius of sphere
        double surface = (4 * Math.PI * (r * r));
        double volume = ((4/3) * Math.PI * (r * r * r));
        UI.printf("With radius %.2f \nThe surface area is: %.2f \nThe volume is: %.2f", r, surface, volume);

    }

    /**
     * Ask for kelvin then convert to Fahrenheit
     */
    public void kelvinToFahrenheit(){
        double kelvin = UI.askDouble("Kelvin: ");
        double fahrenheit = 1.8 * (kelvin - 273.15) + 32;
        UI.printf("%.2f\u00B0K -> %.2f\u00B0F", kelvin, fahrenheit);

    }

    /** 
     * Ask for number of pizzas and cost per pizza, then compute cost of order of pizzas
     */
    public void costOfPizzas(){
        double p_num = UI.askDouble("Number of pizzas: ");
        double p_cost = UI.askDouble("Cost per pizza: ");
        double total_c = p_num * p_cost;
        UI.println("Total cost of pizzas: " + total_c);

    }

}
