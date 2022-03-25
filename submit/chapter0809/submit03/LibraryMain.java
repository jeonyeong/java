package submit.chapter0809.submit03;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryMain {

	public static void main(String[] args) {
		Library library = Library.getInstance();
		
//		library.bookList.add(new Book("삼국지"));
//		library.bookList.add(new Book("해리포터와 마법사의 돌"));
//		library.bookList.add(new Book("해리포터와 비밀의 방"));
//		library.bookList.add(new Book("해리포터와 아즈카반의 죄수"));
//		library.bookList.add(new Book("해리포터와 불사조 기사단"));
//		library.bookList.add(new Book("해리포터와 혼혈왕자"));
//		library.bookList.add(new Book("해리포터와 죽음의 성물"));
//		library.bookList.add(new Book("어린왕자"));
//		library.bookList.add(new Book("나의 라임 오렌지나무"));
//		library.bookList.add(new Book("이것이 자바다"));
//		library.bookList.add(new Book("좋은생각"));
//		library.bookList.add(new Book("반지의 제왕: 반지 원정대"));
//		library.bookList.add(new Book("반지의 제왕: 두 개의 탑"));
//		library.bookList.add(new Book("반지의 제왕: 왕의 귀환"));
//		library.bookList.add(new Book("토익보카"));
//		library.bookList.add(new Book("개미"));
		
		// 만약 데이터를 이따구로 주면서 배열에 담으라고 지시한다면??
		String strBooks = "삼국지, 해리포터와 마법사의 돌, 해리포터와 비밀의 방 , 해리포터와 아즈카반의 죄수,해리포터와 불사조 기사단, 해리포터와 혼혈왕자, 해리포터와 죽음의 성물,어린왕자, 나의 라임 오렌지나무, 이것이 자바다, 좋은생각, 반지의 제왕: 반지 원정대, 반지의 제왕: 두 개의 탑, 반지의 제왕: 왕의 귀환, 토익보카, 개미";
		String[] strArray = strBooks.split(",");
		// 콤마 전후로 띄어쓰기가 있거나 없다면 trim도 이용
		for(int i = 0; i < strArray.length; i++) {
			strArray[i] = strArray[i].trim();
		}
		
		for(int i = 0; i < strArray.length; i++) {
			library.bookList.add(new Book(strArray[i]));
		}
		
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("행동을 선택해주세요.");
			System.out.println("1. 책 입고 | 2. 책 대여 | 3. 책 목록 | 4. 책 검색 | 5. 종료");
			System.out.print(">>> ");
			int select = Integer.parseInt(sc.nextLine());
			
			if(select == 1) {
				System.out.print("책 번호를 입력해주세요: ");
				int no = Integer.parseInt(sc.nextLine());
				Book book = library.bookList.get(no-1);
				if(book.isBorrow) {
					book.isBorrow = false;
					library.bookList.set(no-1, book);
					System.out.println(book.name + "가 입고 되었습니다.");
				}else {
					System.out.println("이미 입고중입니다.");
				}
				
			}else if(select == 2) {
				ArrayList<Book> searchList = new ArrayList<Book>();
				System.out.print("책 제목을 입력해주세요: ");
				String name = sc.nextLine();
				
				for(Book book : library.bookList) {
					if(book.name.indexOf(name) != -1) {
						searchList.add(book);
					}
				}
				
				if(searchList.size() == 0) {
					System.out.println("해당 책이 존재하지 않습니다.");
				}else if(searchList.size() == 1) {
					int index = library.bookList.indexOf(searchList.get(0));
					Book book = library.bookList.get(index);
					if(!book.isBorrow) {
						book.isBorrow = true;
						library.bookList.set(index, book);
						System.out.println(book.name + "을 대여하셨습니다.");
					}else {
						System.out.println("이미 대여중입니다.");
					}
				}else {
					for(Book book : searchList) {
						System.out.println(book);
					}
					
					System.out.print("책 번호를 입력해주세요: ");
					int no = Integer.parseInt(sc.nextLine());
					Book book = library.bookList.get(no-1);
					if(!book.isBorrow) {
						book.isBorrow = true;
						library.bookList.set(no-1, book);
						System.out.println(book.name + "을 대여하셨습니다.");
					}else {
						System.out.println("이미 대여중입니다.");
					}
				}
				
			}else if(select == 3) {
				for(Book book : library.bookList) {
					System.out.println(book);
				}
			}else if(select == 4) {
				ArrayList<Book> searchList = new ArrayList<Book>();
				System.out.print("책 제목을 입력해주세요: ");
				String name = sc.nextLine();
				
				for(Book book : library.bookList) {
					if(book.name.indexOf(name) != -1) {
						searchList.add(book);
					}
				}
				
				for(Book book : searchList) {
					System.out.println(book);
				}
			}else if(select == 5) {
				System.out.println("종료합니다.");
				break;
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
			
		}


	}

}
