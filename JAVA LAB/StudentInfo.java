import java.util.Scanner;
class Student
{
	String name;
	int rollno ;
	
	
	Student()
	{
		Scanner c=new Scanner(System.in);
		
		System.out.println("roll no =");
		rollno=c.nextInt();
		
	    System.out.println("name=");
	    name=c.next();
		System.out.println("roll no ="+ rollno);
	    System.out.println("name="+ name);
	}
	
}
class StudentInfo
{
	public static void main(String[] args)
	{
		//Student a1= new Student();
		Student a= new Student();
		
	
	}
		
}
