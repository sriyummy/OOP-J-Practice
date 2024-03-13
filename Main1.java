/*Illustrate the usage of abstract class with following Java classes - 
An abstract class 'student' with two data members roll no, reg no, a method getinput()
and an abstract method course() 
A subclass 'kiitian' with course() method implementation 
Write the driver class to print the all details of a kiitian object.*/

import java.util.Scanner;

abstract class Student
{
	protected int roll_no, reg_no;
	
	public void getInput(int ro_no, int re_no)
	{
		roll_no = ro_no;
		reg_no = re_no;
	}

	public abstract String course();
}

class Kiitian extends Student
{
	@Override
	public String course()
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println ("Enter course name: ");
		String cs = sc.nextLine();
		
		return cs;
	}
}

class Main1
{
	public static void main (String args[])
	{
		Kiitian kiit1 = new Kiitian();
		int roll, reg;
		
		Scanner sd = new Scanner (System.in);
		
		System.out.println ("Enter the roll number and the registration number: ");
		roll = sd.nextInt();
		reg = sd.nextInt();
		
		kiit1.getInput(roll, reg);
		kiit1.course();
		
		System.out.println ("Roll Number: " + kiit1.roll_no);
		System.out.println ("Registration Number: " + kiit1.reg_no);
		System.out.println ("Course Name: " + kiit1.course());
	}
}