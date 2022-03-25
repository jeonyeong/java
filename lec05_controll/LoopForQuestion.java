package lec05_controll;

public class LoopForQuestion {
	public static void main(String[] args) {
		// 거꾸로 트리를 5층 만들어 주세요
		// *****
		// ****
		// ***
		// **
		// *
		String star = "*****";
		for(int i = 5; i > 0; i--) {
			String subStar = star.substring(0, i);
			System.out.println(subStar);
		}
		
		// 거꾸로 구구단 2단 출력해주세요.
		// 2 x 9 = 18
		// 2 x 8 = 16
		// 2 x 2 = 4
		for(int i = 9; i > 1; i--) {
			System.out.println("2 x " + i + " = " + (2*i));
		}
		
		System.out.println("\n=============================\n");
		
		// 월리를 찾아라!!
		String findWally = "윌리울리일리울리울리일리월리";
		System.out.println(findWally.length());
		
		// 월리가 몇개 들어있는지 콘솔에 출력해주세요.
		int countWally = 0;
		for(int i = 0; i < findWally.length()-1; i++) {
			// i는 0부터 12까지 증가한다.
			String subWally = findWally.substring(i, i+2);
			// errMsg: String index out of range
			// substring 함수를 사용시 잘라낼 변수의 길이가 
			// 벗어난 경우
			if(subWally.equals("월리")) {
				countWally += 1;
			}
		}
		System.out.println("월리는 총 " + countWally);
		
		System.out.println("\n==========================\n");
		
		// 크리스마스가 지났지만 5층 크리스마스 트리를
		// 만들어 봅시당
		
		//      *
		//     ***
		//    *****
		//   *******
		//  *********
		
		star = "*";
		String blank = "";
		
		for(int i = 0; i < 5; i++) {
			if(i > 0) {
				star += "**";
			}
			blank = "";
			for(int j = 1; j < 5-i; j++) {
				blank += " ";
			}
			
			System.out.println(i + ": " + blank + star);
		}
		
		System.out.println("\n=======================\n");
		
		// 크리스마스에 와인을 좀 마셨더니 트리가 거꾸로 보이네요
		// 거꾸로 트리를 만들어주세요
		
		// *********
		//  *******
		//   *****
		//    ***
		//     *
		
		// blank 는 0, 1, 2, 3, 4개
		// star 는 9, 7, 5, 3, 1개
		
		blank = "";
		for(int i = 0; i < 5; i++) {
			if(i > 0) {
				blank += " ";
			}
			star = "*";
			for(int j = 0; j < 4-i; j++) {
				star += "**";
			}
			
			System.out.println(i + ": " + blank + star);
		}
		
		
	}
}
