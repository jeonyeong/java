package sumbmit4.model;

import java.util.ArrayList;

public class Word {
String word;
ArrayList<Word> wordList = new ArrayList();

public Word() {}

public Word(String word, ArrayList<Word> wordList) {
	super();
	this.word = word;
	this.wordList = wordList;
}

@Override
public String toString() {
	return "[" + word + "]";
}

public String getWord() {
	return word;
}

public void setWord(String word) {
	this.word = word;
}

public ArrayList<Word> getWordList() {
	return wordList;
}

public void setWordList(ArrayList<Word> wordList) {
	this.wordList = wordList;
}

}

