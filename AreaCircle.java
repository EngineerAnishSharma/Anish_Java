abstract class Circle
{
	abstract void area(int r);
	abstract void rectangle(int l,int b);
	abstract void triangle(int base,int height);
}
class Example extends Circle
{
	public void area(int r)
	{
		System.out.println("Area Circle:"+(22/7)*r*r);
	}
	public void rectangle(int l,int b)
	{
		System.out.println("Area Rectangle:"+l*b);
	}
	public void triangle(int base,int height)
	{
		System.out.println("Area Triangle:"+(1/2)*base*height);
	}
}
class AreaCircle
{
	public static void main(String args[])
	{
		Example obj=new Example();
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter radius");
		int r=obj.nextInt();
		obj.area(r);
		System.out.println("Enter length and breath");
		int l=obj.nextInt();
	   int b=obj.nextInt();
		obj.rectangle(l,b);
		System.out.println("Enter base and height");
		int base=obj.nextInt();
		int height=obj.nextInt();
		obj.triangle(base,height);
	}
}

