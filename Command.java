class Command
{
	public static void main(String[] args)
	{
		int a;
		System.out.println(args[0]);
		a=Integer.parseInt(args[0]);
		int count=0;
		while(a>0)
		{
			a/=10;
			count++;
		}
		System.out.println(count);
	}
}