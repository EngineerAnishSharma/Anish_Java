import java.util.*;
public class Pattern
{
	public static void main(String[] args)
	{
	Scanner obj=new Scanner(System.in);
	int n,z=1;
	System.out.println("Enter n:");
	n=obj.nextInt();
	for(int i=1;i<=n;i++)
	{
		for(int j=i;j<n;j++)
		{
			System.out.print("  ");
		}
		for(int k=1;k<=i;k++)
		{
			
			System.out.format(" %c",64+z);
			z++;
		}
	System.out.println();
	}
	
	
		
	}
}
