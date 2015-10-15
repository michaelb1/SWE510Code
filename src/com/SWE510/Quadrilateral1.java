package com.SWE510;

/**
 * Created by mb on 10/12/15.
 */

public class Quadrilateral1
	{

	private Point1 corner1;
	private Point1 corner2;
	private Point1 corner3;
	private Point1 corner4;
	private double base;
	private double topBase;
	private double height;


	//build constructors to initiate fields
	public Quadrilateral1 (){}

	public Quadrilateral1(Point1 point1, Point1 point2, Point1 point3,Point1 point4)
		{
		this.corner1 = point1;
		this.corner2 = point2;
		this.corner3 = point3;
		this.corner4 = point4;
		}

	//methods to assign values to base, top side, and height of shape to be used to determing area.
	// calculates distance between the two points.


	public double pointDistance(double pt1, double pt2)
		{
		if (((pt1 > 0) && (pt2 > 0)) || ((pt1 < 0) && (pt2 < 0)))
		{
			return Math.abs(Math.max(pt1, pt2) - Math.min(pt1, pt2));
		}
		else //if (((pt1 > 0) || (pt2 > 0)) && ((pt1 < 0) || (pt2 < 0)))
		{
			return Math.abs(pt1) + Math.abs(pt2);
		}
		}

	@Override
	public String toString()
		{
		return this.corner1 + ", " + this.corner2 + ", " +this.corner3+ ", " + this.corner4;
		}

	public Point1 getCorner1()
		{
		return corner1;
		}



	public Point1 getCorner2()
		{
		return corner2;
		}


	public Point1 getCorner3()
		{
		return corner3;
		}

	public Point1 getCorner4()
		{
		return corner4;
		}

	public double getBase()
		{
		return base;
		}

	public void setBase()
		{
		Point1 corner3 = getCorner3();
		Point1 corner4 = getCorner4();
		base = pointDistance(corner3.gety(), corner4.gety());
		}

	public double getTopBase()
		{
		return topBase;
		}

	public void setTopBase()
		{
		Point1 corner1 = getCorner1();
		Point1 corner2 = getCorner2();
		topBase = pointDistance(corner1.gety(), corner2.gety());
		}

	public double getHeight()
		{
		return height;
		}

	public void setHeight()
		{
		Point1 corner2 = getCorner2();
		Point1 corner3 = getCorner3();
		height = pointDistance(corner2.getx(), corner3.getx());
		}


	}
