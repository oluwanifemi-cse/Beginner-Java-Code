
public class BookShelf {

	// create array that stores these books

	private Book[] books; // array of type book

	public static final int MAX = 50; // Capacity

	public BookShelf() {

		books = new Book[MAX];

	}

	public BookShelf(int count) {

		if (count > 0) {

			books = new Book[count];

		}

	}

	// accessor

	public Book[] getBooks() { // return type is an array !

		return this.books; // since books = an array, we can return this

	}

	// methods

	public void insertBook(String xTitle, String xAuthor, double xPrice) { // inserting book on the shelf ?

		for (int i = 0; i < books.length; i++) {

			if (books[i] == null) { // since u want to put a book on a spot on the shelf that is EMPTY, rather than
									// a spot that already has a book

				books[i] = new Book(xTitle, xAuthor, xPrice);

				break; // once we're done inserting the book, just break

			}

			else if ((i + 1) == books.length) { // meaning its equal to the max capacity

				System.out.println("Bookshelf is full. Cannot insert new books!");

			}

		}

	}

	public void deleteBook(Book bk) { // delete book off the shelf

		for (int i = 0; i < books.length; i++) {

			if (books[i] != null && books[i].equals(bk)) { // meaning it is not empty AND equal to the book i want to
															// delete

				books[i] = null;

				break; // if you find the exact book you want to delete early on in the loop, there is
						// no point in continuing. so break

			}

			else if ((i + 1) == books.length) {

				System.out.println("Cannot delete item, Book doesn't exist on the bookshelf.");

			}

		}

	}

	public boolean equals(BookShelf bkShelf) { // checking if bookshelf matches another bookshelf

		for (int i = 0; i < books.length; i++) {

			if (books[i] == null && bkShelf.getBooks()[i] != null
					|| (books[i].equals(bkShelf.getBooks()[i]) == false)) {

				return false;

			}

			else {

				return true;

			}

		}

		return true;

	}
	
	
	//toString
	
	
	public String toString() {
		
		String result = "";
		
		for(int i = 0; i < books.length; i++) {
			
			
			if(books[i] != null) { //not empty
			
				result += books[i].toString() + "\n"; //this is 
			
			
			}
			
		}
		
		return result;
		
		
		
	}
	
	
	

}
