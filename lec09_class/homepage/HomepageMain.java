package lec09_class.homepage;

import java.util.Scanner;

public class HomepageMain {
	public static void main(String[] args) {
		MemberDB memberDB = MemberDB.getInstance();
		BoardDB boardDB = BoardDB.getInstance();
		SessionStorage storage = new SessionStorage();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("행동을 선택해주세요.");
			System.out.println("1. 회원가입 | 2. 회원목록조회 "
					+ "| 3. 로그인 | 4. 종료");
			System.out.print(">>> ");
			
			int command = Integer.parseInt(sc.nextLine());
			
			if(command == 1) {
				System.out.print("아이디를 입력해주세요: ");
				String id = sc.nextLine();
				System.out.print("비밀번호를 입력해주세요: ");
				String pw = sc.nextLine();
				
				memberDB.addMember(new Member(id, pw));
			}else if(command == 2) {
				memberDB.showList();
			}else if(command == 3) {
				System.out.print("아이디를 입력해주세요: ");
				String id = sc.nextLine();
				System.out.print("비밀번호를 입력해주세요: ");
				String pw = sc.nextLine();
				
				if(memberDB.loginCheck(id, pw)) {
					// TODO 글 조회, 글 쓰기, 로그아웃
					storage.setLoginMember(new Member(id, pw));
					while(true) {
						boardDB.showList();
						System.out.println("행동을 입력해주세요.");
						System.out.println("1. 글쓰기 | 2. 글조회 | 3. 로그아웃");
						System.out.print(">>> ");
						
						int select = Integer.parseInt(sc.nextLine());
						
						if(select == 1) {
							System.out.print("글 제목을 입력해주세요: ");
							String title = sc.nextLine();
							System.out.print("글 내용을 입력해주세요: ");
							String content = sc.nextLine();
							
							String author = storage.getLoginMember().getId();
							
							boardDB.addBoard(new Board(title, content, author));
						}else if(select == 2) {
							System.out.print("글 번호를 입력해주세요: ");
							int no = Integer.parseInt(sc.nextLine());
							
							boardDB.selectBoard(no);
						}else if(select == 3) {
							System.out.println("로그아웃 하였습니다.");
							storage.setLoginMember(null);
							break;
						}else {
							System.out.println("잘못 입력하셨습니다.");
						}
					}
					
				}
			}else if(command == 4) {
				System.out.println("종료하였습니다.");
				break;
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
			
		}
		
		
	}
}
