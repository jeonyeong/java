package submit.chapter1011.submit03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateBoard implements Comparable{
	private String title;
	private String date;
	
	public DateBoard(String title, String date) {
		this.title = title;
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "DateBoard [title=" + title + ", date=" + date + "]";
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

	@Override
	public int compareTo(Object o) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		try {
			Date thisDate = sdf.parse(date);
			Date enemyDate = sdf.parse(((DateBoard)o).getDate());
			
			long diff = thisDate.getTime() - enemyDate.getTime();
			
			int result = 0;
			if(diff > 0) {
				result = 1;
			}else if(diff < 0) {
				result = -1;
			}
			
			return result;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return 0;
	}

}
