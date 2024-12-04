import java.util.Scanner;

public class BookDatabase {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);

		BookShelf bk = new BookShelf();

		boolean quit = false;

		while (quit == false) { // boolean equals

			System.out.println(
					"Welcome to the GameCock Library!" + "\nEnter 1 to add a book" + "\nEnter 2 to remove a book"
							+ "\nEnter 3 for the book list in the library" + "\nEnter 4 to exit the library: ");

			int choice = key.nextInt();

			key.nextLine(); // getting rid of the enter character

			
			
			
			
			
			switch (choice) {

			case 1: // add a book

				System.out.println("Enter the Title of the Book: ");

				String title = key.nextLine();

				System.out.println("Enter the Author of the Book: ");

				String author = key.nextLine();

				System.out.println("Enter the Price of the Book: ");

				double price = key.nextDouble();

				bk.insertBook(title, author, price);

				break;

			case 2: // delete or remove a book

				System.out.println("Enter the Title of the Book: ");

				title = key.nextLine();

				System.out.println("Enter the Author of the Book: ");

				author = key.nextLine();

				System.out.println("Enter the Price of the Book: ");

				price = key.nextDouble();

				bk.deleteBook(new Book(title, author, price));

				break;

			case 3: // view booklist

				System.out.println(bk.toString());

				break;

			case 4: // exits the bookshelf

				quit = true;
				
				System.out.println("Goodbye!");

				break;

			default:

				System.out.println("Invalid Choice Entered!");

			}

		}

	}

}
