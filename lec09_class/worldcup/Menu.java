package lec09_class.worldcup;

public class Menu {
	// 캡슐화
	// 1. 필드 변수들의 접근 제어자를 private 으로 만든다.
	private String name;
	private boolean isSelect = false;
	
	public Menu(String name, boolean isSelect) {
		this.name = name;
		this.isSelect = isSelect;
	}
	
	public Menu(String name) {
		this.name = name;
	}
	
	public Menu(){}

	@Override
	public String toString() {
		return "Menu [name=" + name + ", isSelect=" + isSelect + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isSelect() {
		return isSelect;
	}

	public void setSelect(boolean isSelect) {
		this.isSelect = isSelect;
	}
	
	// 클래스 만들때 국룰(국민룰)
	// [단축키 Alt - Shift - S] 또는 [마우스 우클릭 - Source]
	// 2. Generate Constructor using Fields
	// 3. 기본 생성자 추가
	// 4. Generate toString
	// 5. Generate Getters and Setters
	
	
	
	
}
