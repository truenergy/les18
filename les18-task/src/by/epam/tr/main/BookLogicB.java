package by.epam.tr.main;

public class BookLogicB {

	public static void auhor(Book[] book, String author) {
		int count = 0;
		for (int i = 0; i < book.length; i++) {
			if (book[i].getAuthor().equals(author)) {
				System.out.println("Author:" + book[i].getAuthor() + ", book: " + book[i].getName());
				count++;
			}
		}
		if (count == 0) {
			System.out.println("There are no books by the specified author");
		}

	}

	public static void publish(Book[] book, String publish) {
		int count = 0;
		for (int i = 0; i < book.length; i++) {
			if (book[i].getPublish().equals(publish)) {
				System.out.println("Publish:" + book[i].getPublish() + ", author:" + book[i].getAuthor() + ", book: "
						+ book[i].getName());
				count++;
			}
		}
		if (count == 0) {
			System.out.println("There are no books by the specified publish");
		}

	}

	public static void year(Book[] book, int year) {
		int count = 0;
		for (int i = 0; i < book.length; i++) {
			if (book[i].getPublishDate() > year) {
				System.out.println("PublishDate:" + book[i].getPublishDate() + ", author:" + book[i].getAuthor()
						+ ", book: " + book[i].getName());
				count++;
			}
		}

		if (count == 0) {
			System.out.println("There are no books by the specified publish date");
		}
	}

}
