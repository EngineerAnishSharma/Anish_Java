import java.util.*;
class Staff
{
	Scanner sc=new Scanner(System.in);
	int code;
	String name;
}
class Teacher extends Staff
{
	int exp;
	String sub;
	
	public void read()
	{
		exp=sc.nextInt();
		code=sc.nextInt();
		name=sc.nextLine();
		sub=sc.nextLine();
		
		
	}
	public void display1()
	{
		System.out.println(code+" "+name+" "+sub+" "+" "+exp);
	}
}
class Typist extends Staff
{
	int speed;
	int exp;	
}
class Regular extends Typist
{
	int sal;
	public void read()
	{
		speed=sc.nextInt();
		exp=sc.nextInt();
		sal=sc.nextInt();
		code=sc.nextInt();
		name=sc.nextLine();
		
	}
	public void display2()
	{
		System.out.println(code+" "+name+" "+speed+" "+" "+exp+" "+sal);
	}
}

class Casual extends Typist
{
	int dailyWages;
	public void read()
	{
		code=sc.nextInt();
		name=sc.nextLine();
		speed=sc.nextInt();
		exp=sc.nextInt();
		dailyWages=sc.nextInt();
	}
	public void display3()
	{
		System.out.println(code+" "+name+" "+speed+" "+" "+exp+" "+dailyWages);
	}
}
class Officer extends Staff
{
	String grads;
	String dept;
	int sal;
	public void read()
	{
		code=sc.nextInt();
		name=sc.nextLine();
		dept=sc.nextLine();
		grads=sc.nextLine();
		sal=sc.nextInt();
	}
	public void display4()
	{
		System.out.println(code+" "+name+" "+dept+" "+grads);
	}
}
class MultilevelStaff
{
	public static void main(String[] args)
	{
		Teacher obj1=new Teacher();
		obj1.read();
		obj1.display1();
		Regular obj2=new Regular();
		obj2.read();
		obj2.display2();
		Casual obj3=new Casual();
		obj3.read();
		obj3.display3();
		Officer obj4=new Officer();
		obj4.read();
		obj4.display4();
	}
}