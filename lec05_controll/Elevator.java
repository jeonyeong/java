package lec05_controll;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Elevator {
	public static void main(String[] args) {
		// 엘리베이터가 두 대 있는 빌딩에서 엘리베이터 버튼을
		// 눌렀을때, 한 대의 엘리베이터가 이동하는 프로그램 구현
		
		// 1. 사용자의 현재 위치를 Scanner로 입력하면
		//	 사용자의 위치와 더 가까운 엘리베이터가 이동한다.
		// 2. 사용자의 위치와 두 엘리베이터의 위치 차이가 동일하다면
		//	 둘 중 위 층의 엘리베이터가 내려온다.
		// 3. 사용자가 입력한 위치로 엘리베이터의 위치를 바꿔준다.
		// 4. 엘리베이터 프로그램을 종료하려면 q, Q, exit, EXIT, Exit을 입력
		
		// 너무 쉽다면
		// @. 사용자가 엘리베이터에 탑승하고 층을 입력하면,
		// 	 탑승 중인 엘리베이터가 해당 층으로 이동하도록 만들어보기
		// @. 사용자가 숫자가 아닌 다른 값을 입력했을때,
		// 	 "잘못 입력하셨습니다." 출력 후 다시 입력할 수 있게 만들기
		
		int elevatorA = 10; // 엘리베이터 A의 위치
		int elevatorB = 4;  // 엘리베이터 B의 위치
		Scanner sc = new Scanner(System.in);
		
		// 움직인 엘리베이터가 A면 1, B면 2
		final int ACTIVE_ELEVATOR_A = 1;
		final int ACTIVE_ELEVATOR_B = 2;
		int activeElevator = 0;
		
		while(true) {
			System.out.println("\n============= 희영빌딩 엘리베이터 ===============\n");
			System.out.println("승강기 A의 현재 위치: " + elevatorA);
			System.out.println("승강기 B의 현재 위치: " + elevatorB);
			System.out.print("몇층에 계시나요?[종료하려면 q 또는"
					+ " exit 입력] : ");
			
			String inputText = sc.nextLine();
			
			// 종료를 입력했는지 확인하고 종료시킴
			if(inputText.toLowerCase().equals("q") || 
					inputText.toLowerCase().equals("exit")) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
			
			// 숫자만 입력했는지 확인
			// regex
			// 단축키 [Ctrl + H] 핵 꿀팁!!
			String regex = "^[0-9]+$"; 
			// 문자열의 시작(^)과 끝($) 사이에 숫자[0-9]가
			// 한 개 이상(+) 존재하는지 체크하기 위한 정규표현식
			
			// inputText가 숫자로 이루어진 문자열이면 isNum은 true
			boolean isNum = Pattern.matches(regex, inputText);
			if(!isNum) {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			
			// 사용자가 입력한 층수를 int로 변환
			int custFloor = Integer.parseInt(inputText);
			System.out.println(custFloor + "층에서 엘리베이터 호출");
			
			// 사용자의 위치와 각 엘리베이터 층수의 차이 계산
			int diffFloorA = (custFloor > elevatorA) ? 
					(custFloor - elevatorA) : (elevatorA - custFloor);
			int diffFloorB = Math.abs(custFloor - elevatorB);		
			
			// 위치 차이에 따른 엘리베이터 이동
			if(diffFloorA > diffFloorB) {
				System.out.println("승강기 B가 " + custFloor 
						+ "층으로 이동하였습니다.");
				elevatorB = custFloor;
				activeElevator = ACTIVE_ELEVATOR_B;
			}else if(diffFloorA < diffFloorB) {
				System.out.println("승강기 A가 " + custFloor 
						+ "층으로 이동하였습니다.");
				elevatorA = custFloor;
				activeElevator = ACTIVE_ELEVATOR_A;
			}else {
				if(elevatorA > elevatorB) {
					System.out.println("승강기 A가 " + custFloor 
							+ "층으로 이동하였습니다.");
					elevatorA = custFloor;
					activeElevator = ACTIVE_ELEVATOR_A;
				}else {
					System.out.println("승강기 B가 " + custFloor 
							+ "층으로 이동하였습니다.");
					elevatorB = custFloor;
					activeElevator = ACTIVE_ELEVATOR_B;
				}
			}
			
			while(true) {
				System.out.print("어느 층으로 이동하시겠음? : ");
				inputText = sc.nextLine();
				
				isNum = Pattern.matches(regex, inputText);
				if(!isNum) {
					System.out.println("잘못 입력하셨습니다.");
					continue;
				}
				
				int goToFloor = Integer.parseInt(inputText);
				
				if(activeElevator == ACTIVE_ELEVATOR_A) {
					System.out.println("승강기 A가 " + goToFloor 
							+ "층으로 이동하였습니다.");
					elevatorA = goToFloor;
				}else if(activeElevator == ACTIVE_ELEVATOR_B) {
					System.out.println("승강기 B가 " + goToFloor
							+ "층으로 이동하였습니다.");
					elevatorB = goToFloor;
				}
				break;
			}
			
		}
		
	}
}
