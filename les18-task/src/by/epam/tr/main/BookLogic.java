package by.epam.tr.main;

import java.util.ArrayList;
import java.util.List;

public class BookLogic {
	public boolean publishDate(Book book) {
		int year = book.getPublishDate();
		if (year > 1980) {
			return true;
		}

		return false;
	}

	public List<Book> listPublishDate(List<Book> book) {
		List<Book> result = new ArrayList<Book>();
		for (Book b : book) {
			if (publishDate(b)) {
				result.add(b);
			}
		}
		return result;
	}

	public boolean publish(Book book) {
		String publish = book.getPublish();
		if (publish.equals("NEW")) {
			return true;
		}

		return false;
	}

	public List<Book> listPublish(List<Book> book) {
		List<Book> result = new ArrayList<Book>();
		for (Book b : book) {
			if (publish(b)) {
				result.add(b);
			}
		}
		return result;
	}

	public boolean author(Book book) {
		String author = book.getAuthor();
		if (author.equals("Stivenson")) {
			return true;
		}

		return false;
	}

	public List<Book> listAuthor(List<Book> book) {
		List<Book> result = new ArrayList<Book>();
		for (Book b : book) {
			if (publish(b)) {
				result.add(b);
			}
		}
		return result;
	}
}
