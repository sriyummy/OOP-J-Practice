import java.util.Scanner;

class Student
{
   int roll;
   String name;
   double cgpa;

   public Student(int roll, String name, double cgpa)
   {
       this.roll = roll;
       this.name = name;
       this.cgpa = cgpa;
   }

   public void displayDetails()
   {
       System.out.println("Roll: " + roll + ", Name: " + name + ", CGPA: " + cgpa);
   }
}

public class StudentDetails
{
   public static void main(String[] args)
   {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Enter the number of students: ");
       int numStudents = scanner.nextInt();

       Student[] students = new Student[numStudents];

       for (int i = 0; i < numStudents; i++)
	   {
           System.out.println("\nEnter details for student " + (i + 1) + ":");
           System.out.print("Roll: ");
           int roll = scanner.nextInt();
           scanner.nextLine();
           System.out.print("Name: ");
           String name = scanner.nextLine();
           System.out.print("CGPA: ");
           double cgpa = scanner.nextDouble();

           students[i] = new Student(roll, name, cgpa);
       }

       System.out.println("\nStudent Details:");
       Student lowestCGPAStudent = students[0];
       for (Student student : students)
	   {
           student.displayDetails();

           if (student.cgpa < lowestCGPAStudent.cgpa)
		   {
               lowestCGPAStudent = student;
           }
       }

       System.out.println("\nStudent with the lowest CGPA:");
       lowestCGPAStudent.displayDetails();
   }
}
