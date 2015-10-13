package Quadrilaterals;

import sun.awt.windows.ThemeReader;

/**
 * Created by mb on 10/12/15.
 */
public class Assign5Driver
	{
	public static void main(String[] args)
		{
		//instantiate trapezoid, parrallelogram, rectangle, and square objects
		//return area of each

		Trapezoid myTrap = new Trapezoid(new Points(3,-1),new Points(3,1),new Points(-1,2),new Points(-1,-3));
		System.out.println(myTrap.toString() + "\nhas an area of " + myTrap.getArea
				                                                                                                      ());
		//System.out.println(myTrap.toString());


		Points testPoint = new Points(3,-1);
		//System.out.printf(testPoint.toString());

		//System.out.printf(testPoint.getx());
		//System.out.printf(testPoint.gety());
		}
	}
