import java.util.*;
public class TwoDArray
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter row:");
		int r=obj.nextInt();
		System.out.println("Enter column:");
		int c=obj.nextInt();
		int arr[][]=new int[r][c];
		int marks[]=new int[r];
		System.out.println("Enter 2Darray element");
		int i; 
		for(i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]=obj.nextInt();
			}
			
		}
		System.out.println("Printing 2Darray element");
		for(i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		int pos=0;
		for(i=0;i<r;i++)
		{
			int sum=0;
			
			for(int j=1;j<c;j++)
			{
				sum=sum+arr[i][j];
			}
			marks[i]=sum;
		}
		int max=Integer.MIN_VALUE;
		for(i=0;i<r;i++)
		{
			if(max<marks[i])
				max=marks[i];
				pos=i;
		}
		System.out.println("Roll number "+(i)+" got maximum marks :"+max);
	}
}