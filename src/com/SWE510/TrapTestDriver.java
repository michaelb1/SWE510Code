package com.SWE510;
import java.security.SecureRandom;

public class TrapTestDriver
	{
	public static void main(String[] args)
		{
		//instantiate trapezoid, parrallelogram, rectangle, and square objects
		//return area of each


		//clean this up

		Trapezoid1 trap = new Trapezoid1(new Point1(3.0,-1.0),new Point1(3.0,1.0),new Point1(-1.0,2.0),new Point1(-1.0,-3.0));
		System.out.println(trap.toString() + "\nhas an area of " + trap.getArea());


		System.out.println("");
		/*Parallelogram myPara = new Parallelogram(new com.SWE510.Point1(5.0,-1.0),new com.SWE510.Point1(5.0,4
		.0),new com.SWE510.Point1(2.0,2.0),new com.SWE510.Point1(2.0,
		                                                                                                                                                                             -4.0));
		System.out.println(myPara.toString() + "\nhas an area of " + myPara.getArea());


		System.out.println("");		                                                                                                                                                                    -8.0));

		Square square1 = new Square(new com.SWE510.Point1(5.0,-5.0),new com.SWE510.Point1(5.0,5.0),new com.SWE510.Point1(-5.0,5.0),new com.SWE510.Point1(-5.0,-5.0));
		System.out.println(square1.toString() + "\nhas an area of " + square1.getArea());
*/  createCorners();
		}
	public static Trapezoid1 createCorners()
		{
		SecureRandom random = new SecureRandom();
		int num1x = random.nextInt(20)-10;
		System.out.printf("num1x: " + num1x);

		int num1y = random.nextInt(20)-10;
		System.out.printf("num1y: " + num1y);

		int num2x = num1x;
		System.out.printf("num2x: " + num2x);

		int num2y = (num1y + (random.nextInt(20)-10));
		System.out.printf("num2y: " + num2y);

		int num3x = ((random.nextInt(20)-10)-(num1x-1));
		System.out.printf("num3x: " + num3x);

		double num3y = random.nextInt(20)-10 + num2y;
		System.out.printf("num3y: " + num3y);

		int num4x = num3x;
		System.out.printf("num4x: " + num4x);
		int num4y = random.nextInt(20)-10 + num1y;
		System.out.printf("num4y: " + num4y);


		com.SWE510.Point1 corner1 = new com.SWE510.Point1(num1x, num1y);
		com.SWE510.Point1 corner2 = new com.SWE510.Point1(num2x, num2y);
		com.SWE510.Point1 corner3 = new com.SWE510.Point1(num3x, num3y);
		com.SWE510.Point1 corner4 = new com.SWE510.Point1(num4x, num4y);

		Trapezoid1 autoTrap = new Trapezoid1(corner1,corner2, corner3, corner4);
		return autoTrap;

		}
	}
