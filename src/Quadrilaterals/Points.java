package Quadrilaterals;

/**Points is used to represent the four points in each shape that are created as part of the instances of Quadrilateral
 * subclasses.
 * Created by mb on 10/12/15.
 */
public class Points
	{
	private double x;
	private double y;

	public Points(){}

	public Points(double x, double y)
		{
		this.x = x;
		this.y = y;
		}

	public double gety()
		{
		return y;
		}

	public double getx()
		{
		return x;
		}

	@Override
	public String toString()
		{
		return "(" + this.x + "," + this.y + ")";
		}
	}
