class A
{
	int a=10;
	public void show1()
	{
		System.out.println("Feature 1");
	}
}
class B extends A
{
	public void show2()
	{
		System.out.println("Feature 2");
	}
}
class C extends B
{
	public void show3()
	{
		System.out.println("Feature 3");
	} 
}
class InheritanceHerarical
{
	public static void main(String []args)
	{
		C obj1=new C();
		obj1.show1();
		obj1.show2();
		System.out.println("Value of a is "+obj1.a);
		
	}
}