package Quadrilaterals;

/**Assign5Driver instantiates 4 objects of types trapezoid, parallelogram, rectangle, and square.
 * Each object is created with 4 specific x,y coordinates that represent the 4 corners of a shape.
 * The class, superclasses and area are displayed in the console.
 * Created by mb on 10/12/15.
 */
public class Assign5Driver
	{
	public static void main(String[] args)
		{

		Trapezoid trap = new Trapezoid(new Points(3.0,-1.0),new Points(3.0,1.0),new Points(-1.0,2.0),new Points(-1.0,-3.0));
		System.out.println(trap.toString() + "\nArea = " + trap.getArea() + "\n\n");


		Parallelogram myPara = new Parallelogram(new Points(5.0,-1.0),new Points(5.0,4.0),new Points(2.0,2.0),new Points(2.0,-4.0));
		System.out.println(myPara.toString() + "\nArea = " + myPara.getArea() + "\n\n");


		Rectangle rect = new Rectangle(new Points(5.0,-8.0),new Points(5.0,8.0),new Points(-2.0,8.0),new Points(-2.0,-8.0));
		System.out.println(rect.toString() + "\nArea = " + rect.getArea() + "\n\n");


		Square square1 = new Square(new Points(5.0,-5.0),new Points(5.0,5.0),new Points(-5.0,5.0),new Points(-5.0,-5.0));
		System.out.println(square1 + "\nArea = " + square1.getArea());

		}

	}
