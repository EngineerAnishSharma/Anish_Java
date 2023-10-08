import java.io.*;
class InputBufferedReader
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader sr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(sr);
		System.out.println("Enter n1");
		String a=br.readLine();
		int n1=Integer.parseInt(a);
		System.out.println("Enter n2");
		String b=br.readLine();
		int n2=Integer.parseInt(b);
		System.out.println("Concate:");
		System.out.println(a+b);
		System.out.println("Sum of two number is:"+(n1+n2));
		
	}
}