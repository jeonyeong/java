package lec03_system_inout;

import java.util.Scanner;

public class SystemMain {

	public static void main(String[] args) {
		// 콘솔에 텍스트 출력하기
		System.out.println("이미 알고 있는거");	// 문자열 끝에 자동으로 줄바꿈을 넣어준다.
		System.out.print("이건 뭔가요?");		// 해당 문자열만을 출력
		System.out.printf("이건 또 뭐지?");		// 해당 문자열을 출력하지만, 문자열의 형식(format)을 바꿀 수 있다.

		System.out.println("==============================");
		
		// 제어문자
		// 문자열 내에 역슬래시(\)를 이용하여 특정 기능을 사용할 수 있다.
		
		// \t 탭
		System.out.println("*\t*\t*");
		System.out.println("**\t**\t**");
		System.out.println("***\t***\t***");
		
		// \n 줄바꿈
		System.out.print("나도 println이 되고 싶어\n");
		
		// \(기능을 가지는 문자)
		System.out.println("제어문자를 사용하려면 \\를 써야합니다.");
		System.out.println("소크라테스가 말하길.. \"너 자신을 알라\"");
		
		// 특수문자도 가능해요
		System.out.println("♡");
		
		
		// printf 는 포맷 문자열과 함께 사용
		System.out.printf("%d 명이 수업을 듣고 있습니다.\n", 21);
		System.out.printf("%d명이 수업을 %d 시간째 듣고 있습니다.\n", 21, 8);
		System.out.printf("%d명이 %s을 %d 시간째 듣고 있습니다.\n", 21, "수업", 8);
		
		int stuNum = 21;
		String strVar = "수업";
		int intVar = 8;
		System.out.println(stuNum + "명이 " + strVar + "을 " + intVar + " 시간째 듣고 있습니다.");
		
		System.out.printf("%02d장_표준입출력\n", 3);
		System.out.printf("%03d장_표준입출력\n", 3);
		System.out.printf("%03d장_표준입출력\n", 31);
		
		System.out.printf("%.03f\n", 3.14);
		System.out.printf("%.1f\n", 3.14);	// 반올림해서 소수 첫번째 자리까지만 출력
		
		
		System.out.println("==========================");
		
		// 표준 입력
		System.out.print("이름을 입력해주세요: ");
		Scanner scanner = new Scanner(System.in);
		String inputText = scanner.nextLine();
		
		System.out.println(inputText + "님 환영합니다.");
		
	}

}
