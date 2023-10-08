public class Jagged
{
	public static void main(String[] args)
	{
		int [][] jarray={
			{1,2},
			{1,2,3},
			{1,2,3,4}
		};
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