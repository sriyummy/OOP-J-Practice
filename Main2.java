/*Illustrate the execution of constructors in multi-level inheritance with three Java classes
plate(length, width), box(length, width, height), wood box (length, width, height, thick)
where box inherits from plate and woodbox inherits from box class. Each class has constructor
where dimensions are taken from user.*/

import java.util.Scanner;

class Plate
{
	float length, width;
	
	Plate(float l, float w)
	{
		length = l;
		width = w;
	}
	
	public void display()
	{
		System.out.println ("length: " + length + "\nwidth: " + width);
	}
}

class Box extends Plate
{
	float height;
	
	Box(float l, float w, float h)
	{
		super (l, w);
		height = h;
	}
	
	@Override
	public void display ()
	{
		System.out.println ("length: " + length + "\nwidth: " + width + "\nheight: " + height);
	}
}

class WoodBox extends Box
{
	float thick;
	
	WoodBox(float l, float b, float h, float t)
	{
		super (l, b, h);
		thick = t;
	}
	
	@Override
	public void display()
	{
		System.out.println ("length: " + length + "\nwidth: " + width + "\nheight: " + height + " \nthickness: " + thick);
	}
}

public class Main2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		float l,b,h,t;
		
		System.out.println ("Enter the length, width, height and thickness:");
		l = sc.nextFloat();
		b = sc.nextFloat();
		h = sc.nextFloat();
		t = sc.nextFloat();
		
		Plate plate = new Plate(l, b);
		plate.display();
		
		Box box = new Box(l, b, h);
		box.display();
		
		WoodBox wb = new WoodBox(l, b, h, t);
		wb.display();
	}
}