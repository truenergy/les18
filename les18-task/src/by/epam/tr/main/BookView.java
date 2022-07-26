package by.epam.tr.main;

import java.util.List;

public class BookView {
	public void printPublishDate(List<Book> book) {
		for (Book b : book) {
			System.out.println(
					"PublishDate:" + b.getPublishDate() + ", author:" + b.getAuthor() + ", book: " + b.getName());

		}
	}
	public void printPublish(List<Book> book) {
		for (Book b : book) {
			System.out.println(
					"Publish:" + b.getPublish() + ", author:" + b.getAuthor() + ", book: " + b.getName());

		}
	}
	
	public void printAuhtor(List<Book> book) {
		for (Book b : book) {
			System.out.println(
					"Author: " + b.getAuthor() + ", book: " + b.getName());

		}
	}
}
