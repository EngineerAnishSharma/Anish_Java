import java.util.*;
class callbyvalue{
		public static void main(String args[]){
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println ("Values of a and b before swapping are a="+a+"b="+b);
		swap(a,b);
		System.out.println("Values of a and b after swap method are a="+a+"/tb="+b);
		}
		static void swap(int a,int b)
{		
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("values of a and b after swapping are a="+a+"/tb="+b);
}
}