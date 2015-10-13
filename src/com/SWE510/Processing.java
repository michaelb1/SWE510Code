package com.SWE510;

/**
 * Created by mb on 10/13/15.
 */
public class Processing
	{
	public static void main(String[] args)
		{
		void setup() {
			size(400, 400);
			stroke(255);
			background(192, 64, 0);
		}

		void draw() {
			line(150, 25, mouseX, mouseY);
		}
		}
	}
