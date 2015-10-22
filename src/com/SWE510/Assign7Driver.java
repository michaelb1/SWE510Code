package com.SWE510;

/**
 * Created by mb on 10/22/15.
 * include an additional employee subclass Pieceworker that represents an employee whose
 * pay is based on the number of pieces of merchandise produced.
 * Pieceworker should contain private instance variables
 * -'wage' (to store wage per piece)
 * -'pieces' to store number of pieces produced.
 * -Provide concrete implementation of of method 'earnings' in Pieceworker that calcs employee earnings by multiplying
 * pieces produced by wage per piece.
 * -create an array of 'Employee' variables to store references to objects of each concrete class in new 'Employee' hierarchy.
 * -for each 'Employee' display its String representation and earning.
 */
public class Assign7Driver
	{

	public static void main(String[] args)
		{
		// Instantiate concrete Employee subclass objects
		SalariedEmployee salariedEmp = new SalariedEmployee("Walter", "White", "111-11-1111", 1000.00);

		HourlyEmployee hourlyEmp = new HourlyEmployee("Emma", "Watson", "222-22-2222", 7.75, 40);

		CommissionEmployee commissionEmp = new CommissionEmployee("Earnest", "Hemingway", "333-33-3333", 200000, .06);

		BasePlusCommissionEmployee baseplusCommEmp = new BasePlusCommissionEmployee("Henry", "Kissinger",
            "444-44-4444", 1000, .02, 500);

		PieceWorker pieceEmp = new PieceWorker("Venus", "Williams", "555-55-5555", 50.00, 25);


		Employee[] employees = new Employee[5];
		//superclass array holding subclass objects
		employees[0] = salariedEmp;
		employees[1] = hourlyEmp;
		employees[2] = commissionEmp;
		employees[3] = baseplusCommEmp;
		employees[4] = pieceEmp;

		//loop to go through superclass array and run subclass methods depending on
		//object
		for (Employee currentEmployee : employees)
		{
			System.out.println(currentEmployee); // call each array elements subclass toString
			//add on earnings
			System.out.printf("Earnings: $%.2f%n%n", currentEmployee.earnings());
		}

		}
	}
