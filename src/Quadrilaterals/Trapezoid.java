package Quadrilaterals;
/**Trapezoid is a subclass of Quadrilateral. It uses Quadrilareal to contruct
 * itself and has a method to calculate the area of an instance that relies on
 * properites within Quadrilateral.
 * Created by mb on 10/12/15.
 */
public class Trapezoid extends Quadrilateral
	{

	public Trapezoid(){}

	public Trapezoid(Points point1, Points point2, Points point3, Points point4)
		{
		super(point1, point2, point3, point4);
		}

	public double getArea()
		{
			setTopBase();
			setBase();
			setHeight();
		 return ((getTopBase() + getBase()) / 2) * getHeight();
		}
	}
