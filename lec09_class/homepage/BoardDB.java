package lec09_class.homepage;

import java.util.ArrayList;

public class BoardDB {
	
	private BoardDB() {
		
	}
	
	private static BoardDB instance = new BoardDB();
	
	public static BoardDB getInstance() {
		return instance;
	}
	
	private ArrayList<Board> boardList = new ArrayList<Board>();
	
	// 글쓰기
	public void addBoard(Board board) {
		boardList.add(board);
	}
	
	// 시퀀스 제공
	public int sizeBoard() {
		return boardList.size() + 1;
	}
	
	// 게시글 목록 조회
	public void showList() {
		System.out.println("게시판=========================");
		for(int i = 0; i < boardList.size(); i++) {
			System.out.println(boardList.get(i).toString());
		}
		System.out.println("===============================");
	}
	
	// 게시글 조회
	public void selectBoard(int no) {
		for(int i = 0; i < boardList.size(); i++) {
			if(boardList.get(i).getNo() == no) {
				boardList.get(i).showBoard();
			}
		}
	}
	
	
}
