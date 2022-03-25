package lec05_controll;

public class Conditional {
	public static void main(String[] args) {
		// 조건문
		
		// if문
		int intVar = 3;
		if(intVar > 0) {
			System.out.println("intVar이 0보다 큽니다.");
		}
		
		if(intVar > 0) { System.out.println("intVar이 0보다 큽니다."); }
		
		// 블록{} 안 명령어가 한줄이면 블록을 생략해도 정상 작동
		if(intVar > 0) System.out.println("intVar이 0보다 큽니다.");
		
		System.out.println("\n======================\n");
		
		intVar = 0;
		if(intVar < 0) {
			System.out.println("intVar이 0보다 작습니다.");
		}else {
			System.out.println("intVar이 0보다 크거나 같습니다.");
		}
		
		if(intVar < 0) {
			System.out.println("intVar이 0보다 작습니다.");
		}else if(intVar == 0) {
			System.out.println("intVar이 0입니다.");
		}else {
			System.out.println("intVar이 0보다 큽니다.");
		}
		
		// 웹 브라우저에서 사용자가 로그인을 하면
		// 해당 브라우저의 세션 스토리지에 정보가 저장이 되는데,
		// 이 정보를 이용해서 로그인 된 화면 혹은
		// 로그인하지 않은 화면을 보여줍니다.
		
		// jsp 때는 세션에서 정보를 가져온다.
		String loginId = "akow283";		
		
		if(loginId != null) {
			System.out.println("로그인 상태의 화면을 보여준다.");
		}else {
			System.out.println("로그인 화면으로 이동시켜준다.");
		}
		
		
		// 리모콘의 전원 버튼의 경우 버튼 하나로
		// on/off가 다 가능합니다.
		// 해당 버튼 이벤트에 전원의 상태를 체크하는 기능이 있겠죠?
		
		boolean isPowerOn = false;
		
		// 전원 버튼을 눌렀을때의 로직
		if(isPowerOn) {	// isPowerOn이 true면 TV가 켜져있다.
			System.out.println("TV를 끕니다.");
			isPowerOn = false;
		}else {
			System.out.println("TV를 켭니다.");
			isPowerOn = true;
		}
		
		if(isPowerOn) {	
			System.out.println("TV를 끕니다.");
			isPowerOn = !isPowerOn;
		}else {
			System.out.println("TV를 켭니다.");
			isPowerOn = !isPowerOn;
		}
		
		// boolean의 true/false를 스위치의 on/off처럼 사용하는
		// boolean 변수를 토글(toggle) 혹은 플래그(flag)라고 합니다.
		
		System.out.println("\n========================\n");
		
		// 주민번호 뒷자리의 첫번째 숫자로 성별찾기
		String hisIdBack = "1367423";
		int idNumFirst = Integer.parseInt(hisIdBack.substring(0, 1));
		
		if(idNumFirst % 2 == 0) {	// 짝수
			System.out.println("여성입니다.");
		}else {		// 홀수
			System.out.println("남성입니다.");
		}
		
		
		// 이중 삼항 연산자
		int score = 85;
		String grade = "";
		
		// score가 90점보다 크면 grade는 A,
		// 80점보다 크면 grade는 B, 나머지는 C
		if(score > 90) {
			grade = "A";
		}else if(score > 80) {
			grade = "B";
		}else {
			grade = "C";
		}
		System.out.println(grade + "등급 입니다.");
		
		// 순서에 주의해야 하는 경우
		score = 92;
		if(score > 80) {
			grade = "B";
		}else if(score > 90) {
			grade = "A";
		}else {
			grade = "C";
		}
		System.out.println(grade + "등급입니다.");
		
		// 명확히 하거나, 순서를 잘 생각해주세요.
		if(score > 80 && score <= 90) {		// 80 < score <= 90
			grade = "B";
		}else if(score > 90) {
			grade = "A";
		}else {
			grade = "C";
		}
		System.out.println(grade + "등급입니다.");
		
		
		// 사용자가 회원가입을 할 때,
		// 입력 정보를 전부 확인한 후
		// 회원가입 버튼을 활성화 시킨다.
		String name = "";
		String phone = "";
		String age = "";	// 14세 이상이어야 한다.
		
		// level 1
		if(name.length() > 0) {		// isNotEmpty 와 같다.
			if(phone.length() == 11 || phone.length() == 10) {
				if(Integer.parseInt(age) >= 14) {
					System.out.println("회원가입 버튼 활성화");
				}else {
					System.out.println("회원가입 불가");
				}
			}else {
				System.out.println("회원가입 불가");
			}
		}else {
			System.out.println("회원가입 불가");
		}
		
		// level 2
		boolean isGood = false;
		if(name.length() > 0) {
			if(phone.length() == 11 || phone.length() == 10) {
				if(Integer.parseInt(age) >= 14) {
					isGood = true;
				}
			}
		}
		
		if(isGood) {
			System.out.println("회원가입 버튼 활성화");
		}else {
			System.out.println("회원가입 불가");
		}
		
		
		// level 3
		if((name.length() > 0) 
				&& (phone.length() == 11 || phone.length() == 10) 
				&& (Integer.parseInt(age) >= 14)) {
			System.out.println("회원가입 버튼 활성화");
		}else {
			System.out.println("회원가입 불가");
		}
		
		
		// 값을 매칭하는 경우가 많을 때,
		
		int month = 0;	// 여러분들의 교육기간(단위: 월)
		
		if(month == 0) {
			System.out.println("열심히 배우고 있습니다.");
		}else if(month == 1) {
			System.out.println("오라클 DB 마스터~");
		}else if(month == 2) {
			System.out.println("자바 마스터~");
		}else if(month == 3) {
			System.out.println("자바스크립트 마스터~");
		}else if(month == 4) {
			System.out.println("JSP 마스터~");
		}else if(month == 5) {
			System.out.println("팀프로젝트 합시다~");
		}else {
			System.out.println("수료!! 고생하셨습니다~");
		}
		
		// switch문
		// switch() 괄호 안에는 char, int, String 타입의 변수만
		// 적용이 가능하다.
		
		month = 3;
		switch(month) {
			case 0:
				System.out.println("열심히 배우고 있습니다.");
				break;
			case 1:
				System.out.println("DB 마스터");
				break;
			case 2:
				System.out.println("java 마스터");
				break;
			case 3:
				System.out.println("JS 마스터");
				break;
			case 4:
				System.out.println("팀 프로젝트");
				break;
			default:
				System.out.println("수료!!");
		}
		
				
		
	}
}
