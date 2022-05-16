package oops;

public class Polymorphism {
    public static void main(String[] args) {
        // Here the runtime polymorphism fundamental is not applied, 
        // as it is of single CashPayment form
        SalaryPayment sp = new SalaryPayment();
        sp.pay();

        // Now the initialization is done using runtime polymorphism and 
        // it can have many forms at runtime
        // Single payment "p" instance can be used to pay by cash and credit card
        
      /*  Payment p = new CashPayment();
        p.pay(); // Pay by cash*/

        LoanPayment lp = new LoanPayment();
        lp.pay(); // Pay by creditcard
    }
}

interface Payment {
    public void pay();
}

class SalaryPayment implements Payment {

    // method overriding
   // @Override
    public void pay() 
    {
        System.out.println("This is cash payment");
    }

}

class LoanPayment implements Payment {

    // method overriding
  //  @Override
    public void pay() {
        System.out.println("This is credit card payment");
    }


}
