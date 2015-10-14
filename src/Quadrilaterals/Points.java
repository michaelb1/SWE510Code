package Quadrilaterals;

/**
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

	public void setx(double x)
		{
		this.x = x;
		}

	public void sety(double y)
		{
		this.y = y;
		}


	@Override
	public String toString()
		{
		return "(" + this.x + "," + this.y + ")";
		}
	}
