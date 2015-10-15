package Quadrilaterals;

/**
 * Created by mb on 10/12/15.
 */
public class Square extends Rectangle
	{
	public  Square(Points point1, Points point2, Points point3, Points point4)
		{
		super(point1, point2, point3, point4);
		}

	@Override

	public double getArea()
		{
		setBase();
		return getBase() * getBase();
		}

	/*@Override
	  public String toString()
		{

		return "This is a " + shapeOne + ".\n" +
				       shapeOne + " is a " + shapeTwo +
				       "-->" + ShapeThree + "-->" +
				       ShapeFour +
				       ".\nCorners: " +
				       getCorner1() + ", " + getCorner2() + ", " + getCorner3() + "," + "," + getCorner4();
		}
		*/
	}
