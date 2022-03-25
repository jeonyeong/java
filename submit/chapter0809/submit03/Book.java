package submit.chapter0809.submit03;

public class Book {
	int no; 			// 책번호
	String name; 		// 책제목
	boolean isBorrow;	// 책 대여 여부 (true면 대여중, false면 입고중)
	
	public Book(String name) {
		Library library = Library.getInstance();
		this.no = library.bookList.size()+1;
		this.name = name;
	}

	@Override
	public String toString() {
		String state = "입고중";
		if(isBorrow) {
			state = "대여중";
		}
		return "[책번호: " + no + ", 책 제목: " + name + ", 대여상태: " + state + "]";
	}

}
