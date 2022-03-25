package submit.chapter0809.submit03;

import java.util.ArrayList;

public class Library {
	private static Library instance = new Library();
	
	private Library() {}
	
	public static Library getInstance() {
		return instance;
	}
	
	ArrayList<Book> bookList = new ArrayList<Book>();

}
