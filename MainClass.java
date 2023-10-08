import java.util.*;
class A
{
	public void display()
	{
		System.out.println(" Outside Hello");
	}
}
public class MainClass
{
	public void display1()
	{
		System.out.println("inside  Hello");
	}

	public static void main(String[] args)
	{
		A obj=new A();
		obj.display();	
		MainClass obj1=new MainClass();
		obj1.display1();
	}
}