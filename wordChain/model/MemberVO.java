package sumbmit4.model;

public class MemberVO {

	private String id;
	private String pw;
	private int win;
	private int lose;
	public MemberVO() {}
	public MemberVO(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
		this.win = win;
		this.lose = lose;
	}
	public MemberVO(int win,int lose) {
		this.win = win;
		this.lose = lose;
	}
	public String rate() {
		int total = win + lose;
		double rate = ((double)win/total) * 100;
		 int intRate = (int)rate;
		 String strRate = Integer.toString(intRate);
		 return strRate;
	}
		
	
	@Override
	public String toString() {
		return "["+"아이디 = " + id + ", 승리 = " + win + ", 패배 = " + lose + ",승률=" +  rate() + "]" ;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public int getWin() {
		return win;
	}
	public void setWin(int win) {
		this.win = win;
	}
	public int getLose() {
		return lose;
	}
	public void setLose(int lose) {
		this.lose = lose;
	}
	
	
	
	
	
}
