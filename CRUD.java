import java.util.*;
class Student
{
	private int sno;
	private String sname;
	private String DOB;
	
	Student(int sno, String sname,String DOB)
	{
		this.sno=sno;
		this.sname=sname;
		this.DOB=DOB;
	}
		public int getSno()
			{
				return sno;
			}
		public String getDOB()
		{
			return DOB;
		}
		public String getSname()
		{
			return sname;	
		}
		
		public String tostring()
		{
			return sno+" "+sname+" "+DOB;
		}
}
public class CRUD
{
	public static void main(String arg[])
	{
		List<Student> c=new ArrayList<Student>();
		//Collection<Student> c=new ArrayList<Student>();
		Scanner s=new Scanner(System.in);
		Scanner s1=new Scanner(System.in);

		int ch;
		do
		{
			System.out.println("1.INSERT");
			System.out.println("2.DISPLAY");
			System.out.println("3.SEARCH");
			System.out.println("4.DELETE");
			System.out.println("5.UPDATE");
			System.out.println("Enter your choice:");
			ch=s.nextInt();
			switch(ch)
			{
				case 1:
					System.out.print("Enter Sno:");
					int sno=s.nextInt();
					
					System.out.print("Enter Sname:");
					String sname=s1.nextLine();
					
					System.out.print("Enter DOB:");
					String DOB=s1.nextLine();
					c.add(new Student(sno,sname,DOB));
					break;
				case 2:
					System.out.println("-------------");
					Iterator<Student> i=c.iterator();
					while(i.hasNext())
					{
						Student e=i.next();
						System.out.println(e);
					}
						System.out.println("-------------");
					break;
				
			
				case 3:
					boolean found= false;
					System.out.print("Enter Sno to search:");
					 sno=s.nextInt();
					System.out.println("-------------");
					 i=c.iterator();
					while(i.hasNext())
					{
						Student e=i.next();
						if(e.getSno()==sno)
						{
						System.out.println(e);
						found=true;
						}
					}
					if(!found)
						{
							System.out.println("Record Not Found");
						}
						System.out.println("-------------");
					break;
				case 4:
					 found= false;
					System.out.print("Enter Sno to delete:");
					 sno=s.nextInt();
					System.out.println("-------------");
					 i=c.iterator();
					while(i.hasNext())
					{
						Student e=i.next();
						if(e.getSno()==sno)
						{
						i.remove();
						found=true;
						}
					}
					if(!found)
						{
							System.out.println("Record Not Found");
						}
					else
					{	
						System.out.println("Record is Deleted Sccessfully...!");
					}
						System.out.println("-------------");
					break;
				case 5:
					 found= false;
					System.out.print("Enter Sno to delete:");
					 sno=s.nextInt();
					System.out.println("-------------");
					ListIterator<Student>li=c.listIterator();
					while(li.hasNext())
					{
						Student e=li.next();
						if(e.getSno()==sno)
						{
						System.out.println("Enter New Name:");
						sname=s1.nextLine();
						System.out.println("Enter New DOB:");
						DOB=s1.nextLine();
						li.set(new Student(sno,sname,DOB));
						found=true;
						}
					}
					if(!found)
						{
							System.out.println("Record Not Found");
						}
					else
					{	
						System.out.println("Record is Updated Sccessfully...!");
					}
						System.out.println("-------------");
					break;
				
			}
		}while(ch!=0);
	}
}
