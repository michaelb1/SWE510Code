package com.SWE510;

/**
 * Created by mb on 10/15/15.
 */
public class Point1
{
	private double x;
	private double y;

	public Point1(){}

	public Point1(double x, double y)
		{
		this.x = x;
		this.y = y;
		}

	public double gety()
		{
		return y;
		}

	public double getx()
		{
		return x;
		}

	public void setx(double x)
		{
		this.x = x;
		}

	public void sety(double y)
		{
		this.y = y;
		}


	@Override
	public String toString()
		{
		return "(" + this.x + "," + this.y + ")";
		}
	}
