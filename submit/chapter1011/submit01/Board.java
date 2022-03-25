package submit.chapter1011.submit01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Board {
	private int no;
	private String title;
	private String date;
	private String content;
	
	public Board(int no, String title, String content) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		this.date = sdf.format(new Date());
	}

	@Override
	public String toString() {
		return "[" + no + ". | " + title +  " | " + date + "]";
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
