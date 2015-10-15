package Quadrilaterals;

/**
 * Parallelogram is a subclass of Quadrilateral and a superclass of Rectangle and Square
 * It uses Quadrilareal to contruct
 * itself and has a method to calculate the area of an instance that relies on
 * properites within Quadrilateral.
 */
public class Parallelogram extends Quadrilateral
	{

	/**
	 * Instantiates a new Parallelogram.
	 */
	public  Parallelogram(){};

	/**
	 * Instantiates a new Parallelogram.
	 *
	 * @param point1 the point 1
	 * @param point2 the point 2
	 * @param point3 the point 3
	 * @param point4 the point 4
	 */
	public  Parallelogram(Points point1, Points point2, Points point3, Points point4)
		{
		super(point1, point2, point3, point4);
		}


	public double getArea()
		{
		setBase();
		setHeight();
		return getBase() * getHeight();
		}

	}
