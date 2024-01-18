import java.util.Scanner;

class Palindrome
{
    public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);
        int num, reversed = 0, remainder;

        System.out.println("Enter a number to test whether it's a palindrome or not: ");
        num = sc.nextInt();

        int originalNum = num;

        while (num != 0)
		{
            remainder = num % 10;
            reversed = reversed * 10 + remainder;
            num /= 10;
        }

        if (originalNum == reversed)
		{
            System.out.println("Palindrome!");
        }
		else
		{
            System.out.println("Not Palindrome!");
        }
    }
}
