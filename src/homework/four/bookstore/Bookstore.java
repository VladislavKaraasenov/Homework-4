package homework.four.bookstore;

public class Bookstore {

	private Book[] books;

	public Bookstore(int maxCountOfBooks) {
		books = new Book[maxCountOfBooks];
	}

	public boolean addBook(Book book) {
		for (int index = 0; index < books.length; index++) {
			if (books[index] == null) {
				books[index] = book;
				return true;
			}
		}
		return false;
	}

	public void showTheNameOfBooks() {
		System.out.println("Bookstore has these books: ");
		for (Book book : books) {
			if (book == null) {
				break;
			} else {
				System.out.println(book.toString());
			}
		}
	}

	public Book findBook(String name) {
		for (Book book : books) {
			if (book.getName().equals(name)) {
				return book;
			}
		}
		return null;
	}

	public String buyBook(String name) {
		Book book = findBook(name);
		int i = book.getCount();
		i--;
		book.setCount(i);
		return toString();
	}
}
