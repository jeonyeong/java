package submit;

public class Submit08 {
	public static void main(String[] args) {
		// 다음 문자열을 중복된 숫자와 함께 표기하시오
		// aaabbcdddaeefffffgg -> a3b2c1d3a1e2f5g2

		String example = "aaabbcdddaeefffffgg";

		String word = "";
		String before = "";
		String result = "";
		int cnt = 1;

		for (int i = 0; i < example.length(); i++) {

			if (i == 0) {
				before = example.substring(i, i + 1);
				continue;
			}

			word = example.substring(i, i + 1);

			if (word.equals(before)) {
				cnt++;
				before = example.substring(i, i + 1);
			} else {
				result += before + cnt;
				cnt = 1;
				before = example.substring(i, i + 1);
			}

			if (i == example.length() - 1) {
				result += before + cnt;
			}
		}

		System.out.println(example + " -> " + result);

		
		example = "aaabbcdddaeefffffgg";
		String anw = "";
		
//		example += " ";

		cnt = 1;
		for (int i = 0; i < example.length() - 1; i++) {
			if (example.charAt(i) == example.charAt(i + 1)) {
				cnt++;
			} else {
				anw += example.charAt(i) + (cnt + "");
				cnt = 1;
			}
			
			if(i == example.length() - 2) {
				anw += example.charAt(i) + (cnt + "");
			}
		}
		System.out.println(anw);

	}
}
