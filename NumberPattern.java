import java.util.*;
public class NumberPattern
{
	public static void main(String[] args)
	{
		int n;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter n:");
		n=obj.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%2==0)
				{
					System.out.print(i+1-j+" ");
				}
				else
				{
					System.out.print(j+" ");
				}
			}
			
			
			System.out.println();
		}
	}
}