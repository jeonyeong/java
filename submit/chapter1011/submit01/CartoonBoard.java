package submit.chapter1011.submit01;

public class CartoonBoard extends Board {
private String img;
	
	public CartoonBoard(int no, String title, String content, String img) {
		super(no, title, content);
		this.img = img;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

}
