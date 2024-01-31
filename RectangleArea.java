import java.util.Scanner;

class Rectangle
{
    int length;
    int breadth;

	Rectangle()
	{
        length = 0;
        breadth = 0;
    }

    Rectangle(int l, int b)
	{
        length = l;
        breadth = b;
    }

    int calculateArea()
	{
        return length * breadth;
    }
}

public class RectangleArea
{
    public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you want to enter dimensions (y/n): ");
        char choice = scanner.next().charAt(0);

        if (choice == 'y' || choice == 'Y')
		{
            System.out.print("Enter length: ");
            int length = scanner.nextInt();
            System.out.print("Enter breadth: ");
            int breadth = scanner.nextInt();
            Rectangle rectangle = new Rectangle(length, breadth);
        }
		else
		{
            Rectangle rectangle = new Rectangle();
        }

        int area = rectangle.calculateArea();
        System.out.println("Area of rectangle: " + area);
    }
}