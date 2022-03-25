package lec10_extends_interface.ramen;

public class BuldakRamen extends Ramen {

	public BuldakRamen(String name, int price) {
		super(name, price);
	}

	@Override
	public void printRecipe() {
		System.out.println("끓는 물에 면을 삶은 후 액상스프를 넣어 비벼드세요.");
	}
	
}
