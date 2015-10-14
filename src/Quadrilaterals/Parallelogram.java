package Quadrilaterals;

/**
 * Created by mb on 10/12/15.
 */
public class Parallelogram extends Quadrilateral
	{
	// constructors

	public  Parallelogram() {}


	public  Parallelogram(Points point1, Points point2, Points point3, Points point4)
		{
		super(point1, point2, point3, point4);
		}

	//@Override this after building a getArea() in Quadrilateral superclass
	public double getArea()
		{
		return getBase() * getHeight();
		}

	@Override
	public String toString()
		{
		return this.getClass() + ". " + getCorner1() + ", " + getCorner2() + ", " + getCorner3() + ", " + getCorner4();
		}
	}
