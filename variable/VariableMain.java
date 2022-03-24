package lec02_variable_type;

public class VariableMain {

	public static void main(String[] args) {
		int money = 900;
		// 상수명 이름 짓기
		// 단어는 전부 대문자, 단어와 단어 사이는 언더바로 이어준다.
		final String NEXT_IT_ADDRESS = "대전광역시 중구 희영빌딩";
		
		System.out.println(NEXT_IT_ADDRESS);
		
		
		char charVal = 'a';
		System.out.println(charVal);
		
		// 변수를 선언하면서 값을 부여한다.
		// 값을 초기화한다(Initialization -> Init)
		int numOne = 1;
		System.out.println(numOne);
		
		// 변수를 선언만하고, 값을 부여하지 않을 수도 있다.
		int numTwo;		// 변수를 선언
		numTwo = 2;		// 변수에 값을 저장
		System.out.println(numTwo);	// 변수 사용
		
		// 변수의 다중 선언
		int numThree, numFour;
		numThree = 3;
		numFour = 4;
		
		// 변수의 다중 선언은 되지만, 값을 넣어주면서 선언할 수는 없다.
//		int numFive, numSix = 5, 6;
		
		System.out.println("=======================================");
		
		// 문자열(String)
		// String 은 클래스이므로 다양한 함수를 내장하고 있다.
		String fruits = "Apple, Banana, Carrot";
		
		System.out.println(fruits);
		// .length()
		// 해당 문자열의 길이를 리턴
		System.out.println(fruits.length());
		
		// .charAt(인덱스)
		// 인덱스는 문자열에서 몇 번째에 해당하는 숫자를 말한다.
		// 인덱스는 0부터 시작
		// 해당 문자열에서 인덱스에 해당하는 문자(char)를 리턴
		System.out.println(fruits.charAt(0));
		
		// .indexOf(문자열)
		// 해당 문자열에서 괄호 안에 있는 문자의 인덱스 위치를 리턴
		// 해당 문자열을 포함하지 않는다면 -1를 리턴
		System.out.println(fruits.indexOf("Banana"));
		System.out.println(fruits.indexOf("banana"));
		
		// .substring(시작 인덱스, 끝 인덱스)
		// 해당 문자열을 시작 인덱스에서 끝 인덱스 전까지 자릅니다.
		System.out.println(fruits.substring(7, 14));	// 인덱스 7부터 13까지를 리턴한다.
		
		// .replace(바뀔 문자열, 바꾸고 싶은 문자열)
		// 해당 문자열에서 바뀔 문자열을 바꾸고 싶은 문자열로 교체
		System.out.println(fruits.replace("Carrot", "Coconut"));
		System.out.println(fruits.replace(" ", ""));
		
		// .trim()
		// 해당 문자열의 양끝에 존재하는 모든 공백을 제거해준다.
		String strWorld = "      The World  !!  ";
		System.out.println(strWorld.trim());
		
		// .toUpperCase()
		// 해당 문자열에 존재하는 알파벳들을 전부 대문자로 바꿔준다.
		System.out.println(fruits.toUpperCase());
		System.out.println(fruits.toLowerCase());	// 전부 소문자로 바꿔준다.
		
		// .concat(문자열)
		// 해당 문자열에 괄호 안에 있는 문자열 뒤에 붙인다.
		System.out.println(fruits.concat(", DDangkong"));
		System.out.println(fruits + ", DDangkong");
		
		// String은 참조 타입이므로 null 값을 가질 수 있다.
		String anything = null;
		String notthing = "";	// 둘 다 빈 값이지만, 데이터가 없는 null과 빈 데이터인
								// "" (empty)는 엄연히 다르다.
		System.out.println(anything);
		System.out.println(notthing);
		
		System.out.println("=============================");
		
		System.out.println(fruits);
		
		fruits = fruits.substring(7);	// 괄호안의 인덱스 전까지 해당 문자열을 자른다.
		System.out.println(fruits);
		
		// byte 는 -128부터 127까지만 담을 수 있데!!
		byte byteNum = 127;
		byteNum++;				// 1을 더한다.
		byteNum += 1; 	// 1을 더한다.
		System.out.println(byteNum);	// -128부터 127이기 때문에 127에서 1을 더하면
										// -128이 되고, 거기서 1을 더했으니 -127이 나온다.
		
		// 형 변환(Casting)
		int intVal = 17;
		double doubVal = 1.24;
		
		// int 곱하기 double 은 double 타입으로 자동 형변환이 된다.
		double doubMulVal = intVal * doubVal;	
		// (타입) (값) 을 이용하여 강제 형변환이 가능하다.
		int intMulVal = (int) (intVal * doubVal);
		
		System.out.println(doubMulVal);		// 값이 실수로 잘 나옵니다.
		System.out.println(intMulVal);		// 강제로 int(정수)로 형변환을 하니 소수가 사라집니다.
		
		float floatMulVal = intVal * 1.24f;
		System.out.println(floatMulVal);
		
		long longVar = 20000L;
		int intVar = 20000;		// L 붙이기 싫어서 int를 많이 쓴다.
		
		float fVar = 0.111f;
		double dVar = 0.222;	// f 붙이기 싫어서 double을 많이 쓴다.
		
		
		// 강제 형변환 (숫자 <-> 문자열)
		String countingStar = "17";
		String countStar = countingStar + 1;
		
		System.out.println(countStar);
		
		// 문자열을 숫자로 형변환
		// Integer.parseInt(문자열)
		int intCountStar = Integer.parseInt(countingStar);	// 문자열 "17"이 정수 17로 잘 바뀌었다면
		intCountStar = intCountStar + 1;	// 17 + 1 = 18
		System.out.println(intCountStar);
		
		// 숫자를 문자열로 형변환
		String strCountStar = Integer.toString(intCountStar);
		String strCountStar2 = intCountStar + "";	// 보통 숫자를 문자열로 바꿀때 많이 사용
		strCountStar = strCountStar + 1;
		strCountStar2 = strCountStar2 + 1;
		System.out.println(strCountStar);
		System.out.println(strCountStar2);
		
		
		String example = "2784";
		// 위의 example을 이용해서 2+7+8+4 = ? 결과를 출력하시오.		
		
		// example 문자열을 substring을 이용하여 한글자씩 자른다.
		// 각 글자들을 int 타입으로 변환하여 더한다.
		
		String str1 = example.substring(0, 1);	// "2"
		String str2 = example.substring(1, 2);	// "7"
		String str3 = example.substring(2, 3);	// "8"
		String str4 = example.substring(3, 4);	// "4"
		
		int int1 = Integer.parseInt(str1);
		int int2 = Integer.parseInt(str2);
		int int3 = Integer.parseInt(str3);
		int int4 = Integer.parseInt(str4);
		
		int result = int1 + int2 + int3 + int4;
		System.out.println("결과는 : " + result);
		
		
		
	}

}
