package com.SWE510;

/**
 * Created by mb on 10/22/15. Employee subclass Pieceworker represents an employee whose
 * pay is based on the number of pieces of merchandise produced.
 */
public class PieceWorker extends Employee
	{


	private double wage;
	private int pieces;

	//constructor
	public PieceWorker(String fName, String lName, String ss, double wage, int pieces)
		{
		super(fName, lName, ss);

		if (wage <= 0.0) // validate
			throw new IllegalArgumentException("Wage must be more than $0.00 per piece.");

		if (pieces < 0.0) // validate
			throw new IllegalArgumentException("Must have produced at least 1 piece of merchandise.");

		this.wage = wage;
		this.pieces = pieces;
		}

	// calculate earnings; override abstract method earnings in Employee
	@Override
	public double earnings()
		{
		return getWage() * getPieces();
		}

	// return String representation of PieceWorker object
	@Override
	public String toString()
		{  //mod text coming from Employee toString method to then add on data about pieces and wages
		return String.format("%s: %s%n%s:%s%n%s:$%.2f ",
		                     "PieceWorker employee", super.toString(),
		                     "Pieces produced", getPieces(),
		                     "Wage per piece", getWage());
		}

	public double getWage()
		{
		return wage;
		}

	public int getPieces()
		{
		return pieces;
		}
	}
