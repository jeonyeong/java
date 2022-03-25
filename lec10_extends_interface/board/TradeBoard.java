package lec10_extends_interface.board;

public class TradeBoard extends Board {
	private String image;		// 제품 이미지
	private int price;			// 제품 가격
	
	public TradeBoard(int no, String title, String content, String author, String image, int price) {
		super(no, title, content, author);
		this.image = image;
		this.price = price;
	}

	@Override
	public String toString() {
		return super.toString() + ", image=" + image + ", price=" + price + "]";
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
