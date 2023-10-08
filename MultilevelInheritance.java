class A
{
	public void display()
	{
		System.out.println("A");
	}
}
class B extends A
{
	public void display()
	{
		System.out.println("B");
	}
}
class C extends B
{
	public void display()
	{
		System.out.println("C");
	}
}
class MultilevelInheritance
{
	public static void main(String args[])
	{
		A obj=new C();
		obj.display();
		obj=new B();
		obj.display();
	}
}

