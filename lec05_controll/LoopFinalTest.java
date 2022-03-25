package lec05_controll;

import java.util.Scanner;

public class LoopFinalTest {
	public static void main(String[] args) {
		// 복습시간

		// 팩토리얼 다들 기억하시나요?
		// 수학기호로 4! 는 4 팩토리얼을 의미하며,
		// 그 값은 4x3x2x1 = 24 입니다.

		// for문을 사용해서 10팩토리얼의 값을 출력해주세요.
		// 결과: 3628800
		// @ 15 팩토리얼의 값을 출력해주세요.
		// 결과: 1307674368000

		long result = 1;
		for (int i = 1; i <= 15; i++) {
			// 1x2x3x4x5x6x7x8x9x10
			result *= i;
			System.out.println(i + ": " + result);
		}

		System.out.println("\n============= 룰렛 이벤트 ==============\n");

		// 룰렛을 아주 힘차게 돌렸더니
		// 5834도가 돌아갔다고 합니다.
		// 한바퀴 당연히 360도 겠죠?

		// 그렇다면 룰렛이 멈추고난 각도에 따른 경품이
		// 뭔지 출력을 해주시고, 총 몇바퀴 돌아갔는지도 출력해주세요.
		// 0도 초과 ~ 60도 이하: 사탕
		// 60도 초과 ~ 120도 이하: 초콜릿
		// 120도 초과 ~ 180도 이하: 쿠키
		// 180도 초과 ~ 240도 이하: 콜라
		// 240도 초과 ~ 300도 이하: 아이스크림
		// 300도 초과 ~ 360(0)도 이하: 커피

		System.out.println((5834 / 360) + "바퀴");
		int angle = 5834 % 360; // 멈추고난 각도
		if (angle > 0 && angle <= 60) {
			System.out.println("사탕");
		} else if (angle > 60 && angle <= 120) {
			System.out.println("초콜릿");
		} else if (angle > 120 && angle <= 180) {
			System.out.println("쿠키");
		} else if (angle > 180 && angle <= 240) {
			System.out.println("콜라");
		} else if (angle > 240 && angle <= 300) {
			System.out.println("아이스크림");
		} else {
			System.out.println("커피");
		}

		System.out.println("\n============= 로꾸꺼 ==============\n");

		// 사용자가 입력한 문자열의 순서를 뒤집어서 출력해보세요.
//		Scanner sc = new Scanner(System.in);
//		System.out.print("거꾸로 뒤집을 문자열 입력: ");
//		String inputText = sc.nextLine();
//
//		// charAt 을 이용한 방법
//		for (int i = inputText.length() - 1; i >= 0; i--) {
//			System.out.print(inputText.charAt(i));
//		}
//		// 문자열 hello에서 charAt(0) 은 h 시작
//
//		// substring 을 이용한 방법
//		String reverse = "";
//		for (int i = inputText.length(); i > 0; i--) {
//			reverse += inputText.substring(i - 1, i);
//		}
//		System.out.println("로꾸꺼: " + reverse);
//
//		sc.close();

		// 코드 정렬이 어렵다면??
		// 단축키 [Ctrl + Shift + F] !!
		
		System.out.println("\n=========== 2월 달력 ============\n");
		
		// 2월 달력을 출력해봅시다.
		// 화요일에 1일 스타트
		// startDay 는 요일을 기준으로
		// 일요일 0, 월요일 1, 화 2, 수 3, 목 4, 금 5, 토 6
		int startDay = 2;
		int lastDay = 28;
		int currentDay = 1;
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for(int i = 0; i < 42; i++) {
			if(i >= startDay) {
				System.out.print(currentDay + "\t");
				currentDay++;
				if(currentDay > lastDay) {
					break;
				}
			}else {
				System.out.print("\t");
			}
			
			// i 가 6, 13, 20, 27인 경우 줄바꿈
			if(i % 7 == 6) {
				System.out.println();
			}
		}
		
		System.out.println("\n=========== 6월 달력 ============\n");
		
		startDay = 3;
		lastDay = 30;
		currentDay = 1;
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for(int i = 0; i < 42; i++) {
			if(i >= startDay) {
				if(currentDay < 10) {
					System.out.print(" ");
				}
				System.out.print(currentDay + "\t");
				currentDay++;
				
				if(currentDay > lastDay) {
					break;
				}
			}else {
				System.out.print("\t");
			}
			
			if(i % 7 == 6) {
				System.out.println();
			}
		}

	}
}
