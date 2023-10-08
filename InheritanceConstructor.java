class A
{
	int a=10;
	public A()
	{
		System.out.println("Feature 1");
	}
}
class B extends A
{
	public B()
	{
		System.out.println("Feature 2");
	}
}
class C extends B
{
	public C()
	{
		System.out.println("Feature 3");
	} 
}
public class InheritanceConstructor
{
	public static void main(String []args)
	{
		C obj1=new C();	
	}
}