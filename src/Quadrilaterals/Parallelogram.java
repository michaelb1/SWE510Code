package Quadrilaterals;

/**
 * Created by mb on 10/12/15.
 */
public class Parallelogram extends Quadrilateral
	{

	public void Parallelogram()
		{
		this.corner1 = new Points();
		this.corner2 = new Points();
		this.corner3 = new Points();
		this.corner4 = new Points();
		}

	//build constructors to call is needed

	public void Parallelogram(Points point1, Points point2, Points point3, Points point4)
		{
		this.corner1 = point1;
		this.corner2 = point2;
		this.corner3 = point3;
		this.corner4 = point4;
		this.height = pointDistance(point2.getx(), point3.getx());
		this.topBase = pointDistance(point1.gety(), point2.gety());
		this.base = pointDistance(point3.gety(), point4.gety());
		this.area = calcArea();
		}

	public int calcArea()
		{
		return base * height;
		}

	@Override
	public String toString()
		{
		return this.getClass() + ". " + this.corner1 + ", " + this.corner2 + ", " + this.corner3+ ", " + this.corner4;
		}
	}
