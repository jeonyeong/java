package lec09_class.typing;

import java.util.ArrayList;

/**
 * 타자 연습 때 나오는 문자들을 가지고 있는 클래스
 */
public class Dictionary {
	ArrayList<String> words;

	public Dictionary() {
		this.words = new ArrayList<String>();
		
		words.add("박재훈");
		words.add("강욱근");
		words.add("전영");
		words.add("최지혜");
		words.add("김지훈");
		words.add("박상우");
		words.add("이용석");
		words.add("이주석");
		words.add("신예반");
		words.add("조서준");
		words.add("오현철");
		words.add("이원태");
		words.add("이철현");
		words.add("이유진");
		words.add("김범석");
		words.add("이민우");
		words.add("정찬웅");
		words.add("김남규");
		words.add("소은지");
	}

	public void showWords() {
		System.out.println(words.get(0));
	}
	
	public void removeWord(String word) {
		words.remove(word);
	}
	
	public int countWords() {
		return words.size();
	}
	
	
}
