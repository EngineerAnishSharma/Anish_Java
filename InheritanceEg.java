class A
{
	public static void show1()
	{
		System.out.println("Feature 1");
	}
}
class B extends A
{
	public static void show2()
	{
		System.out.println("Feature 2");
	}
}
class InheritanceEg
{
	public static void main(String []args)
	{
		B obj=new B();
		obj.show1();
		obj.show2();
	}
}