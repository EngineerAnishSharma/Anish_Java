class Student
{
	static String name;
	static int year=1;
	public static void display(String name1)
	{
		name=name1;
		System.out.println(year+" "+name);
	}
}
public class Info
{
	public static void main(String[] args)
	{
		Student.display("Anish");
	}
}