package Quadrilaterals;
import java.security.SecureRandom;


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
		Trapezoid trap = new Trapezoid(new Points(3.0,-1.0),new Points(3.0,1.0),new Points(-1.0,2.0),new Points(-1.0,-3.0));
		System.out.println(trap.toString() + "\nArea = " + trap.getArea());


		System.out.println("*****************\n");

		Parallelogram myPara = new Parallelogram(new Points(5.0,-1.0),new Points(5.0,4.0),new Points(2.0,2.0),new Points(2.0,-4.0));
		System.out.println(myPara.toString() + "\nArea = " + myPara.getArea());
		//System.out.printf(myPara.getName());

		System.out.println("*****************\n");

		Rectangle rect = new Rectangle(new Points(5.0,-8.0),new Points(5.0,8.0),new Points(-2.0,8.0),new Points(-2.0,-8.0));
		System.out.println(rect.toString() + "\nArea = " + rect.getArea());
		System.out.println("*****************\n");


		Square square1 = new Square(new Points(5.0,-5.0),new Points(5.0,5.0),new Points(-5.0,5.0),new Points(-5.0,-5.0));
		System.out.println(square1 + "\nArea = " + square1.getArea());

		}

	}
