package Assignment2;

public class MyArraymain {

	public static void main(String[] args) {
		MyArray a = new MyArray(6);

		a.accept();

		a.display();

		System.out.println("Availabe Array : " + a.check(6));
		System.out.println("Search Array : " + a.search(4));
		a.reverse();
		a.display();
		System.out.println(a.max());
		a.evenno();
		a.sum();
		a.findDnum();
	}

}
