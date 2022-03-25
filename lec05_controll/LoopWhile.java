package lec05_controll;

import java.util.Scanner;

public class LoopWhile {
	public static void main(String[] args) {
		// while문
		
		int i = 2;	// 초기화식
		while(i <= 9) {	// 조건식
			System.out.println("2 x " + i + " = " + (2*i));
			i++;	// 증감식
		}
		
		// for문의 향기가..
		
		System.out.println("\n=====================\n");
		
		i = 2;
		// 못생긴 for문은 쓰지맙시다.
		for(;i <= 9;) {	// 조건문
			System.out.println("2 x " + i + " = " + (2*i)); // 실행문
			i++;	// 증감식
		}
		
		System.out.println("\n========================\n");
		
		// level 1
		boolean isRunning = true;
		Scanner sc = new Scanner(System.in);
		
//		while(isRunning) {
//			System.out.print("콘솔에 출력할 내용 입력[종료 q 또는 Q]: ");
//			
//			String inputText = sc.nextLine();
//			
//			if(inputText.equals("q") || inputText.equals("Q")){
//				System.out.println("프로그램이 종료되었습니다.");
//				isRunning = false;
//			}else {
//				System.out.println(inputText);
//			}
//		}
		
		// level 2
//		while(true) {
//			System.out.print("콘솔에 출력할 내용 입력[종료 q 또는 Q]: ");
//			String inputText = sc.nextLine();
//			
//			// .toLowerCase() 해당 알파벳을 소문자로 바꿔준다.
//			if(inputText.toLowerCase().equals("q")) {
//				System.out.println("프로그램이 종료되었습니다.");
//				break;
//			}else {
//				System.out.println(inputText);
//			}
//		}
		
		System.out.println("\n============================\n");
		
		// do-while문
//		isRunning = false;
//		do {
//			System.out.println("프로그램이 시작되었습니다.");
//		}while(isRunning);
//		
//		String inputString = "";
//		do {
//			System.out.print("콘솔에 출력할 내용 입력[종료 q 또는 Q]: ");
//			inputString = sc.nextLine();
//			System.out.println(inputString);
//		}while(!inputString.toUpperCase().equals("Q"));
		
		System.out.println("\n=============================\n");
		
		// 이중(다중) while문
		// 구구단
		
		// 2 x 2 = 4
		// 2 x 3 = 6
		// 2 x 9 = 18
		// 3 x 2 = 6
		int intVal = 2;
		while(intVal <= 9) {
			int rightVal = 2;
			while(rightVal <= 9) {
				System.out.println(intVal + " x " + rightVal 
						+ " = " + (intVal * rightVal));
				rightVal++;
			}
			System.out.println();
			intVal++;
		}
		
		System.out.println("\n=========================\n");
		
		// 포켓몬스터
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("야생의 단데기를 만났습니다."
					+ " 행동을 선택해주세요.");
			System.out.println("1. 공격 | 2. 도망");
			System.out.print(">> ");
			
			String inputText = scan.nextLine();
			
			if(inputText.equals("1")) {
				while(true) {
					System.out.println("공격 방법은?");
					System.out.println("1. 백만볼트 | 2. 전광석화 | 3. 취소");
					System.out.print(">> ");
					
					String attack = scan.nextLine();
					if(attack.equals("1")) {
						System.out.println("피카츄 백만볼트!!");
					}else if(attack.equals("2")) {
						System.out.println("피카츄 전광석화!!");
					}else if(attack.equals("3")) {
						break;	// 내부 while문은 더이상 실행되지 않음
								// 외부 while문은 계속 실행
					}else {
						System.out.println("잘못 입력하셨습니다.");
					}
				}
			}else if(inputText.equals("2")) {
				System.out.println("단데기를 상대로 도망쳤습니다.");
				break;
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		
		scan.close();	// 사용자로부터 값을 입력받는 
						// Scanner 객체를 종료한다.
		
//		String inputText = scan.nextLine();
		// scanner를 닫은 이후 입력 받으려하면 에러가 난다.
		// 즉, 더 이상 입력받을 일이 없을때 close()를 해준다.
		
		// 사실 Scanner는 AutoCloseable을 구현하고 있기 때문에
		// 자동으로 close 되고 있지만, 명시적으로 close를 해주면 좋다.
		
		// Ctrl + 마우스 클릭 -> 해당 변수가 선언된 위치나, 
		// 해당 클래스가 있는 위치 등등을 찾아갑니다.
		
		
		
	}
}
