package by.epam.tr.main;

import java.util.List;

public class MainBookA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library library = new Library();
		library.add(new Book(555, "Time", "Stivenson", "NEW", 1968, 155, 90.50, "hard cover"));
		library.add(new Book(325, "The sky", "Siven", "TTN", 1985, 365, 81.50, "soft cover"));
		library.add(new Book(159, "Life", "Anderson", "KKKT", 2015, 150, 15.50, "hard cover"));
		library.add(new Book(536, "Akuna", "Stivenson", "NEW", 1970, 15, 10.3, "soft cover"));
		
			
		BookLogic logic = new BookLogic();
		List<Book> result = logic.listPublishDate(library.getBooks());
		
		BookView view = new BookView();
		view.printPublishDate(result);

		BookLogic logic1 = new BookLogic();
		List<Book> result1 = logic1.listPublish(library.getBooks());
		
		BookView view1 = new BookView();
		view1.printPublish(result1);
		
		BookLogic logic2 = new BookLogic();
		List<Book> result2 = logic2.listAuthor(library.getBooks());
		
		BookView view2 = new BookView();
		view2.printAuhtor(result2);
		
		
	}
	
	
}
