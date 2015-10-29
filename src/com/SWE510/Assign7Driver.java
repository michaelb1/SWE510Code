package com.SWE510;

/**
 * Created by mb on 10/22/15.
 *This driver class creates data about 1 employee from each type (subclass) of
 * Employee including the newly created PieceWorker type. It stores this data in an array and then prints out each
 * employee's information to the console.
 */
public class Assign7Driver
	{

	public static void main(String[] args)
		{
		// Instantiate concrete Employee subclass objects
		SalariedEmployee salariedEmp = new SalariedEmployee("Walter", "White", "123-45-6789", 1000.00);

		HourlyEmployee hourlyEmp = new HourlyEmployee("Emma", "Watson", "987-65-4321", 7.75, 40);

		CommissionEmployee commissionEmp = new CommissionEmployee("Earnest", "Hemingway", "333-33-3333", 200000, .06);

		BasePlusCommissionEmployee baseplusCommEmp = new BasePlusCommissionEmployee("Henry", "Kissinger",
            "444-44-4444", 1000, .02, 500);

		PieceWorker pieceEmp = new PieceWorker("Venus", "Williams", "555-55-5555", 50.00, 25);


		Employee[] employees = new Employee[5];
		//superclass array holding references to subclass objects
		employees[0] = salariedEmp;
		employees[1] = hourlyEmp;
		employees[2] = commissionEmp;
		employees[3] = baseplusCommEmp;
		employees[4] = pieceEmp;

		//loop to go through superclass array and run specific subclass methods for each
		for (Employee currentEmployee : employees)
		{
			// call each array elements subclass toString
			System.out.println(currentEmployee);
			//add on earnings
			System.out.printf("Earnings: $%.2f%n%n", currentEmployee.earnings());
		}

		}
	}
