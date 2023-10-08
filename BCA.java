import java.util.*;
public class BCA
{
	public static void main(String[] args)
	{
		int n,temp=64,ans;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter n:");
		n=obj.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print("  ");
			}
			temp=temp+i;
			ans=temp;
			for(int k=1;k<=i;k++)
			{
				System.out.format("%c ",ans);
				ans--;
			}
			System.out.println();
		}
	}
}