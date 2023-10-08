import java.util.*;
public class Replace
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		
		StringBuffer str=new StringBuffer("Anish");
		StringBuffer s=new StringBuffer(str.reverse());
		//s=str.reverse();
		if(s==str)
			System.out.println("Plaindrome");
		else
			{System.out.println("Not Palindrome");}
	}
}