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

		Trapezoid trap = new Trapezoid(new Points(3.0,-1.0),new Points(3.0,1.0),new Points(-1.0,2.0),new Points(-1.0,
		                                                                                                          -3.0));
		System.out.println(trap.toString() + "\nhas an area of " + trap.getArea());


		System.out.println("");
		Parallelogram myPara = new Parallelogram(new Points(5.0,-1.0),new Points(5.0,4.0),new Points(2.0,2.0),new Points(2.0,
		                                                                                                          -4.0));
		System.out.println(myPara.toString() + "\nhas an area of " + myPara.getArea());


		System.out.println("");
		Rectangle rect = new Rectangle(new Points(5.0,-8.0),new Points(5.0,8.0),new Points(-2.0,8.0),new Points(-2.0,
		                                                                                                        -8.0));
		System.out.println(rect.toString() + "\nhas an area of " + rect.getArea());
		System.out.println("");


		Square square1 = new Square(new Points(5.0,-5.0),new Points(5.0,5.0),new Points(-5.0,5.0),new Points(-5.0,-5.0));
		System.out.println(square1.toString() + "\nhas an area of " + square1.getArea());

		}
	}
