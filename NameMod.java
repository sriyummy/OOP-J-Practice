import java.util.Scanner;

public class NameMod
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter last name: ");
        String lastName = sc.nextLine();

        System.out.println("Changed name " + lastName + " " + firstName);
    }
}
