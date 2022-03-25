package lec07_array;

public class Lotto {
	public static void main(String[] args) {
		// 로또
		// Math.random() : 0부터 1사이의 랜덤 실수를 생성
		// 0 ~ 0.9999999999
		// 로또는 1부터 45까지 6자리의 숫자 배열
		
		// Math.random() * 10 을 하면 0 ~ 9.99 (int 0~9)
		// Math.random() * 100 을 하면 0 ~ 99.99 (int 0~99)
		// Math.random() * 45 을 하면 0 ~ 44.99 (int 0~44)
		
		int lottoNum = (int)((Math.random() * 45) + 1);
//		System.out.println(lottoNum);
//		System.out.println(lottoNum);
//		
//		System.out.println((int)((Math.random() * 45) + 1));
//		System.out.println((int)((Math.random() * 45) + 1));
//		System.out.println((int)((Math.random() * 45) + 1));
//		System.out.println((int)((Math.random() * 45) + 1));
//		System.out.println((int)((Math.random() * 45) + 1));
//		System.out.println((int)((Math.random() * 45) + 1));
		
		
//		myLotto[0] = 랜덤로또번호
//		myLotto[1] = 랜덤로또번호
//		myLotto[5] = 랜덤로또번호
		
		// myLotto 에 Math.random()을 이용해서
		// 로또 번호(1~45)를 중복되지 않게 담아주세요.
		
//		for ( int i = 0; i < myLotto.length; i++ ) {
//			myLotto[i] = (int)(Math.random() * 45) + 1;
//			for (int j = 0; j < i; j++ ) {
//				if ( myLotto[i] == myLotto[j] )
//					i--;
//			}
//		}
//		ArrayStudy.printArray(myLotto);
		
		int[] winLotto = {1, 4, 29, 39, 43, 45};
		int[] lottoArr = makeLotto();
		
		ArrayStudy.printArray(winLotto);
		ArrayStudy.printArray(lottoArr);
		
		// winLotto 와 lottoArr을 비교해서
		// 당첨 갯수를 리턴하는 함수를 만들어주세요.
		
		System.out.println(compareLotto(winLotto, lottoArr));

		long runTime = 0;
		while(true) {
			System.out.println(++runTime + "회 실행");
			
			if(compareLotto(winLotto, makeLotto())) {
				System.out.println("1등 당첨!!!");
				System.out.println("구매 횟수: " + runTime);
				System.out.println("구매 금액: " + (runTime * 1000));
				break;
			}
		}
		
	} // main 끝
	
	// 두 숫자 배열을 비교하여 6개가 같다면 true를 리턴
	public static boolean compareLotto(int[] winArr, int[] myArr) {
		int result = 0;
		for(int i = 0; i < winArr.length; i++) {
			if(winArr[i] == myArr[i]) {
				result += 1;
			}
		}
//		if(result == 6) {
//			return true;
//		}
//		return false;
		System.out.println(result + "개 일치");
		return (result == 6);
	}
	
	
	// 로또 만들어서 숫자 배열 리턴
	public static int[] makeLotto() {
		// 유용한 단축키
		// [Alt + Shift + R] 변수의 이름을 바꿀때,
		// 변수가 사용되고 있는 부분들까지 한번에 바꿀 수 있다.
		int[] myLotto = new int[6];
		
		int idx = 0;
		while(true) {
			int lotto = (int)(Math.random()*45 + 1);
			boolean isEqual = false;
			
			// 중복체크
			for(int i = 0; i < idx; i++) {
				if(lotto == myLotto[i]) {
					isEqual = true;
				}
			}
			
			if(isEqual == false) {
				myLotto[idx] = lotto;
				idx++;
				if(idx > 5) {
					break;
				}
			}
		}
//		ArrayStudy.printArray(myLotto);
		
		// 로또는 정렬도 해야함 (오름차순)
		
		// 정렬 알고리즘
		// 버블 정렬
		for(int i = 0; i < myLotto.length; i++) {
			boolean swapped = false;
			
			for(int j = 0; j < myLotto.length -1 - i; j++) {
				if(myLotto[j] > myLotto[j+1]) {
					// myLotto의 j와 j+1 자리 바꾸기
					myLotto[j] = myLotto[j] + myLotto[j+1];
					myLotto[j+1] = myLotto[j] - myLotto[j+1];
					myLotto[j] = myLotto[j] - myLotto[j+1];
					swapped = true;
				}
			}
			
			if(swapped == false) {
				break;
			}
		}
		
//		ArrayStudy.printArray(myLotto);
		return myLotto;
	}
	
	
	
}
