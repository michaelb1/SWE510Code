package Quadrilaterals;

/**
 * Created by mb on 10/12/15.
 */

public class Quadrilateral
	{
	private Points corner1;
	private Points corner2;
	private Points corner3;
	private Points corner4;
	private double base;
	private double topBase;
	private double height;
	public Quadrilateral()
		{
		this.corner1 = new Points();
		this.corner2 = new Points();
		this.corner3 = new Points();
		this.corner4 = new Points();

		}

	//build constructors to initiate fields

	public Quadrilateral(Points point1, Points point2, Points point3, Points point4)
		{
		this.corner1 = point1;
		this.corner2 = point2;
		this.corner3 = point3;
		this.corner4 = point4;
		}

	//methods to assign values to base, top side, and height of shape to be used to determing area.

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


	/*@Override
	public String toString()
		{
		return this.corner1 + ", " + this.corner2 + ", " +this.corner3+ ", " + this.corner4;
		}*/

	public Points getCorner1()
		{
		return corner1;
		}

	public Points getCorner2()
		{
		return corner2;
		}

	public Points getCorner3()
		{
		return corner3;
		}

	public Points getCorner4()
		{
		return corner4;
		}

	public double getBase()
		{
		return base;
		}

	public double getTopBase()
		{
		return topBase;
		}

	public double getHeight()
		{
		return height;
		}

	public void setBase()
		{
		Points corner3 = getCorner3();
		Points corner4 = getCorner4();
		base = pointDistance(corner3.gety(), corner4.gety());
		}

	public void setTopBase()
		{
		Points corner1 = getCorner1();
		Points corner2 = getCorner2();
		topBase = pointDistance(corner1.gety(), corner2.gety());
		}

	public void setHeight()
		{
		Points corner2 = getCorner2();
		Points corner3 = getCorner3();
		height = pointDistance(corner2.getx(), corner3.getx());
		}

	@Override
	public String toString()
		{
		String shapeOne = this.getClass().getSimpleName();
		String shapeTwo = this.getClass().getSuperclass().getSimpleName();
		//String ShapeThree = this.getClass().getSuperclass().getSuperclass().getSimpleName();
		//String ShapeFour = this.getClass().getSuperclass().getSuperclass().getSuperclass().getSimpleName();

		return  shapeOne + " class. Subclass of " + shapeTwo + ".\n" +
				       "Corners: " + getCorner1() + ", " + getCorner2() + ", " + getCorner3() + "," + "," + getCorner4();
		}
	// calculates distance between the two points.



	}