import java.util.*;
class Student
{
	int roll;
	Scanner sc=new Scanner(System.in);	
	public void read()
	{
		System.out.println("Enter roll number:");
		roll=sc.nextInt();
	}
}
class Test extends Student
{
	int sem1,sem2,sportMarks;
	public void read()
	{
		super.read();
		System.out.println("Enter Sem1 marks:");
		sem1=sc.nextInt();
		System.out.println("Enter Sem2 marks:");
		sem2=sc.nextInt();
	}
}
interface Sports
{
	public abstract void read();
}
class Result extends Test implements Sports
{
	public void read()
	{
		super.read();
		System.out.println("Enter sports marks");
		sportMarks=sc.nextInt();
	}
	public void total()
	{
		System.out.println("Total marks of Anish:"+(sem1+sem2+sportMarks));
	}
}
class EngineerMarks
{
	public static void main(String[] args)
	{
		Result Anish=new Result();
		Anish.read();
		Anish.total();
	}
}
