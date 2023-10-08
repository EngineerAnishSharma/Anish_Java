import java.util.Scanner;
public class Marks
{
	public static void main(String[] args)
	{
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter 1st subject marks:");
	int sub1=obj.nextInt();
	System.out.println("Enter 2nd subject marks:");
	int sub2=obj.nextInt();
	System.out.println("Enter 3rd subject marks:");
	int sub3=obj.nextInt();
	System.out.println("Enter 4th subject marks:");
	int sub4=obj.nextInt();
	System.out.println("Enter 5th subject marks:");
	int sub5=obj.nextInt();
	double sum=sub1+sub2+sub3+sub4+sub5;
	double percent=(sum/500)*100;
	System.out.println("Your percentage is:"+percent);
	if(percent>=90 && percent<=100)
		System.out.println("Grade A");
	else if(percent>=75 && percent<90)
		System.out.println("Grade B");
	else if(percent>=60 && percent<75)
		System.out.println("Grade C");
	else if(percent>=40 && percent<60)
		System.out.println("Grade D");
	else if(percent>=0&& percent<40)
		System.out.println("Fail");
	else
		System.out.println("Enter valid marks");
	}
}
