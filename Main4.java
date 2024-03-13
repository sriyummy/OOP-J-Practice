/*Define an interface Emploee with a method getDetails() to get emplyee details
as Empid and Ename. Also define a derived interface Manager with a method
getDeptDetails() to get department details such as Deptid and Deptname. Then
define a class Head which implements Manager interface and also prints all
details of the employee. Write the complete program to display all details of
one head of the department.*/

import java.util.Scanner;

interface Employee
{
    void getDetails(int emp_id, String e_name);
}

interface Manager extends Employee
{
    void getDeptDetails(int dept_id, String dept_name);
}

class Head implements Manager
{
    Scanner sc = new Scanner(System.in);
    private int emp_id;
    private String e_name;
    private int dept_id;
    private String dept_name;

    @Override
    public void getDetails(int emp_id, String e_name)
	{
        System.out.println("Enter employee ID: ");
        this.emp_id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter employee name: ");
        this.e_name = sc.nextLine();
    }

    @Override
    public void getDeptDetails(int dept_id, String dept_name)
	{
        System.out.println("Enter department ID: ");
        this.dept_id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter department name: ");
        this.dept_name = sc.nextLine();
    }

    public void closeScanner()
	{
        sc.close();
    }

    public int getEmpId()
	{
        return emp_id;
    }

    public String getEmpName()
	{
        return e_name;
    }

    public int getDeptId()
	{
        return dept_id;
    }

    public String getDeptName()
	{
        return dept_name;
    }
}

public class Main4
{
    public static void main(String args[])
	{
        Head h1 = new Head();

        h1.getDetails(0, "");
		h1.getDeptDetails(0, "");
		
        System.out.println("Details of head of department: ");
        System.out.println("Employee Name: " + h1.getEmpName());
        System.out.println("Employee ID: " + h1.getEmpId());
        System.out.println("Department Name: " + h1.getDeptName());
        System.out.println("Department ID: " + h1.getDeptId());

        h1.closeScanner();
    }
}
