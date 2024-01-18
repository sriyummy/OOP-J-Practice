import java.util.Scanner;
class DayDecider
{
    public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in); 
        byte date;

        System.out.println("Enter the date (1-31): ");
        date = sc.nextByte();
        
		switch (date % 7)
		{
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 0:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid date");
        }
    }
}