package homework.four.bookstore;

public class BookstoreDemo {
	public static void main(String[] args) {

		Bookstore bookstore = new Bookstore(15);

		Book book = new Book("Harry Potter and the Philosopher's Stone", 10.0, 5);
		Book book1 = new Book("Harry Potter and the Chamber of Secrets", 10.0, 5);
		Book book2 = new Book("Harry Potter and the Prisoner of Azkaban", 15.0, 10);
		Book book3 = new Book("Harry Potter and the Goblet of Fire", 15.0, 10);
		Book book4 = new Book("Harry Potter and the Order of the Phoenix", 20.0, 15);
		Book book5 = new Book("Harry Potter and the Half-Blood Prince", 20.0, 15);
		Book book6 = new Book("Harry Potter and the Deathly Hallows - Part 1", 40.0, 30);
		Book book7 = new Book("Harry Potter and the Deathly Hallows - Part 2", 50.0, 45);
		Book book8 = new Book("The Lord of The Rings - Part 1", 35.0, 25);
		Book book9 = new Book("The Lord of The Rings - Part 2", 45.0, 35);
		Book book10 = new Book("The Lord of The Rings - Part 3", 55.0, 50);
		Book book11 = new Book("The Hobbit: An Unexpected Journey - Part 1", 70.0, 50);
		Book book12 = new Book("The Hobbit: The Desolation of Smaug - Part 2", 85.0, 60);
		Book book13 = new Book("The Hobbit: The Battle of The Five Armies - Part 3", 100.0, 70);
		Book book14 = new Book("Introduction to programming whith Java", 90.0, 100);

		// Add books in the bookstore
		bookstore.addBook(book);
		bookstore.addBook(book1);
		bookstore.addBook(book2);
		bookstore.addBook(book3);
		bookstore.addBook(book4);
		bookstore.addBook(book5);
		bookstore.addBook(book6);
		bookstore.addBook(book7);
		bookstore.addBook(book8);
		bookstore.addBook(book9);
		bookstore.addBook(book10);
		bookstore.addBook(book11);
		bookstore.addBook(book12);
		bookstore.addBook(book13);
		bookstore.addBook(book14);

		// Show all books available
		bookstore.showTheNameOfBooks();

		System.out.println("---------------");

		// Find a book by name
		System.out.println(bookstore.findBook("Harry Potter and the Philosopher's Stone"));

		System.out.println("---------------");

		// Find and buy books
		bookstore.buyBook("Harry Potter and the Deathly Hallows - Part 2");
		bookstore.buyBook("The Lord of The Rings - Part 3");
		bookstore.buyBook("Introduction to programming whith Java");

		// Show all books available
		bookstore.showTheNameOfBooks();
	}
}
