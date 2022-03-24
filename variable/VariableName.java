package lec02_variable_type;

public class VariableName {
	// 프로젝트 이름은 앞에 알파벳 대문자를 쓴다.
	// 패키지 이름은 전부 소문자로 쓴다.
	// 클래스 이름은 앞에 알파벳 대문자를 쓴다.
	
	// 변수명 짓기
	// 카멜(Camel) 방식
	int todayIsHappy = 0;
	// 스네이크 방식
	int today_is_happy = 1;
	// 헝가리안 방식
	int intTodayIsHappy = 2;
	String strTodayIsHappy = "행복해";
	// 변수면 변수명 앞에 v_ 를, 함수면 함수명 앞에 f_ 를, 파라미터면 파라미터명 앞에 p_
	int v_todayIsHappy = 3;
	
	
	// 변수명 규칙
	// 공백문자 및 특수문자는 사용 불가
	// 영어 대소문자를 구분한다.
	int todayIsHappy2;
	
	// 숫자를 맨 앞에 쓸 수 없다.
//	int 2todayIsHappy;
	
	// 글자 수의 제한은 없다.
	String nextItPhone = "0427518850";
	
	// 맨 앞에 $, _ 기호를 쓸 수 있다.
	int $todayIsHappy = 0;
	int _todayIsHappy = 0;
	
	// 자바 예약어 사용불가
//	int private = 4;
//	int Private = 5;
	
}
