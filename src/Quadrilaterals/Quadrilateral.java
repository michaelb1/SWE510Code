package Quadrilaterals;


/**
 * Created by mb on 10/12/15.
 */
public class Quadrilateral
	{
	protected Points corner1;
	protected Points corner2;
	protected Points corner3;
	protected Points corner4;
	protected int base;
	protected int topBase;
	protected int height;
	protected int area;

	public void Quadrilateral()
		{
		this.corner1 = new Points();
		this.corner2 = new Points();
		this.corner3 = new Points();
		this.corner4 = new Points();
		}

	//build constructors to initiate fields

	public void Quadrilateral(Points point1, Points point2, Points point3, Points point4)
		{
		this.corner1 = point1;
		this.corner2 = point2;
		this.corner3 = point3;
		this.corner4 = point4;
		this.height = pointDistance(point2.getx(), point3.getx());
		this.topBase = pointDistance(point1.gety(), point2.gety());
		this.base = pointDistance(point3.gety(), point4.gety());
		}

	//methods to assign values to base, top side, and height of shape to be used to determing area.
	// calculates distance between the two points.


	public int pointDistance(int pt1, int pt2)
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
	}