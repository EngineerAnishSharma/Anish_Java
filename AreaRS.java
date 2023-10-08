class Area
{
	int rectArea(int x,int y)
	{
		return x*y;
	}
	int sqaArea(int x)
	{
		return x*x;
	}
}
public class AreaRS
{
	public static void main(String[] args)
	{
		int area1,area2;
		Area obj1=new Area();
		area1=obj1.rectArea(2,8);
		area2=obj1.sqaArea(5);
		System.out.println("Area of rectangle is"+area1+" and Square is "+area2);
	}
}