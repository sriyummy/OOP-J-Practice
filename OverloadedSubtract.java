class Calculator
{
    public int subtract(int x, int y)
	{
        return x - y;
    }

	public double subtract(double x, double y)
	{
        return x - y;
    }

    public int subtract(int x, int y, int z)
	{
        return x - y - z;
    }

	public double subtract(double x, int y)
	{
        return x - y;
    }

    public double subtract(int x, double y)
	{
        return x - y;
    }
}

public class OverloadedSubtract
{
    public static void main(String[] args)
	{
        Calculator calc = new Calculator();

		int result1 = calc.subtract(10, 5);
        double result2 = calc.subtract(12.5, 3.2);
        int result3 = calc.subtract(20, 10, 5);
        double result4 = calc.subtract(15.5, 2);
        double result5 = calc.subtract(10, 4.5);

        System.out.println("Integer subtraction: " + result1);
        System.out.println("Double subtraction: " + result2);
        System.out.println("Integer subtraction (three numbers): " + result3);
        System.out.println("Double minus integer: " + result4);
        System.out.println("Integer minus double: " + result5);
    }
}
