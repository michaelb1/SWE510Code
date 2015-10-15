package Quadrilaterals;

/**Rectangle is a subclass of Parallelogram and a superclass of Square. It uses Quadrilareal to contruct
 * itself and it uses Parallogram to caluclate area.
 * Created by mb on 10/12/15.
 */
public class Rectangle extends Parallelogram
	{

	/**
	 * Instantiates a new Rectangle.
	 *
	 * @param point1 the point 1
	 * @param point2 the point 2
	 * @param point3 the point 3
	 * @param point4 the point 4
	 */
	public  Rectangle(Points point1, Points point2, Points point3, Points point4)
		{
		super(point1, point2, point3, point4);
		}

	@Override
	public String toString()
		{
		String shapeOne = this.getClass().getSimpleName();
		String shapeTwo = this.getClass().getSuperclass().getSimpleName();
		String shapeThree = this.getClass().getSuperclass().getSuperclass().getSimpleName();
		String fourPoints = "Corners: " + getCorner1() + ", " + getCorner2() + ", " + getCorner3() + "," + "," + getCorner4();
		return  shapeOne + ", subclass of " + shapeTwo + "-->" + shapeThree +
				        ".\nCorners: "
				        + getCorner1() + ", " + getCorner2() + ", " + getCorner3() + "," + "," + getCorner4();

		}
}

