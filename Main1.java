/*A Plastic manufacturer sells plastic in different shapes like TwoD sheet and ThreeD box. The cost
of sheet is Rs 40/ per square ft. and the cost of box is Rs 60/ per cubic ft. Implement it in
Java to calculate the cost of plastic as per the dimensions given by the user where ThreeD inherits
from TwoD.*/

import java.util.Scanner;

class TwoD
{
	float length, breadth;
	
	TwoD(float length, float breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	
	public void calculateCost()
	{
		float cost = length*breadth*40;
		System.out.println (cost);
	}
}

class ThreeD extends TwoD
{
	float height;
	
	ThreeD(float l, float b, float h)
	{
		super(l, b);
		height = h;
	}
	
	@Override
	public void calculateCost()
	{
		float cost = length*breadth*height*60;
		System.out.println (cost);
	}
}

public class Main1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int ch;
		float l, b, h;
		
		System.out.println ("Enter 1 for sheet and 2 for box: ");
		ch = sc.nextInt();
		
		switch(ch)
		{
			case 1:
				System.out.println ("Enter the length and breadth of the sheet: ");
				l = sc.nextFloat();
				b = sc.nextFloat();
				TwoD twoD = new TwoD(l, b);
				twoD.calculateCost();				
				break;
			case 2:
				System.out.println ("Enter the length, breadth and height of the box: ");
				l = sc.nextFloat();
				b = sc.nextFloat();
				h = sc.nextFloat();
				ThreeD threeD = new ThreeD(l, b, h);
				threeD.calculateCost();
				break;
			default:
				System.out.println ("Please enter the valid input!");
		}
	}
}