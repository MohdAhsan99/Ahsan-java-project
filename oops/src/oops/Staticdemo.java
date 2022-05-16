package oops;

class abc
{
	 static int a=10;
}
 
 class xyz extends abc
 {
	  
 }
public class Staticdemo {

	public static void main (String args[])
	{
		abc a=new abc();
		xyz x=new xyz();
		
		System.out.println("The First a value is : "+(a.a));
		System.out.println("The second a value is : "+(x.a));
	}

}
