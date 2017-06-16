package homework.four.bookstore;

public class Book {

	private String name;
	private double price;
	private int count;

	public Book(String name, double price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCount() {
		return this.count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return this.name + ", " + this.price + "$" + ", " + this.count + "count.";
	}

}
