import java.util.*;
public class Series
{
	public static void main(String[] args)
	{
	Scanner obj=new Scanner(System.in);
	int n;
	double ans=0;
	System.out.println("Enter n:");
	n=obj.nextInt();
	for(int i=1;i<=n;i++)
	{
		ans=ans+1/Math.pow(i,2);
	}
	System.out.println(ans);
	
		
	}
}
