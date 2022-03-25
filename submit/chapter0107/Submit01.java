package submit;

public class Submit01 {
	public static void main(String[] args) {
		// 1. 정수(int), 실수(double), 문자열(String) 타입의 변수들을
		// 선언하여 각각 출력하시오.
		int intVal = 10;
		double doubleVal = 3.141592;
		String strVal = "프리스타일";
		
		System.out.println("\n=========== 1번 문제 ============\n");
		System.out.println("정수형 타입의 변수: " + intVal);
		System.out.println("실수형 타입의 변수: " + doubleVal);
		System.out.println("문자열 타입의 변수: " + strVal);
		
		// 2. 위에서 선언한 변수들의 값을 교체하시오.
		intVal = 12;
		doubleVal = 3.14;
		strVal = "랩배틀";
		
		System.out.println("\n=========== 2번 문제 ============\n");
		System.out.println("정수형 타입의 변수: " + intVal);
		System.out.println("실수형 타입의 변수: " + doubleVal);
		System.out.println("문자열 타입의 변수: " + strVal);
		
		// 3. 위에서 선언한 정수형 타입의 변수를 실수로 형변환하여
		// 출력하시오.
		double douVal = (double) intVal;
		System.out.println("\n=========== 3번 문제 ============\n");
		System.out.println("정수형 타입을 실수로 변환: " + douVal);
		
		// 4. 위에서 선언한 실수형 타입의 변수를 정수로 형변환하여
		// 출력하시오.
		int intVar = (int) doubleVal;
		System.out.println("\n=========== 4번 문제 ============\n");
		System.out.println("실수형 타입을 정수로 변환: " + intVar);
		
		// 5. 위에서 선언한 정수형 타입의 변수를 문자열로 형변환하여
		// 출력하시오.
		String strVar = intVal + "";
		System.out.println("\n=========== 5번 문제 ============\n");
		System.out.println("정수형 타입을 문자열로 변환: " + strVar);
		
		// 6. 정수로 이루어진 문자열 타입의 변수를 정수로 형변환하여
		// 출력하시오.
		int intValue = Integer.parseInt("12423");
		System.out.println("\n=========== 6번 문제 ============\n");
		System.out.println("문자열 타입을 정수로 변환: " + intValue);
		
		// 7. 정수(int), 실수(double), 문자열(String) 타입의 상수들을
		// 선언한 후 콘솔창에 각각 출력하시오.
		final int intFinal = 112;
		final double doubFinal = 112.112;
		final String strFinal = "경찰서";
		System.out.println("\n=========== 7번 문제 ============\n");
		System.out.println("정수형 타입의 상수: " + intFinal);
		System.out.println("실수형 타입의 상수: " + doubFinal);
		System.out.println("문자열 타입의 상수: " + strFinal);
		
	}
}
