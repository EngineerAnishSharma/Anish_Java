import java.util.*;
public class VectorLooping
{
	public static void main(String[] args)
	{
		Vector<String> vc=new Vector<String>();
		Scanner obj=new Scanner(System.in);
		vc.add("Java");
		vc.add("C");
		vc.add("Python");
		vc.add("CPP");
		int flag=0;
		System.out.println(vc);
		System.out.println("Enter string:");
		String word=obj.next();
		for(int i=0;i<vc.size();i++)
		{
			if(word.equals(vc.get(i)))
			{
				vc.remove(i);
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			vc.add(word);
			System.out.println(vc);
		}
		else{
			System.out.println(vc);
		}
	}
}