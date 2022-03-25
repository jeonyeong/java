package lec05_controll;

public class LoopWhileQuestion {
	public static void main(String[] args) {
		// while문이랑 for문이랑 표현만 좀 다르지
		// 결국 같은 반복문입니다.
		
		// 그렇다면 크리스마스 트리를 while문으로 출력해주세요.
		
		// 크리스마스가 지났지만 5층 크리스마스 트리를
		// 만들어 봅시당
		
		//      *
		//     ***
		//    *****
		//   *******
		//  *********
		
		String star = "*";
		String blank = "";
		
		int i = 0;
		while(i < 5) {
			if(i > 0) {
				star += "**";
			}
			blank = "";
			int j = 1;
			while(j < 5-i) {
				blank += " ";
				j++;
			}
			System.out.println(i + ": " + blank + star);
			i++;
		}
		
		
	}
}
