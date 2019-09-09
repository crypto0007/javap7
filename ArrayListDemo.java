import java.util.*;
class ArrayListDemo
{
	public static void main(String a[])
	{
		ArrayList<String> list=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter number for entering elements in array list:");
		int n=sc.nextInt();
		System.out.println("Enter ArrayList elements:");
		for(int i=0;i<n;i++)
		{
			list.add(sc1.nextLine());
		}


		while(true)
		{
			System.out.println("1.Add Element \n 2. Add element at specific position \n 3.Remove by object name \n 4.Remove by index \n 5.Sort \n 6.replace by index \n 7.get value from index \n 8.display all elements \n 9.Exit");
			System.out.println("Enter ur choice:");
			int c=sc.nextInt();
			switch(c)
			{
				case 1:
					System.out.println("Enter element:");
					String ele=sc1.nextLine();
					list.add(ele);
					break;
				case 2:
					System.out.println("Enter Index:");
					int e=sc.nextInt();
					System.out.println("Enter element:");
					String ele1=sc1.nextLine();
					list.add(e,ele1);
					break;
				case 3:
					System.out.println("Enter element u want to remove:");
					String ele2=sc1.nextLine();
					list.remove(ele2);
					break;
				case 4:
					System.out.println("Enter Index u want to remove:");
					int e1=sc.nextInt();
					list.remove(e1);
					break;
				case 5:
					Collections.sort(list);
					System.out.println("Sorted elements: "+list);
					break;
				case 6:
					System.out.println("Enter Index u want to replace:");
					int e2=sc.nextInt();
					System.out.println("Enter element u want to replace:");
					String ele3=sc1.nextLine();
					list.set(e2,ele3);
					break;
				case 7:
					System.out.println("Enter Index u want to get:");
					int e3=sc.nextInt();
					System.out.println("Element is:"+list.get(e3));
					break;
				case 8:
					Iterator itr=list.iterator();
					System.out.println("ArrayList elements:");
					while(itr.hasNext())
					{
						System.out.println(itr.next());
					}
					break;
				case 9:
					System.exit(0);
					break;
				default:
					System.out.println("Invalid choice");
					break;
			}
		}
	}
}