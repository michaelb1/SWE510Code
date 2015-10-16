package Quadrilaterals;

/**Square is a subclass of Rectangle. It uses Quadrilareal to construct
 * itself and it uses it's own method to calculate area.
 * Created by mb on 10/12/15.
 */
public class Square extends Rectangle
	{
	/**
	 * Instantiates a new Square.
	 *
	 * @param point1 the point 1
	 * @param point2 the point 2
	 * @param point3 the point 3
	 * @param point4 the point 4
	 */
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

	@Override
	  public String toString()
		{
		String shapeOne = this.getClass().getSimpleName();
		String shapeTwo = this.getClass().getSuperclass().getSimpleName();
		String shapeThree = this.getClass().getSuperclass().getSuperclass().getSimpleName();
		String shapeFour = this.getClass().getSuperclass().getSuperclass().getSuperclass().getSimpleName();
		String fourPoints = "Corners: " + getCorner1() + ", " + getCorner2() + ", " + getCorner3() + "," + getCorner4();
		return shapeOne + ", subclass of " + shapeTwo + "-->" + shapeThree + "-->" + shapeFour + "" +
				        ".\n" + fourPoints;
		//+ getCorner1() + ", " + getCorner2() + ", " + getCorner3() + "," + "," + getCorner4();

		}
}

