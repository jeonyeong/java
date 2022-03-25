package lec10_extends_interface.ramen;

public class JinRamen extends Ramen {

	public JinRamen(String name, int price) {
		super(name, price);
	}

	// 상속받은 추상 클래스의 추상 메소드를 반드시 
	// 재정의(Override)해야 한다.
	@Override
	public void printRecipe() {
		System.out.println("끓는 물에 면과 스프를 넣고 3분 후 드세요.");
	}

}
