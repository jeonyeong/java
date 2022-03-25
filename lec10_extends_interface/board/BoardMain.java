package lec10_extends_interface.board;

public class BoardMain {

	public static void main(String[] args) {
		Board board = new Board(1, "첫번째 게시글", "1등이닭", "akow283");
		System.out.println(board.toString());

		// 중고거래 게시판
		// 필드에 제품 이미지, 제품 가격
		TradeBoard trade = new TradeBoard(1, "나이키 신발 팝니다"
				, "선제", "minwoo", "나이키신발.jpg", 50000);
		System.out.println(trade.toString());
		
		// 동영상 게시판
		// 필드에 링크
		VideoBoard video = new VideoBoard(1, "찬웅쌤 매드무비"
				, "펜타킬 ㄷㄷ", "akow283", "https://www.youtube.com/watch?v=LFvE4l5vjAA");
		
		System.out.println(video.toString());
	}

}
