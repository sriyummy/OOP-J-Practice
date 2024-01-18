import java.util.Scanner;
class grades
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float marks;
		char grade='F';
		
		System.out.println ("Enter the marks: ");
		marks = sc.nextFloat();
		
		if (marks<=100 && marks >=90)
		{
			grade = 'O';
		}
		else if (marks<90 && marks >=80)
		{
			grade = 'E';
		}
		else if (marks<80 && marks>=70)
		{
			grade = 'A';
		}
		else if (marks<70 && marks >=60)
		{
			grade = 'B';
		}
		else if (marks<60 && marks >=50)
		{
			grade = 'C';
		}
		else if (marks<50 && marks >=40)
		{
			grade = 'D';
		}
		else
		{
			System.out.println ("Fail");
		}
		System.out.println ("Grade is: " + grade);
	}
}