import java.util.*;
class Calculator
{
	public void add()
	{
		System.out.println("Add:"+(5+7));
	}
	public void sub()
	{
		System.out.println("sub:"+(5-7));
	}
	public void mul()
	{
		System.out.println("mul:"+(5*7));
	}
	public void div()
	{
		System.out.println("div:"+(5/7));
	}
}
public class Cal
{
	public static void main(String[] args)
	{
		Calculator obj=new Calculator();
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
	}
}