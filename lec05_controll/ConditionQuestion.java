package lec05_controll;

import java.util.Scanner;

public class ConditionQuestion {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("이름을 입력해주세요 >> ");
//		String name = sc.nextLine();
//		System.out.print("연락처를 \"-\"없이 입력해주세요 >> ");
//		String phone = sc.nextLine();
//		System.out.print("나이를 입력해주세요 >> ");
//		String age = sc.nextLine();
//		
//		if((name.length() > 0) 
//				&& (phone.length() == 11 || phone.length() == 10) 
//				&& (Integer.parseInt(age) >= 14)) {
//			System.out.println("회원가입 버튼 활성화");
//		}else {
//			System.out.println("회원가입 불가");
//		}
		
		
		// 사용자로부터 국어, 영어, 수학 점수를 각각
		// 입력받아 평균점수를 구하고, 등급을 출력해주세요.
		// 평균점수가 90점 이상이면 A, 80점 이상 B,
		// 70점 이상 C, 나머지 D
		
		// 사용자로부터 입력받을 점수들
		// 점수들을 int로 변환하여 세 과목을 더하고 나누기 3
		// if문을 사용해서 등급을 출력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력해주세요 >> ");
		String korean = scan.nextLine();
		System.out.print("영어 점수를 입력해주세요 >> ");
		String english = scan.nextLine();
		System.out.print("수학 점수를 입력해주세요 >> ");
		String math = scan.nextLine();
		
		int intKor = Integer.parseInt(korean);
		int intEng = Integer.parseInt(english);
		int intMath = Integer.parseInt(math);
		
		double average = (intKor + intEng + intMath) / 3.0;
		System.out.println("평균 : " + average);
				
		int result = (int) Math.round(average);
		System.out.println("반올림한 값 : " + result);
		
		if(result >= 90) {
			System.out.println("A 등급");
		}else if(result >= 80) {
			System.out.println("B 등급");
		}else if(result >= 70) {
			System.out.println("C 등급");
		}else {
			System.out.println("D 등급");
		}
		
		
	}
}
