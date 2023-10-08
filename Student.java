import java.util.*;
public class Student
{
	public static void main(String[] args)
	{
		Vector<String> vc=new Vector<String>();
		//Scanner obj=new Scanner(System.in);
		//System.out.println("Enter Number Student:");
		//int num=obj.nextInt();
		int a=Integer.parseInt(args[0]);
		for(int i=0;i<a;i++)
		{
			vc.add(args[i+1]);
		}
		System.out.println(vc);
		
	}
}