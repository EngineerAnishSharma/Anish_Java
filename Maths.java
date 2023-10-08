import java.util.Scanner;
class Maths
{
	public static void main(String[] args)
	{
		int choice,n1,n2;
		Scanner obj=new Scanner(System.in);
		System.out.println("1:Add\n2.Sub\n3.Mul\n4.Div");
		System.out.println("Enter a choice:");
		choice=obj.nextInt();
		System.out.println("Enter two number:");
		n1=obj.nextInt();
		n2=obj.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("Add:"+(n1+n2));
				break;
			case 2:
				System.out.println("Sub:"+(n1-n2));
				break;
			case 3:
				System.out.println("Mul:"+n1*n2);
				break;
			case 4:
				System.out.println("Div:"+n1/n2);
				break;
			default:
				System.out.println("Enter valid choice");
				break;
		}
	}
}