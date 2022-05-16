package oops;

public class staticmethoddacc {
	static int i = 100;
	  static String s = "java developer";
	  //Static method
	  static void staticmethod()
	  {
	     System.out.println("i:"+i);
	     System.out.println("i:"+s);
	  }

	  //non-static method
	  void nonstatic()
	  {
		  System.out.println("i:"+i);
		     System.out.println("i:"+s);
		     
	  }
	
	  public static void main(String args[])
	  { 
		  staticmethoddacc obj = new staticmethoddacc();
		
		  obj.nonstatic(); 
	
	    //  staticmethod();
	   }

}
