package lec11_java_api;

import java.util.regex.Pattern;

public class ApiPattern {

	public static void main(String[] args) {
		// 정규표현식 (Regular Expression)
		// 특정한 규칙을 가진 문자열의 집합을 표현하기 위해 쓰는 형식
		// 전화번호, 주민등록번호, 이메일 등과 같이 정해진 형식에
		// 대해 정규표현식 + Pattern을 이용하여 검증할 수 있다.
		
		// 숫자만 존재하는지 검증
		String regex = "[0-9]*";
		String example = "123432";
		boolean result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " 결과 = " + result);
		
		// 숫자 검증 두번째
		regex = "\\d*";
		example = "7838483";
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " 결과 = " + result);
		
		System.out.println("\n============================\n");
		
		// 알파벳만 존재하는지 검증
		regex = "[a-zA-Z]*";
		example = "Jeong Chanung";	// 띄어쓰기가 있어도 안됨
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " 결과 = " + result);
		
		// 띄어쓰기 포함
		regex = "[a-zA-Z ]*";
		regex = "[a-zA-Z\\s]*";		// 정석대로면 공백을 나타내는 \\s 넣음
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " 결과 = " + result);
		
		System.out.println("\n=================================\n");
		
		// 한글로만 존재하는지 검증
		regex = "[가-힣]*";
		example = "정찬웅";
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " 결과 = " + result);
		
		System.out.println("\n=================================\n");
		
		// 비밀번호 패턴
		// 영어와 숫자로만 구성
		regex = "[a-zA-Z\\d]*";
		regex = "\\w*";
		example = "akow283";
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " 결과 = " + result);
		
		// 영어와 숫자 + 특수문자(필수 아님)
		regex = "[\\w!@#$%^&*=+-_)(]*";
		example = "nextit28850";
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " 결과 = " + result);
	
		// 숫자, 영어 소문자 및 대문자, 특수문자가 각각 1개 이상
		// 포함되며, 비밀번호 자리가 8~20자리인지
		regex = "^(?=.*[a-zA-Z])(?=.*\\d)(?=.*\\W).{8,20}$";
		example = "nextIt1234!";
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " 결과 = " + result);
		
		// 6자리 숫자 비밀번호 중 3자리 이상 반복 금지
		regex = "^.*(\\d)\\1\\1.*$";
		example = "122234";
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " 결과 = " + result);
		
		regex = "[\\d]{6}";
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " 결과 = " + result);
		
		System.out.println("\n============================\n");
		
		// 이메일 형식 확인
		regex = "^[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-z]+$";
		example = "akow283@gmail.com";
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " 결과 = " + result);
		
		// 연락처 형식 확인
		regex = "^[0-9]{2,3}-[0-9]{3,4}-[0-9]{4}$";
		example = "010-7398-7332";
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " 결과 = " + result);
		
		
		
	}
	

}
