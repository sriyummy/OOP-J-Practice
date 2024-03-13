import java.util.Scanner;

interface Salary
{
  float earnings(float basic);
  float deductions(float basic);
  float bonus(float basic);
}

abstract class Manager implements Salary
{
  @Override
  public float earnings(float basic)
  {
	return (basic+(0.8f*basic)+(0.15f*basic));
  }

  @Override
  public float deductions(float basic)
  {
    
	return 0.12f*basic;
  }
  
  public abstract float bonus(float basic);
}

class Substaff extends Manager
{
  @Override
  public float bonus(float basic)
  {
    return 0.5f*basic;
  }
}

public class Main3
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter basic salary: ");
    float basicSalary = sc.nextFloat();

    Substaff staff = new Substaff();

    float earnings = staff.earnings(basicSalary);
    float deductions = staff.deductions(basicSalary);
    float bonus = staff.bonus(basicSalary);

    System.out.println("Earnings: Rs" + earnings);
    System.out.println("Deductions: Rs" + deductions);
    System.out.println("Bonus: Rs" + bonus);
    System.out.println("Net Salary:Rs" + (earnings - deductions + bonus));

    sc.close();
  }
}