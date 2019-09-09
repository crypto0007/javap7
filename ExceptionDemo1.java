import java.util.*;
class Student
{
	String uname;
	int sem;
	public void getData()
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter user name:");
			uname=sc.nextLine();
			System.out.println("Enter sem:");
			sem=sc.nextInt();

		}
		catch(NumberFormatException ne)
		{
			System.out.println(ne.toString());
		}
		catch(InputMismatchException ie)
		{
			System.out.println(ie.toString());
		}
		finally
		{
			System.out.println("Finally block");
		}
	}
	public void display()
	{
		System.out.println("User name:"+uname);
		System.out.println("Sem:"+sem);
	}
}
class ExceptionDemo1
{
	public static void main(String a[])
	{
		Student s1=new Student();
		s1.getData();
		s1.display();
	}
}