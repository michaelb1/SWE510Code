package com.SWE510;

/**
 * Created by mb on 10/1/15.
 */
public class testStringEquality
	{
	public static void main(String[] args)
		{
		String foo1 = "xyz";
		String foo2 = "xyz";

		String foo3 = new String("xyz");
		String foo4 = new String("xyz");

		if (foo1 == foo2){
			System.out.println("When\nString foo1 = \"xyz\";\nString foo2 = \"xyz\";\n\"xyx\" == \"xyz\"\n");
		}


		if (foo3 != foo4){
			System.out.println("When\nString foo3 = new String(\"xyz\");\nString foo4 = new String(\"xyz\");\n" +
					                   "\"xyx\" != \"xyz\" because they reference different String objects");
		}
		}
	}
