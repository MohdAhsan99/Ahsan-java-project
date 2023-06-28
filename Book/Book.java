
public class Book {

	public int bid;
	public String bname;
	public double price;
	
	public Book(int bid, String bname, double price) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.price = price;
	}

	public int getBid() {
		return bid;
	}

	public String getBname() {
		return bname;
	}

	public double getPrice() {
		return price;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book id :" + bid + " Book Name :" + bname + "Price :" + price;
	}
	
	
	
	
	
}
