import java.util.Scanner;

class Shape
{
	public double area(double radius)
	{
        return Math.PI * radius * radius;
    }

    public double area(double base, double height)
	{
        return 0.5 * base * height;
    }

    public double area(double side)
	{
        return side * side;
    }
}

public class OverloadedArea
{
    public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);
        Shape shape = new Shape();

        System.out.println("Enter your choice:");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Square");

        int choice = scanner.nextInt();

        switch (choice)
		{
            case 1:
                System.out.print("Enter radius of circle: ");
                double radius = scanner.nextDouble();
                double circleArea = shape.area(radius);
                System.out.println("Area of circle: " + circleArea);
                break;

            case 2:
                System.out.print("Enter base of triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter height of triangle: ");
                double height = scanner.nextDouble();
                double triangleArea = shape.area(base, height);
                System.out.println("Area of triangle: " + triangleArea);
                break;

            case 3:
                System.out.print("Enter side of square: ");
                double side = scanner.nextDouble();
                double squareArea = shape.area(side);
                System.out.println("Area of square: " + squareArea);
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }
}
