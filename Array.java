import java.util.*;
public class Array
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter size:");
		int n=obj.nextInt();
		int sum=0;
		int arr[]=new int[n];
		int temp[]=new int[n];
		System.out.println("Enter array element");
		for(int i=0;i<n;i++)
		{
			arr[i]=obj.nextInt();
		}
		System.out.println("Printing array element");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<n;i++)
		{
			sum=sum+arr[i];
			
		}
		for(int i=0;i<n;i++)
		{
			temp[i]=sum-arr[i];
			
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(temp[i]+" ");
		}
		
	}
}