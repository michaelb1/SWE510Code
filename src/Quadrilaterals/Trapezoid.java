package Quadrilaterals;
/**
 * Created by mb on 10/12/15.
 */
public class Trapezoid extends Quadrilateral
	{

	public Trapezoid(){}

	//build constructors to call is needed

	public Trapezoid(Points point1, Points point2, Points point3, Points point4)
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


	}
