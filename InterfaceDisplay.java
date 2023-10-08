interface A
{
	public static final int a=5;
	public abstract void display();
}
class B implements A
{
	public void display()
	{
		System.out.println("This a Display");
	}
}
class InterfaceDisplay
{
	public static void main(String[] args)
	{
		B obj=new B();
		obj.display();
	}
}
