package com.SWE510;

/**
 * Created by mb on 10/12/15.
 */
public class Trapezoid1 extends Quadrilateral1
	{

	public Trapezoid1(){}

	//build constructors to call is needed

	public Trapezoid1(Point1 point1,Point1 point2,Point1 point3,Point1 point4)
		{
		super(point1, point2, point3, point4);
		}
	//@Override this after building a getArea() in Quadrilateral superclass
	public double getArea()
		{
		setTopBase();
		setBase();
		setHeight();
		return ((getTopBase() + getBase()) / 2) * getHeight();
		}

	@Override
	public String toString()
		{
		return this.getClass() + ": " + getCorner1() + ", " + getCorner2() + ", " + getCorner3() + ", " + getCorner4();
		}



	}

