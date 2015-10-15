package Quadrilaterals;

/**
 * Created by mb on 10/12/15.
 */
public class Rectangle extends Parallelogram
	{
	String name = "Rectangle";

	public  Rectangle(Points point1, Points point2, Points point3, Points point4)
		{
		super(point1, point2, point3, point4);
		}

	/*@Override
	public String toString()
		{
		return  "this is Rectangle class.\nName: " + name  + ".\nThis is this.Name: "+
				        this.name  + ".\nThis is super.getName(): " + super.getName()  + "" +
				         ".\nThis is" + " getClass(): " + getClass() + ".\nThis is this" +
				        ".\nname: " + name + "\n" +  getCorner1() + ", " + getCorner2() + ", " + getCorner3() + ", " +
				                                          getCorner4();
	@Override
	public String toString()
	{
		return getClass().getSuperclass() + ".\nName:  " + name + ".\nCorners: " + getCorner1() + ", " +
				       getCorner2() +
				       ", " +
				       getCorner3() + "," +
				       " " +
				       getCorner4();
	}*/
}

