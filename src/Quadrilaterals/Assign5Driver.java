package Quadrilaterals;


/**
 * Created by mb on 10/12/15.
 */
public class Assign5Driver
	{
	public static void main(String[] args)
		{
		//instantiate trapezoid, parrallelogram, rectangle, and square objects
		//return area of each


		//clean this up
		
		Trapezoid myTrap = new Trapezoid(new Points(3.0,-1.0),new Points(3.0,1.0),new Points(-1.0,2.0),new Points(-1.0,
		                                                                                                         -3.0));
		System.out.println(myTrap.toString() + "\nhas an area of " + myTrap.getArea());
		System.out.println("");
		Parallelogram myParallel = new Parallelogram(new Points(5.0,-1.0),new Points(5.0,4.0),new Points(2.0,2.0),new Points(2.0,
		                                                                                                          -4.0));
		System.out.println(myParallel.toString() + "\nhas an area of " + myParallel.getArea());
		System.out.println("");
		Rectangle myRect = new Rectangle(new Points(5.0,-8.0),new Points(5.0,8.0),new Points(-2.0,8.0),new Points(-2.0,-8.0));
		System.out.println(myRect.toString() + "\nhas an area of " + myRect.getArea());
		System.out.println("");
		Square mySquare = new Square(new Points(5.0,-5.0),new Points(5.0,5.0),new Points(-5.0,5.0),new Points(-5.0,-5.0));
		System.out.println(mySquare.toString() + "\nhas an area of " + mySquare.getArea());

		}
	}
