class MarksException extends Exception
{
	public MarksException(String s)
	{
		System.out.print(s);
	}
}

class CreateExc
{
	public static void check(int a) throws Exception 
	{
		if(a<0 ||a>100)
			throw new MarksException("MArks invalid");
		else
			System.out.print("Marks is correct");
	}
	public static void main(String[] args)
	{
		try{
			check(1000);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}