import java.util.*;
public class JaggedArray
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		int row;
		System.out.println("enter row");
		row=obj.nextInt();
		int [][] jarray=new int[row][];
		for(int i=0;i<row;i++)
		{
			jarray[i]=new int[i+1];
			for(int j=0;j<=i;j++)
			{
				jarray[i][j]=j+1;
			}
			
		}
		for(int i=0;i<jarray.length;i++)
		{
			for(int j=0;j<jarray[i].length;j++)
			{
				System.out.print(jarray[i][j]+" ");
			}
			System.out.println();
		}
	}
}