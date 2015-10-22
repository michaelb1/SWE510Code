package com.SWE510;

/**
 * Created by mb on 10/22/15.
 * * include an additional employee subclass Pieceworker that represents an employee whose
 * pay is based on the number of pieces of merchandise produced.
 Pieceworker should contain private instance variables
 -'wage' (to store wage per piece)
 -'pieces' to store number of pieces produced.
 -Provide concrete implementation of of method 'earnings' in Pieceworker that calcs employee earnings by multiplying
 pieces produced by wage per piece.
 -create an array of 'Employee' variables to store references to objects of each concrete class in new 'Employee' hierarchy.
 -for each 'Employee' display its String representation and earning.
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
		{
		return String.format("%s: %s%n%s:%s; %s: $%.2f ",
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