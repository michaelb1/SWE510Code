package com.SWE510;

/**
 * Michael Brashier. 15/Sept/2015
 * SWE 510 GMU Fall Semester 2015
 * HW-2 Implement a Java Class called Gas and GasDriver
 * to calculate miles per gallon based on user input
 */
public class Gas
    {

    /**
     * private variables to be used by the getter and setters below.
     */
    private double tripMiles; //instance variable

    //private double tripGallons;
    private double mpg;


    /**
     * Instantiates a new Gas. This is redundant since the compiler will create a default constructor when called by
     * new instance of this object.
     */
    public Gas()
        {

        }


    /**
     * Sets miles.
     * set method to set wih user input of number of miles driven.
     * @param miles the miles
     */
    public void setMiles(double miles) {

            this.tripMiles = miles;

        }


    /**
     * Set gals.
     *set method to set wih user input of number of gallons used.
     * @param gals the gals
     */
    public void setGals(double gals){

            //this.tripGallons = gals;
            this.mpg = tripMiles/gals;

        }


    /**
     * Gets mPG.
     * get method to get calculate mpg and return to caller.
     * @return the mPG
     */
    public double getMPG() {

    return mpg;
          }

    }
