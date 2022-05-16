package oops;

class staticblock {
		   static int num;
		   static String mystr;
		   static{	//static block
		      num = 97;
		      mystr = "Static keyword in Java";
		   }
		   static{	//static block
			      num = 100;
			      mystr = "Static keyword in Angular";
			   }
		   
		   public static void main(String args[])
		   {
		      System.out.println("Value of num: "+num);
		      System.out.println("Value of mystr: "+mystr);
		   }
	}
