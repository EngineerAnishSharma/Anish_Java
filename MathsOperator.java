import java.util.Scanner;
class MathsOperator
{
	public static void main(String[] args)
	{
		int n1,n2;
		char choice;
		Scanner obj=new Scanner(System.in);
		System.out.println("+:Add\n-.Sub\n*.Mul\n/.Div");
		System.out.println("Enter a choice:");
		choice=obj.next().charAt(0);
		System.out.println("Enter two number:");
		n1=obj.nextInt();
		n2=obj.nextInt();
		switch(choice)
		{
			case '+':
				System.out.println("Add:"+(n1+n2));
				break;
			case '-':
				System.out.println("Sub:"+(n1-n2));
				break;
			case '*':
				System.out.println("Mul:"+n1*n2);
				break;
			case '/':
				System.out.println("Div:"+n1/n2);
				break;
			default:
				System.out.println("Enter valid choice");
				break;
		}
	}
}