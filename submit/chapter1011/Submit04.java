package submit.chapter1011;

import java.util.regex.Pattern;

public class Submit04 {

	public static void main(String[] args) {

		String example = "a3b2c4d1a2h4";
		String result = "";
		String regex = "[0-9]*";

		for (int i = 0; i < example.length(); i++) {
			String strNum = example.substring(i, i + 1);
			if (Pattern.matches(regex, strNum)) {
				int intNum = Integer.parseInt(strNum);
				for (int j = 0; j < intNum; j++) {
					result += example.substring(i - 1, i);
				}
			}
		}
		System.out.println(result);
	}

}
