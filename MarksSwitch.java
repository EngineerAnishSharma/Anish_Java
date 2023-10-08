import java.util.Scanner;
public class MarksSwitch
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
	int per=(int)(percent/10);
	switch(per)
	{
		case 10:
		case 9:
			System.out.println("Grade A");
			break;
		case 8:
		case 7:
			System.out.println("Grade B");
			break;
		case 6:
			System.out.println("Grade C");
			break;
		case 5:
		case 4:
			System.out.println("Grade D");
			break;
		case 3:
			System.out.println("Fail");	
			break;	
	}
		
	}
}
