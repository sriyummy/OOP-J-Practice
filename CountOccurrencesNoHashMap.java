import java.util.Scanner;

public class CountOccurrencesNoHashMap
{

    public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers (separated by spaces): ");
        String input = scanner.nextLine();

        String[] numbersStr = input.split(" ");
        int[] numbers = new int[numbersStr.length];
		
        for (int i = 0; i < numbersStr.length; i++)
		{
            numbers[i] = Integer.parseInt(numbersStr[i]);
        }

        int maxNum = Integer.MIN_VALUE;
        for (int number : numbers)
		{
            maxNum = Math.max(maxNum, number);
        }

        int[] occurrences = new int[maxNum + 1];

        for (int number : numbers)
		{
            occurrences[number]++;
        }

        System.out.println("Occurrences:");
        for (int i = 0; i <= maxNum; i++)
		{
            if (occurrences[i] > 0)
			{
                System.out.println(i + ": " + occurrences[i]);
            }
        }
    }
}
