import java.util.Scanner;
class Greatest
{
	public static void main(String[] args)
	{
		int n1,n2,n3;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter three Number");
		n1=obj.nextInt();
		n2=obj.nextInt();
		n3=obj.nextInt();
		int large=(n1>n2)?((n1>n3)?(n1):(n3)):((n2>n3)?(n2):n3);
		System.out.println(large);

	}
}