import java.util.*;
class InvalidUsername extends Exception
{
	String msg;
	InvalidUsername(String msg)
	{
		this.msg=msg;
	}
	public String toString()
	{
		return "Invalid username:"+msg;
	}
}
class ExceptionDemo2
{
	public static void main(String a[])throws InvalidUsername
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user name:");
		String uname=sc.nextLine();
		int len=uname.length();
		char arr[]=uname.toCharArray();
		if(len < 4 || len > 10)
		{
			throw new InvalidUsername("Username must be between 4 to 10 characters: "+uname);
		}
		else
		{
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
				if(!Character.isDigit(arr[i]) || !Character.isLetter(arr[i]))
				{
					throw new InvalidUsername("Username Contains only alpha numeric values: "+uname);
				}
			}
		}
	}
}