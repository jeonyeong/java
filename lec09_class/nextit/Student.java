package lec09_class.nextit;

public class Student {
	String name;		// 학생의 이름
	int stress;			// 학생의 스트레스 지수
	int level;			// 학생의 레벨
	
	// [단축키 Alt + Shift + S] 또는 [마우스 우클릭 - Source]
	// Generate Constructor using Fields
	Student(String name, int stress, int level) {
		this();		// 현재 객체의 생성자
		this.name = name;
		this.stress = stress;
		this.level = level;
	}
	
	// [단축키 Alt + Shift + S] 또는 [마우스 우클릭 - Source]
	// Generate toString()...
	@Override
	public String toString() {
		return "[이름: " + name + ", 스트레스: " + stress + ", 레벨: " + level + "]";
	}
	
	
	// 메소드 오버로딩과 매우 유사
	Student(String name, int level){
		// 방법 1.
//		this();
//		this.name = name;
//		this.stress = 0;	// 기본값(default) 주기
//		this.level = level;
		
		// 방법 2.
		this(name, 0, level);
	}
	
	


	// 기본 생성자
	// 클래스 내에 생성자를 따로 만들지 않는다면
	// 생략된 상태로 존재한다.
	// 생성자를 따로 만든 후에, 기본 생성자를
	// 사용하고자 한다면 따로 만들어 주어야 한다.
	Student(){
		System.out.println("나 강림");
	}
	
	
	public void goToSchool() {
		System.out.println(name + "씨가 학원에 도착했습니다.");
		stress += 100;
	}

	public void eatLunch() {
		System.out.println(name + "씨가 점심을 먹습니다.");
		stress -= 50;
	}
	
	public void goToHome() {
		System.out.println(name + "씨가 집으로 귀가합니다.");
		stress = 0;
		
		this.levelUp();
	}
	
	private void levelUp() {
		int randInt = (int)(Math.random() * 5) + 1;
		level += randInt;
		
		System.out.println(name + "씨의 레벨이 " + randInt 
					+ "만큼 상승하였습니다.");
	}
	
	
}
