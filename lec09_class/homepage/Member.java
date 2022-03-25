package lec09_class.homepage;

public class Member {
	private String id;
	private String passWord;
	
	public Member(String id, String passWord) {
		super();
		this.id = id;
		this.passWord = passWord;
	}
	
	public Member() {
		
	}

	@Override
	public String toString() {
		return "[아이디: " + id + ", 비밀번호: " + passWord + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
}
