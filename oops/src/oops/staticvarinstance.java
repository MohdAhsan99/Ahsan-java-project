package oops;

public class staticvarinstance {
	static int var1=1247; //important
	   //non-static string variable
	   static String var2;

	   public static void main(String args[])
	   {
		   staticvarinstance ob1 = new staticvarinstance();
		   staticvarinstance ob2 = new staticvarinstance();
	
	        //Assigning the value to static variable using object ob1
		ob1.var1=1000;//important
		ob1.var2="I'm Object1";
	    
	    ob2.var1=9;//important
		ob2.var2="I'm Object2";
		
		System.out.println("ob1 integer:"+ob1.var1);//important
		System.out.println("ob1 String:"+ob1.var2);//important
		System.out.println("ob2 integer:"+ob2.var1);
		System.out.println("ob2 String:"+ob2.var2);
	   }


}
