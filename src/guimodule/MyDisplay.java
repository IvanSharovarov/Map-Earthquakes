package guimodule;

import processing.core.PApplet;

public class MyDisplay extends PApplet {
	
	public void setup()
	{
		size(800, 700);
		background(62, 128, 255);
	}
	
	public void draw()
	{
		fill(0,0,0);
		ellipse(300, 300, 75, 75);
		ellipse(500, 300, 75, 75);
		
		noFill();
		arc(403, 320, 75, 75, 0, PI);
	}
	
}
