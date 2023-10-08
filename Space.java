import java.util.*;
public class Space
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		int count=0;
		int count1=0;
		int count2=0;
		int count3=0;
		System.out.println("Enter string");
		String name=obj.nextLine();
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)==32) 
				count++;
			else if(name.charAt(i)>=48 && name.charAt(i)<=57)
				count3++;
			else if(name.charAt(i)==name.toLowerCase().charAt(i))
				count1++;
			
			else if(name.charAt(i)==name.toUpperCase().charAt(i))
				count2++;
			
			else
{
				System.out.println("Enter valid string");}
		}
		System.out.println("No of space are "+count);
		System.out.println("No of UPPERCASE are "+count2);
		System.out.println("No of lowercase are "+count1);
		System.out.println("No of digits are "+count3);
	}
}