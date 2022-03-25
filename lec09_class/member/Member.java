package lec09_class.member;

public class Member {
	String id;			// 사용자 아이디
	String passWord;	// 사용자 비밀번호
	String name;		// 사용자 이름
	
	// 생성자 만들었다면
	// 기본생성자 Member(){} 또한 만들어 주어야
	// 기본생성자를 이용해서도 객체로 만들 수 있다.
	public Member(String id, String passWord, String name) {
		this.id = id;
		this.passWord = passWord;
		this.name = name;
	}
	
	Member(){
		
	}

	@Override
	public String toString() {
		return "[아이디: " + id + ", 비밀번호: " + passWord + ", 이름:" + name + "]";
	}
	
	
	
}
