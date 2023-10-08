import java.util.*;
class ExceptionThrow
{
	public static void main(String[] args)	
	{
		Scanner obj=new Scanner(System.in);
		try
		{
			System.out.println("Enter marks");
			int marks=obj.nextInt();
			if(marks<=30 && marks>=0)
				throw new ArithmeticException();
			else
				System.out.println(marks);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("End of program");
	}
}