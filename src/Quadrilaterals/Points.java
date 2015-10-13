package Quadrilaterals;

/**
 * Created by mb on 10/12/15.
 */
public class Points
	{
	private int x;
	private int y;

	public Points()
		{
		}

	public Points(int x, int y)
		{
		this.x = x;
		this.y = y;
		}

	public int gety()
		{
		return y;
		}

	public int getx()
		{
		return x;
		}

	public void setx(int x)
		{
		this.x = x;
		}

	public void sety(int y)
		{
		this.y = y;
		}


	@Override
	public String toString()
		{
		return "(" + this.x + "," + this.y + ")";
		}
	}
