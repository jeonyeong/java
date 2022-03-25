package lec09_class.member;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberMain {
	public static void main(String[] args) {
		Member minwoo = new Member();
		
		minwoo.id = "minwoo";
		minwoo.passWord = "1q2w";
		minwoo.name = "민우";
		
		Member bumseok = new Member("bumseok", "1234", "범석");
		
		System.out.println(minwoo);
		System.out.println(minwoo.toString());
		
		ArrayList<Member> memberList = new ArrayList<Member>();
		
		memberList.add(minwoo);
		memberList.add(bumseok);
		
		System.out.println(memberList);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("행동을 선택해주세요.");
			System.out.println("1. 회원가입 | 2. 회원조회 | 3. 회원탈퇴 | 4. 종료");
			System.out.print(">>> ");
			
			int command = Integer.parseInt(sc.nextLine());
			
			if(command == 1) {
				// 회원가입
				System.out.print("아이디를 입력해주세요: ");
				String id = sc.nextLine();
				System.out.print("비밀번호를 입력해주세요: ");
				String pw = sc.nextLine();
				System.out.print("이름을 입력해주세요: ");
				String name = sc.nextLine();
				
				// 위 id, pw, name을 이용해서
				// Member 객체를 만드시고,
				// memberList에 추가해주시면 됩니다.
//				Member yujin = new Member(id, pw, name);
//				memberList.add(yujin);
				
				// 아이디 중복 여부
				boolean isDuple = false;
				for(Member member : memberList) {
					if(member.id.equals(id)) {
						isDuple = true;
					}
				}
				
				if(!isDuple) {
					memberList.add(new Member(id, pw, name));
				}else {
					System.out.println("중복된 ID입니다.");
				}
				
			}else if(command == 2) {
				// 회원조회
//				for(int i = 0; i < memberList.size(); i++) {
//					System.out.println(memberList.get(i));
//				}
				
				for(Member member : memberList) {
					System.out.println(member);
				}
				
			}else if(command == 3) {
				// 회원탈퇴
				System.out.print("아이디를 입력해주세요: ");
				String id = sc.nextLine();
				
				Member temp = null;
				for(Member member : memberList) {
					if(member.id.equals(id)) {
						temp = member;
					}
				}
				memberList.remove(temp);
				
			}else if(command == 4) {
				// 종료
				System.out.println("종료하였습니다.");
				break;
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
			
		}
		
	}
}
