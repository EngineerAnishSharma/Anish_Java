class Counter
{
	int count;
	public synchronized void count()
	{
		count++;
	}
}
class Hi extends Thread
{
	Counter obj;
	public Hi(Counter obj)
	{
		this.obj=obj;
	}
	public void run()
	{
		for(int i=1;i<=50;i++)
		{
			obj.count();
			try{Thread.sleep(50);}catch(Exception e){}
		}	
	}
}
class Hello extends Thread
{
	Counter obj;
	public Hello(Counter obj)
	{
		this.obj=obj;
	}
	public void run()
	{
		for(int i=1;i<=50;i++)
		{
			obj.count();
			try{Thread.sleep(50);}catch(Exception e){}
		}	
	}
}
class ThreadSynchronized
{
	public static void main(String[] args) throws Exception
	{
		Counter obj=new Counter();
		Hi obj1=new Hi(obj);
		Hello obj2=new Hello(obj);
		obj1.start();
		obj2.start();
		obj1.join();
		obj2.join();
		System.out.println("Count "+obj.count);
	}
}