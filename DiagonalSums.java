import java.util.Scanner;

public class DiagonalSums
{

    public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3x3 matrix elements (row-wise):");
        int[][] matrix = new int[3][3];

        for (int i = 0; i < 3; i++)
		{
            for (int j = 0; j < 3; j++)
			{
                matrix[i][j] = scanner.nextInt();
            }
        }

        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int i = 0; i < 3; i++)
		{
            primaryDiagonalSum += matrix[i][i];
        }

        for (int i = 0; i < 3; i++)
		{
            secondaryDiagonalSum += matrix[i][2 - i];
        }

        System.out.println("Primary Diagonal Sum: " + primaryDiagonalSum);
        System.out.println("Secondary Diagonal Sum: " + secondaryDiagonalSum);
    }
}
