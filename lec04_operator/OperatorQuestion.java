package lec04_operator;

public class OperatorQuestion {
	public static void main(String[] args) {
		// 삼항연사자를 이용해서
		// 아래의 주민번호 뒷자리의 첫번째 숫자에 따른 성별을
		// 받는 gender 변수에 담아 콘솔에 출력해보세요.
		// 항상 주민번호 뒷자리 첫번째 숫자가 홀수면 남성, 짝수면 여성
		
		// substring 으로 첫번째만 자른 다음
		// Integer.parseInt를 사용하여 숫자로 바꾸기
		// % 2 의 결과의 따라 홀수, 짝수 구분이 가능하겠죠?
		String hisIdBack = "1231476";
		String herIdBack = "4254654"; 
		
		int hisFirst = Integer.parseInt(hisIdBack.substring(0, 1));
		int herFirst = Integer.parseInt(herIdBack.substring(0, 1));
		
		String hisGender = (hisFirst % 2 == 1) ? "남자" : "여자";
		System.out.println(hisGender);
		
		String herGender = (herFirst % 2 == 1) ? "남자" : "여자";
		System.out.println(herGender);
		
		
	}
}
