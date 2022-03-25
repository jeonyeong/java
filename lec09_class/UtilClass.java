package lec09_class;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * 유용한 함수들을 제공하는 클래스
 */
public class UtilClass {
	
	public static String owner = "만든이: 정찬웅";
	
	/**
	 * 입력한 실수를 소수 n번째 자리로 리턴해주는 함수
	 * @param douNum 반올림 하고 싶은 실수
	 * @param n 반올림 하고 싶은 자리
	 * @return 반올림된 실수
	 */
	public static double round(double douNum, int n) {
		int one = 1;
		for(int i = 0; i < n; i++) {
			one *= 10;
		}
		double mul = douNum * one;
		long longNum = Math.round(mul);
		double douVal = (double)longNum / one;
		
		return douVal;
	}
	
	/**
	 * 연봉 액수(int, 단위: 만)가 들어오면 이쁜
	 * 문자열(String)로 바꿔서 리턴해주는 함수
	 */
	public static String formatSalary(int salary) {
		if(salary < 10000) {	// 연봉 1억 미만
			String str = salary + "";
			return str.substring(0, 1) + "," 
					+ str.substring(1) + "만원";
		}else {
			int ouk = salary/10000;
			int remain = salary%10000;
			
			if(remain < 1000) {
				return ouk + "억 " + remain + "만원";
			}
			
			String temp = remain + "";
			return ouk + "억 " + temp.substring(0,1)
				+ "," + temp.substring(1) + "만원";
		}
	}
	
	/**
	 * int 리스트를 넣으면, 각 요소들의 총합을 리턴하는 함수
	 */
	public static int sumIntList(ArrayList<Integer> intList) {
		int sum = 0;
		for(int i = 0; i < intList.size(); i++) {
			sum += intList.get(i);
		}
		
		return sum;
	}
	
	/**
	 * 50% 확률로 true/false를 리턴해주는 함수
	 */
	public static boolean banban() {
		// randInt는 0또는 1을 가지는 변수
		int randInt = (int)(Math.random() * 2);
		
//		if(randInt == 1) {
//			return true;
//		}
		
		return (randInt == 1);
	}
	
	/**
	 * 유니크한 아이디 만들어주는 메소드
	 */
	public static String makeUniqueId() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		Date date = new Date();
		String uniqueId = sdf.format(date);
		
		for(int i = 0; i < 6; i++) {
			int randInt = (int)(Math.random()*10);
			uniqueId += randInt;
		}
		
		return uniqueId;
	}
	
}
