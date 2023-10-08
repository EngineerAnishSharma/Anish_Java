import java.util.*;
public class Frequency
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		int count=0;
		System.out.println("Enter string");
		String name=obj.nextLine();
		System.out.println("Enter charatcer");
		char character=obj.next().charAt(0);
		
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)==character)
				count++;
		}
		System.out.println("Frequency of "+character+" of "+name+" is "+count);
	}
}