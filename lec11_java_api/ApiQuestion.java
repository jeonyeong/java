package lec11_java_api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import lec09_class.UtilClass;

public class ApiQuestion {
	public static void main(String[] args) throws ParseException {
		// 다양한 날짜 포멧 적용
		// 시계방 놀러갔더니 다양한 디지털 시계들이 있군요.
		// 1. 2022/03/17 14:17:20
		// 2. 2022-03-17 오후 02:17:20
		// 3. 2022.03.17 PM 02:17:20
		// 4. 목 오후 02:17:20
		// 5. 목요일 14:17:20
		// 6. Thu PM 02:17:20
		// 이 디지털 시계들을 여러분도 만드실 수 있으면 참 좋겠죠.
		
		SimpleDateFormat sdf 
			= new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		String strDay = sdf.format(date);
		System.out.println("1. " + strDay);
		
		SimpleDateFormat sdf2
			= new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
		strDay = sdf2.format(date);
		System.out.println("2. " + strDay);
		
		SimpleDateFormat sdf3
			= new SimpleDateFormat("yyyy.MM.dd a hh:mm:ss", Locale.US);
		strDay = sdf3.format(date);
		System.out.println("3. " + strDay);
		
		SimpleDateFormat sdf4
			= new SimpleDateFormat("yyMMdd E hh:mm:ss");
		strDay = sdf4.format(date);
		System.out.println("4. " + strDay);
		
		SimpleDateFormat sdf5
			= new SimpleDateFormat("E요일 HH:mm:ss");
		strDay = sdf5.format(date);
		System.out.println("5. " + strDay);
		
		SimpleDateFormat sdf6
			= new SimpleDateFormat("E a hh:mm:ss", Locale.ENGLISH);
		strDay = sdf6.format(date);
		System.out.println("6. " + strDay);
		
		// 현재 미국 날짜는?
		SimpleDateFormat sdf7
			= new SimpleDateFormat("yyyy/MM/dd E a hh:mm:ss", Locale.ENGLISH);
		TimeZone timeZone = TimeZone.getTimeZone("America/New_York");
		sdf7.setTimeZone(timeZone);
		strDay = sdf7.format(date);
		System.out.println("7. " + strDay);
		
		System.out.println("\n=============================\n");
		
		// 디데이 계산기
		// 파라미터로 날짜를 입력받으면(String, yyyy.MM.dd 포멧)
		// 오늘날짜와 해당 날짜의 차이를 비교하여
		// 차이 리턴 (10일 남았으면 10, 10일 지났으면 -10)
		
		// 2022.04.01 개원기념일 몇일 남았는지 (= 15)
		// 2022.02.14 처음 온 날부터 몇일 지났는지 (= -31)
		System.out.println("개원기념일까지 D-day = " 
				+ calDday("2022.04.01"));
		System.out.println("학원 처음 온날부터 " 
				+ calDday("2022.02.14") + "일 지남");
		
		System.out.println("\n==============================\n");
		
		// 달력을 만들어주는 클래스를 만들어 주세요.
		ApiCalendar apiCal = new ApiCalendar(2022, 6);
		apiCal.drawCal();
		
		System.out.println("\n==============================\n");
		
		// 유니크 ID 생성
		// Guest2022031823938437598438 님 환영합니다.
		// 6자리의 랜덤 숫자를 이용해서 만든다?
		
		// yyyyMMddHHmmssSSS + 랜덤수 6
		System.out.println("Guest" + UtilClass.makeUniqueId() + "님 환영합니다.");
		System.out.println("Guest" + UtilClass.makeUniqueId() + "님 환영합니다.");
		System.out.println("Guest" + UtilClass.makeUniqueId() + "님 환영합니다.");
		
		
	} // main 끝
	
	
	
	
	static long calDday(String dday) throws ParseException {
		// 오늘 날짜 구하기
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		Date today = new Date();	// 2022.03.17 16:33:30 세팅된 객체
		// 2022.03.18 00:00:00 - 2022.03.17 16:33:30 = 8시간(X)
		// 2022.03.17 00:00:00 만들어 주어야 날짜(일) 계산 용이
		String strToday = sdf.format(today);
		// strToday = 2022.03.17 문자열
		Date sdfToday = sdf.parse(strToday);
		// sdfTday = 2022.03.17 00:00:00 세팅된 Date 객체
		
		Date inputDay = sdf.parse(dday);
		
		long diffMillSec = inputDay.getTime() - sdfToday.getTime();
		long diffDay = diffMillSec / (1000 * 60 * 60 * 24);
		
		return diffDay;
	}
	
	
	
}
