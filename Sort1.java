import java.util.Scanner;

class Sort1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();

		int[] arr = new int[size];
		for (int i = 0; i < size; i++)
		{
			System.out.println("Element number " + i + " is: ");
			arr[i] = sc.nextInt();
		}

		sort_Array(arr, size);
	}

	public static void sort_Array(int[] array, int size)
	{
		int temp;
		for (int j = 0; j < size; j++)
		{
			for (int k = j + 1; k < size; k++)
			{
				if (array[k] < array[j])
				{
					temp = array[j];
					array[j] = array[k];
					array[k] = temp;
				}
			}
		}
		for (int i = 0; i < size; i++)
		{
			System.out.println(array[i]);
		}
	}
}
