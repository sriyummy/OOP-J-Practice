import java.util.Scanner;

class Rectangle
{
	float length, breadth;
	
	public void read()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println ("Enter the length and breadth of the rectangle: ");
		length = sc.nextFloat();
		breadth = sc.nextFloat();
		
		sc.close();
	}
	
	public void calculate()
	{
		float area = length*breadth;
		float perimeter = 2.0f*(length+breadth);
		
		display (area, perimeter);
	}
	
	public void display(float ar, float peri)
	{
		System.out.println ("Area of the rectangle = " + ar);
		System.out.println ("Perimeter of the rectangle = " + peri); 
	}
}

class DisplayRectangle
{
	public static void main(String[] args)
	{
		Rectangle rect = new Rectangle();
		rect.read();
		rect.calculate();
	}
}