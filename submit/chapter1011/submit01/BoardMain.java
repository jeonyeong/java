package submit.chapter1011.submit01;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		ArrayList<Board> boardList = new ArrayList<Board>();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("행동을 선택해주세요.");
			System.out.println("1. 글 목록 | 2. 글 쓰기 | 3. 종료");
			System.out.print(">>> ");
			
			int select = Integer.parseInt(sc.nextLine());
			
			if(select == 1) {
				for(int i = 0; i < boardList.size(); i++) {
					System.out.println(boardList.get(i));
				}
			}else if(select == 2) {
				System.out.print("글 제목을 입력해주세요: ");
				String title = sc.nextLine();
				System.out.print("글 내용을 입력해주세요: ");
				String content = sc.nextLine();
				
				boardList.add(new Board(boardList.size()+1, title, content));
			}else if(select == 3) {
				System.out.println("종료합니다.");
				break;
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
			
		}

	}

}
