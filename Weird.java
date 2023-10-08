import java.util.Scanner;
public class Weird
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int num;
		System.out.println("Enter a number:");
		num=obj.nextInt();
		if(num%2!=0)
			System.out.println(num+" is Weird");
		else{
			if(num>=2 && num<=5)
				System.out.println(num+" is Not Weird");	
			else if(num>=6 && num<=20)
				System.out.println(num+" is Weird");
			else if(num>20)
				System.out.println(num+" is Not Weird");
			else
				System.out.println("Enter valid number");
		}	
	}
}
