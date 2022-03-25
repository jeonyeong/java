package lec10_extends_interface.ramen;

// 추상 메소드를 가지고 있는 클래스는
// 무조건 추상클래스로 선언해야 한다.
public abstract class Ramen {
	private String name;
	private int price;
	
	public Ramen(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	// 라면의 레시피를 출력해주는 함수
	// 라면마다 레시피가 다르기 때문에
	// 추상 메소드로 만든다.
	public abstract void printRecipe();
	
	
	@Override
	public String toString() {
		return "Ramen [name=" + name + ", price=" + price + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
