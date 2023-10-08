import java.util.*;
class Exception1
{
	public static void main(String[] args)	
	{
		int a,num;
		Scanner obj=new Scanner(System.in);
		try
		{
			System.out.println("Enter num");
			num=Integer.parseInt(obj.next());
			a=100/num;
			System.out.println(a);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("End of program");
	}
}