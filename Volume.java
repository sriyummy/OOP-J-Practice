import java.util.Scanner;

class Box
{
	float length, breadth, height;
	
	public Box(float l, float b, float h)
	{
		length = l;
		breadth = b;
		height = h;
	}
	
	public float volume()
	{
		return length*breadth*height;
	}
}

class Volume
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println ("Enter the length of the box: ");
		float length = sc.nextFloat();
		System.out.println ("Enter the breadth of the box: ");
		float breadth = sc.nextFloat();
		System.out.println ("Enter the height of the box: ");
		float height = sc.nextFloat();
		
		Box paraBox = new Box(length, breadth, height);
		float boxVol = paraBox.volume();
		
		System.out.println ("The volume of the box is: " + boxVol);
		
		sc.close();
	}
}