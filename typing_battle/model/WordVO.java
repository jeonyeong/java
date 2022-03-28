package typing_battle.model;

public class WordVO {
	private int wordsLevel;		// 단어 수준
	private String wordsword;	// 단어
	
	public WordVO() {}
	
	public WordVO(int wordsLevel, String wordsword) {
		super();
		this.wordsLevel = wordsLevel;
		this.wordsword = wordsword;
	}
	
	@Override
	public String toString() {
		return "WordVO [wordsLevel=" + wordsLevel + ", wordsword=" + wordsword + "]";
	}
	
	public int getWordsLevel() {
		return wordsLevel;
	}
	public void setWordsLevel(int wordsLevel) {
		this.wordsLevel = wordsLevel;
	}
	public String getWordsword() {
		return wordsword;
	}
	public void setWordsword(String wordsword) {
		this.wordsword = wordsword;
	}
	
}
