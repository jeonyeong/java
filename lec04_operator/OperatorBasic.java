package lec04_operator;

public class OperatorBasic {
	public static void main(String[] args) {
		int intVar = 10;
		
		// 증감 연산자
		intVar++;	// 1이 증가
		System.out.println(intVar);
		intVar--;	// 1이 감소
		System.out.println(intVar);
		
		++intVar;	// 1 증가
		System.out.println(intVar);	// intVar 는 11
		
		System.out.println(intVar++);
		System.out.println(intVar);	// intVar 은 12
		
		System.out.println(++intVar);
		
		System.out.println("\n====================\n");
		
		char hangul = 44032;
		System.out.println(hangul);	// 가
		
		hangul++;
		System.out.println(hangul); // 각
		
		System.out.println(++hangul); // 갂
		System.out.println(++hangul); // 갃
		
		// 대입 연산자
		int intVal = 10;
		
		intVal += 1;
		// intVal++;
		System.out.println(intVal);
		
		intVal += 34;
		System.out.println(intVal);
		
		intVal -= 25;
		System.out.println(intVal);
		
		intVal *= 2;
		System.out.println(intVal);
		
		intVal /= 4;
		System.out.println(intVal);
		
		intVal %= 3;
		System.out.println(intVal);
		
		
		// 산술 연산자
		int numA = 10;
		int numB = 3;
		numA = numA + 3;
		System.out.println(numA);	// numA는 13
		
		int numC = numA + numB;
		System.out.println(numC);
		
		System.out.println("빼기: " + (numA - numB));
		System.out.println("곱하기: " + (numA*numB));
		System.out.println("나누기: " + (numA/numB));
		System.out.println("나머지: " + (numA%numB));
		
		numC = 10 + 3 * 10;
		System.out.println(numC);
		
		// 먼저 계산할 부분에 대해 괄호 필수!!
		numC = 10 + (3 * 10);
		System.out.println(numC);
		
		// 정수를 나누었을때, 소수점을 생략하지 않으려면
		double div = 10 / 3;
		System.out.println(div);
		
		div = 10 / 3.0;		// 정수 나누기 실수(double 타입)
		System.out.println(div);
		
		float divFloat = 10 / 3.0f;		// 정수 나누기 실수(float)
		System.out.println(divFloat);
		
		div = (double)10 / 3;	// 실수 나누기 정수
		System.out.println(div);
		
		div = 10 / (double)3;	// 정수 나누기 실수
		System.out.println(div);
		
		div = (double)(10 / 3);  // 정수 나누기 정수, 이후 실수로 변환
		System.out.println(div);
		
		double dVal = (double)numA / numB;
		System.out.println(dVal);
		
		float fVal = numA / (float)numB;
		System.out.println(fVal);
		
		System.out.println("\n========================\n");
		
		// % 나머지 연산자 자주 쓰는 경우
		intVar = 6;
		
		int remain = intVar % 2;
		System.out.println(remain);		
		// 2로 나눈 나머지가 0이면 짝수고, 1이면 홀수다.
		
		// 게시판 페이징 구현
		int totalCountGul = 336;	// 게시판에 글이 총 336개 있다.
		int showCountInOnePage = 15; // 한 페이지에서 보여줄 글의 수
		
		// 총 페이지의 수
		int countPage = totalCountGul / showCountInOnePage;
		// 마지막 페이지에 있는 글의 수
		int countLastPageGul = totalCountGul % showCountInOnePage;
		
		System.out.printf("현재 게시판에 총 %d개의 게시글이 있고 "+
				"한 페이지에 보여줄 글의 수가 %d개 일때, "
				+ "총 페이지의 수는 %d개이며 마지막 페이지에는 "
				+ "%d개의 글이 보여집니다.\n", totalCountGul, 
				showCountInOnePage, countPage, countLastPageGul);
		
		
		// 문자열을 더하자
		String subway = "반석";
		subway = subway + ", 지족";
		// String 타입에 대해 + 기호는 이어붙이기 수식이다.
		
		subway = "종점, " + subway;
		System.out.println(subway);
		
		subway += ", 노은";
		System.out.println(subway);
		
		System.out.println("\n=====================\n");
		
		numA = 10;
		numB = 3;
		numC = 10;
		
		boolean boolVal = numA > numB;
		System.out.println(boolVal);
		
		boolVal = numA < numB;
		System.out.println(boolVal);
		
		boolVal = numA >= numB;
		System.out.println(boolVal);
		
		boolVal = numA >= numC; // 10 >= 10
		System.out.println(boolVal);
		
		System.out.println(10 <= 3);
		// numA와 numC가 서로 같아야 true
		System.out.println(numA == numC);
		
		// numA와 numC가 서로 달라야 true
		System.out.println(numA != numC);	
		
		
		// 문자열이 서로 같은지 비교
		String ship = "배";
		String pear = "배";
		String stomach = new String("배");
		System.out.println(stomach);
		
		System.out.println(ship == pear);
		System.out.println(ship == stomach);
		
		// .equals(문자열)
		// 해당 문자열이 괄호안 문자열과 같다면 true, 틀리면 false
		System.out.println(ship.equals(stomach));
		
		// "배 "에서 trim()으로 공백이 제거된 후에
		// pear 와 같은지 비교합니다.
		System.out.println(pear.equals("배 ".trim()));
		
		// null 과 empty
		String strA = null;
		String strB;
		String strC = "";
		
		System.out.println(strA);
//		System.out.println(strB);
		System.out.println(strC);
		
		System.out.println(strA == null);
		
		// strA가 null이 아니라면 true 리턴
		System.out.println(strA != null);	
		
		// .isEmpty()
		// 해당 문자열이 empty면 true를 리턴
		System.out.println(strC.equals(""));
		System.out.println(strC.isEmpty());
		
		
		System.out.println("\n=====================\n");
		
		// 조건 연산자 (=삼항 연산자)
		
		strC = "";
		String strCIsEmpty = (strC.isEmpty()) ? "비었어요" : "뭐가있네요";
		
		System.out.println(strCIsEmpty);
		
		int intIsEmpty = (strC.isEmpty()) ? 100 : 9;
		System.out.println(intIsEmpty);
		
		// 이중 삼항 연산자
		int score = 85;
		
		// score가 90점보다 크면 grade는 A,
		// 80점보다 크면 grade는 B, 나머지는 C
		String grade = (score > 90) ? "A" : ((score > 80) ? "B" : "C");
		System.out.println(score + "점은 " + grade + "등급입니다.");
		
		System.out.println("\n=====================\n");
		
		// 논리 연산자
		
		strA = "";
		strB = "눈사람";
		
		// && 좌우 조건이 다 참이어야만 true, 
		// 둘 중 하나라도 거짓이면 false 리턴
		boolVal = strA.isEmpty() && strB.isEmpty();
		System.out.println(strA.isEmpty());
		System.out.println(strB.isEmpty());
		System.out.println(boolVal);
		
		boolVal = strA.isEmpty() && (strB.length() != 0);
		System.out.println(boolVal);
		
		// || 좌우 조건 중 하나라도 참이라면 true,
		// 둘 다 거짓이라면 false 리턴
		boolVal = strA.isEmpty() || strB.isEmpty();
		System.out.println(boolVal);
		
		strA = "";
		strB = "눈사람";
		strC = "배";
		
		boolVal = strA.isEmpty() && (strB.length() == 0) 
				&& strC.equals("배");
		
		System.out.println(boolVal);
		
		boolVal = strA.isEmpty() || ((strB.length() == 0) && strC.equals("배"));
		System.out.println(boolVal);
		
		// 논리 연산자를 쓰면 if문을 많이 만들지 않아도 된다.
		if(strA.isEmpty() || ((strB.length() == 0) && strC.equals("배"))) {
			System.out.println("참");
		}else {
			System.out.println("거짓");
		}
		
		// ! 는 boolean 타입의 값을 뒤집어준다.
		boolVal = !strA.isEmpty();
		System.out.println(boolVal);
		
		boolVal = true;
		System.out.println(!boolVal);
		
		System.out.println("\n=====================\n");
		
		// 비트 연산자
		int numTen = 10;	// 1010
		int numNine = 9;	// 1001
		
		System.out.println("& = " + (numTen & numNine));
		// 8은 이진수 하면 1000
		
		System.out.println("| = " + (numTen | numNine));
		// 11은 이진수 하면 1011
		
		System.out.println("^ = " + (numTen ^ numNine));
		// 0011 를 십진수로 바꾸면 3
		
		
	}
}
