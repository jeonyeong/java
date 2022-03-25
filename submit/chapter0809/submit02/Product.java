package submit.chapter0809.submit02;

public class Product {
	private String name; 		
	private int price; 			
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public Product() {}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
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
