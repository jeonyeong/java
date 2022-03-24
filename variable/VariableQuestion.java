package lec02_variable_type;

public class VariableQuestion {
	public static void main(String[] args) {
		
		String enigma = "너오구늘리뭐너먹구지리";
		
		// 너, 구, 리 를 제거해서 출력해보세요.
		// .replace
		String tryOne = enigma.replace("너", "");
		System.out.println("1차 암호 해독[\"너\" 제거]: " + tryOne);
		String tryTwo = tryOne.replace("구", "");
		String tryThree = tryTwo.replace("리", "");
		
		System.out.println("해독완료!! " + tryThree);
		
		// step2. 한줄로 처리해서 출력해보세요.
		enigma = enigma.replace("너", "").replace("구", "")
				.replace("리", "");
		
		System.out.println(enigma);
	}
}
