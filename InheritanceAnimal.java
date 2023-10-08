class Animal
{
	int a=10;	
}
class Tiger extends Animal
{
	public void discription()
	{
		System.out.println("Tiger is wild");
	}
}
class Dog extends Animal
{
	public void discription()
	{
		System.out.println("Dog is domestic");
	}
}
public class InheritanceAnimal
{
	public static void main(String []args)
	{
		Tiger obj1=new Tiger();
		obj1.discription();
		Dog obj2=new Dog();
		obj2.discription();
	}
}