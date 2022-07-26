package by.epam.tr.main;

public class MainBookB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] book = new Book[4];
		book[0] = new Book(555, "Time", "Stivenson", "NEW", 1968, 155, 90.50, "hard cover");
		book[1] = new Book(325, "The sky", "Siven", "TTN", 1985, 365, 81.50, "soft cover");
		book[2] = new Book(159, "Life", "Anderson", "KKKT", 2015, 150, 15.50, "hard cover");
		book[3] = new Book(536, "Akuna", "Stivenson", "NEW", 1970, 15, 10.3, "soft cover");
		
		String author = "Stivenson";
		String publish = "NEW";
		int year = 1980;

		BookLogicB.auhor(book, author);
		BookLogicB.publish(book, publish);
		BookLogicB.year(book, year);
		
	}
}

	
	
	

		
	
	
